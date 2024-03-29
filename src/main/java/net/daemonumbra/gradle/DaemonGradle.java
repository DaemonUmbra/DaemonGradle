package net.daemonumbra.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DaemonGradle implements Plugin<Project>
{
    @Override
    public void apply(Project project)
    {
        project.getExtensions().create("PropertiesLoader", PropertiesLoader.class, project);
    }
}
