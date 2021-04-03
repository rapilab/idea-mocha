package org.jetbrains.plugins.template.node;

import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.executors.DefaultDebugExecutor;
import com.intellij.execution.runners.GenericProgramRunner;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;

public class DatumRunner extends GenericProgramRunner {
    private static final Logger LOG = Logger.getInstance(DatumRunner.class.getName());

    @Override
    public @NotNull String getRunnerId() {
        return "Datum";
    }

    @Override
    public boolean canRun(@NotNull String executorId, @NotNull RunProfile profile) {
        return DefaultDebugExecutor.EXECUTOR_ID.equals(executorId)
//                &&
        ;
    }
}