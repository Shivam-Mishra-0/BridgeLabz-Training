package com.jtest.dateformatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DateFormatterTest {

    @Test
    public void testValidDates() {
        assertEquals("25-01-2026", DateFormatter.formatDate("2026-01-25"));
        assertEquals("01-12-2025", DateFormatter.formatDate("2025-12-01"));
    }

    @Test
    public void testInvalidDates() {
        assertNull(DateFormatter.formatDate("2026/01/25")); // wrong format
        assertNull(DateFormatter.formatDate("25-01-2026")); // wrong input format
        assertNull(DateFormatter.formatDate("invalid"));    // invalid string
        assertNull(DateFormatter.formatDate(null));         // null input
    }
}

