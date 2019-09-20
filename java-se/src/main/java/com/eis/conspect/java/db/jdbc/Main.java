package com.eis.conspect.java.db.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = CreatingConnection.getConnection();
        ProcessingRequest.getInfoById(connection, "1");
    }
}