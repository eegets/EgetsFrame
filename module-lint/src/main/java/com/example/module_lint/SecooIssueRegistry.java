package com.example.module_lint;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.ApiKt;
import com.android.tools.lint.detector.api.Issue;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * @author wanghaiyang
 * 自定义lint添加
 */
@SuppressWarnings("UnstableApiUsage")
public class SecooIssueRegistry extends IssueRegistry {

    @NotNull
    @Override
    public List<Issue> getIssues() {
        return Arrays.asList(
                LogDetector.ISSUE);
    }

    @Override
    public int getApi() {
        return ApiKt.CURRENT_API;
    }


    @Override
    public int getMinApi() { //兼容3.1  不兼容自定义一直不检测 必须加上这个检测了
        return 1;
    }
}
