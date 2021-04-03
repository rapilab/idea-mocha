package org.jetbrains.plugins.template.node.base;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.refactoring.listeners.RefactoringElementListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DartRunConfigurationBase  extends LocatableConfigurationBase implements RefactoringListenerProvider, DatumRunConfiguration {
    protected DartRunConfigurationBase(@NotNull Project project, @NotNull ConfigurationFactory factory, @Nullable String name) {
        super(project, factory, name);
    }

    @Override
    public @Nullable RefactoringElementListener getRefactoringElementListener(PsiElement element) {
        return null;
    }

    @Override
    public @NotNull DatumCommandLineRunnerParameters getRunnerParameters() {
        return null;
    }

    @Override
    public @NotNull SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return null;
    }

    @Override
    public @Nullable RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
        return null;
    }
}
