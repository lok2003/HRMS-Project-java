package com.HRmanagementsystem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Placeholder test class.
 * Place this file at:
 *   Human Resource Management/src/test/java/com/HRmanagementsystem/AppTest.java
 *
 * Add more test classes in this same package as your project grows.
 */
public class AppTest {

    @Test
    public void testApplicationLoads() {
        // Basic sanity check — ensures the test pipeline runs end-to-end.
        // Replace with real unit tests for your servlets and business logic.
        assertTrue("Application should load", true);
    }

    @Test
    public void testSampleCalculation() {
        // Example: test a simple utility method.
        int result = 2 + 2;
        assertEquals("Basic math should work", 4, result);
    }
}