package com.yxy.utils;

import org.junit.Test;

import java.sql.Connection;

public class JDBCUtilsTest {

    @Test
    public void getConnection() {
        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
    }

    @Test
    public void close() {
    }
}