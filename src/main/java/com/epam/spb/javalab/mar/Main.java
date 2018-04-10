package com.epam.spb.javalab.mar;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.io.InputStream;
import java.util.Properties;

@UtilityClass
public class Main {

    @SneakyThrows
    public static void main(String... args) {
        Properties properties = new Properties();
        try (InputStream resourceAsStream = Main.class.getResourceAsStream("/Prop.properties")) {
            properties.load(resourceAsStream);
        }
        String xyz = properties.getProperty("xyz", "1");
        System.out.println(xyz);
    }
}
