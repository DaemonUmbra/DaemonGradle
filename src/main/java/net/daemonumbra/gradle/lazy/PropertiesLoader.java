package net.daemonumbra.gradle.lazy;

import org.gradle.api.Project;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

public class PropertiesLoader
{
    private static Project project;

    public PropertiesLoader(Project projectIn){
        project = projectIn;
    }

    public static void loadProperties(HashMap<Object, Object> properties){
        properties.forEach((key, value)-> project.getExtensions().getExtraProperties().set((String)key, value));
    }

    public static void loadProperties(Hashtable<Object, Object> properties)
    {
        properties.forEach((key, value)-> project.getExtensions().getExtraProperties().set((String)key, value));
    }

    public static void loadProperties(File propertiesFile) throws IOException
        {
            Properties Props = new Properties();
            Props.load(new FileReader(propertiesFile));
            loadProperties(Props);
        }

        public static void loadProperties(String propertiesFile) throws IOException
        {
            loadProperties(new File(propertiesFile));
        }
}
