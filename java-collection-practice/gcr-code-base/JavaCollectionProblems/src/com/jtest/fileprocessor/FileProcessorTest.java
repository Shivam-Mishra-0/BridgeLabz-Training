package com.jtest.fileprocessor;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {

    private final String testFile = "testfile.txt";
    private final String content = "Hello, JUnit!";

    @Test
    public void testWriteAndReadFile() throws IOException {
        
        FileProcessor.writeToFile(testFile, content);

     
        assertTrue(Files.exists(Path.of(testFile)), "File should exist after writing");

       
        String readContent = FileProcessor.readFromFile(testFile);
        assertEquals(content, readContent, "Content read should match content written");

        Files.deleteIfExists(Path.of(testFile));
    }

    @Test
    public void testReadFileIOException() {
       
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }

    @Test
    public void testWriteFileIOException() {
        assertThrows(IOException.class, () -> FileProcessor.writeToFile("/", "data"));
    }
}

