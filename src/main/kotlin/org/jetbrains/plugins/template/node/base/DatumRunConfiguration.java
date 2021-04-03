package org.jetbrains.plugins.template.node.base;

import com.intellij.execution.configurations.RunConfiguration;
import org.jetbrains.annotations.NotNull;

public interface DatumRunConfiguration extends RunConfiguration {
    @NotNull
    DatumCommandLineRunnerParameters getRunnerParameters();
}
