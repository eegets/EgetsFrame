package com.example.module_lint;

import com.android.tools.lint.client.api.UElementHandler;
import com.android.tools.lint.detector.api.Category;
import com.android.tools.lint.detector.api.Detector;
import com.android.tools.lint.detector.api.Implementation;
import com.android.tools.lint.detector.api.Issue;
import com.android.tools.lint.detector.api.JavaContext;
import com.android.tools.lint.detector.api.Scope;
import com.android.tools.lint.detector.api.Severity;
import com.intellij.psi.PsiMethod;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.uast.UCallExpression;
import org.jetbrains.uast.UElement;
import org.jetbrains.uast.util.UastExpressionUtils;

import java.util.Collections;
import java.util.List;

/**
 * Created by wanghaiyang
 */
@SuppressWarnings("UnstableApiUsage")
public class LogDetector extends Detector implements Detector.UastScanner {


    /**
     * id : 唯一值，应该能简短描述当前问题。利用Java注解或者XML属性进行屏蔽时，使用的就是这个id。
     * summary : 简短的总结，通常5-6个字符，描述问题而不是修复措施。
     * explanation : 完整的问题解释和修复建议。
     * category : 问题类别。详见下文详述部分。
     * priority : 优先级。1-10的数字，10为最重要/最严重。
     * severity : 严重级别：Fatal, Error, Warning, Informational, Ignore。
     * Implementation : 为Issue和Detector提供映射关系，Detector就是当前Detector。声明扫描检测的范围Scope，Scope用来描述Detector需要分析时需要考虑的文件集，包括：Resource文件或目录、Java文件、Class文件。
     */
    public static final Issue ISSUE = Issue.create(
            "LogUse",
            "避免使用Log/System.out.println",
            "使用LogUtils，防止在正式包打印log",
            Category.SECURITY, 5, Severity.ERROR,
            new Implementation(LogDetector.class, Scope.JAVA_FILE_SCOPE)
    );

    @Nullable
    @Override
    public List<Class<? extends UElement>> getApplicableUastTypes() {
        return Collections.singletonList(UCallExpression.class);
    }

    @Nullable
    @Override
    public UElementHandler createUastHandler(@NotNull JavaContext context) {
        return new LogHandler(context);
    }

    class LogHandler extends UElementHandler {

        private JavaContext context;

        LogHandler(JavaContext context) {
            this.context = context;
        }

        @Override
        public void visitCallExpression(@NotNull UCallExpression node) {
            if (!UastExpressionUtils.isMethodCall(node)) return;
            if (node.getReceiver() != null
                    && node.getMethodName() != null) {
                String methodName = node.getMethodName();
                if (methodName.equals("println")) {
                    context.report(ISSUE, node, context.getLocation(node),
                            "避免使用System.out.println，请使用LogUtils");
                }

                if (methodName.equals("i")
                        || methodName.equals("d")
                        || methodName.equals("e")
                        || methodName.equals("v")
                        || methodName.equals("w")
                        || methodName.equals("wtf")) {
                    PsiMethod method = node.resolve();
                    if (context.getEvaluator().isMemberInClass(method, "android.util.Log")) {
                        context.report(ISSUE,
                                node,
                                context.getLocation(node),
                                "\u21E2 避免使用Log，请使用LogUtils"
                        );
                    }
                }
            }
        }
    }
}
