package net.daemonumbra.gradle.lazy;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class LazyGradle implements Plugin<Project>
{
    @Override
    public void apply(Project project)
    {
        project.getExtensions().create("PropertiesLoader", PropertiesLoader.class, project);
    }
}
