/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.parser.fileparser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juanito
 */
public class FileParserAppTest {

    /**
     * Test of parser method, of class FileParserApp.
     */
    @Test
    public void testParserCSV() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("parser");

        File sourceFile = File.createTempFile("Test", ".csv");
        sourceFile.deleteOnExit();
        String content = ""
                + "This,is,a,test\n"
                + "red,green,blue\n";
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(content);
        writer.close();
        List<List<String>> expResult = new ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(sourceFile.getAbsolutePath()));
        allLines.forEach(line -> expResult.add(Arrays.asList(line.split(","))));

        FileParserApp instance = new FileParserApp(sourceFile.getAbsolutePath());
        List<List<String>> result = instance.parser();
        assertEquals(expResult, result);
    }

}
