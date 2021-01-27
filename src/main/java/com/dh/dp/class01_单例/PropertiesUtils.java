package com.dh.dp.class01_单例;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtils {
    private static final PropertiesUtils INSTANCE = new PropertiesUtils();
    private final Properties properties;
    PropertiesUtils() {
        properties = new Properties();
        String path = "D:/data/conf/_db_cfg.properties";
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static PropertiesUtils getInstance() {
        return INSTANCE;
    }
    public String getValue(String key) {
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(PropertiesUtils.getInstance().getValue("jdbcDriverClassName"));
    }
}
