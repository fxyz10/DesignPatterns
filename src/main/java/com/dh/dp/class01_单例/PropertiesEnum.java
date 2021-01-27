package com.dh.dp.class01_单例;

import java.io.FileInputStream;
import java.util.Properties;

public enum PropertiesEnum {
    INSTANCE;
    private final Properties properties;
    PropertiesEnum() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("D:/data/conf/_db_cfg.properties");
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getValue(String key) {
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(PropertiesEnum.INSTANCE.getValue("jdbcDriverClassName"));
    }
}
