package com.jtest.databaseconnection;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseConnectionTest {

    private static DatabaseConnection db; 

    @Before
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @After
    public void tearDown() {
        db.disconnect();
    }

    @Test
    public void testConnectionEstablished() {
        assertTrue(db.isConnected(), "Database should be connected before test");
    }

    @Test
    public void testConnectionClosedAfterTest() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected");
    }
}

