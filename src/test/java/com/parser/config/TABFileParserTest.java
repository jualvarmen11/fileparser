/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.parser.config;

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
public class TABFileParserTest {

    /**
     * Test of parser method, of class TABFileParser.
     */
    @Test
    public void testParser() throws IOException {
        System.out.println("parser");
        File sourceFile = File.createTempFile("Test", ".tab");
        sourceFile.deleteOnExit();
        String content = ""
                + "This\tis\ta\ttest\n"
                + "red\tgreen\tblue\n";
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(content);
        writer.close();
        TABFileParser instance = new TABFileParser();
        List<List<String>> expResult = new ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(sourceFile.getAbsolutePath()));
        allLines.forEach(line -> expResult.add(Arrays.asList(line.split("\t"))));
        List<List<String>> result = instance.parser(sourceFile.getAbsolutePath());
        assertEquals(expResult, result);
    }

}
