package com.eis.conspect.java.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static com.eis.conspect.utils.properties.PropertiesHelper.readProperties;

public class CreatingConnection {

    private static final String DB_PROPERTIES_PATH = "src/main/java/com/eis/conspect/java/db/jdbc/source/props.properties";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Properties dbProperties = readProperties(DB_PROPERTIES_PATH);

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbProperties.getProperty("url"),
                    dbProperties.getProperty("login"),
                    dbProperties.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}