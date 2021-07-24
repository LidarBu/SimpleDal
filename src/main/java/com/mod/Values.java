package com.mod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Values {

    @Autowired
    private Environment environment;
    private static String description = " ";

    @PostConstruct
    public void setValues() {
        description = environment.getProperty("ods.description");
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Values.description = description;
    }
}
