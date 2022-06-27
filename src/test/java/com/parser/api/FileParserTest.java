/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.parser.api;

import com.parser.api.*;
import com.parser.config.CSVFileParser;
import com.parser.config.PIPELINEFileParser;
import com.parser.config.SPACEFileParser;
import com.parser.config.TABFileParser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juanito
 */
public class FileParserTest {

    /**
     * Test of parser method, of class FileParser.
     */
    @Test
    public void testParserSPACE() throws IOException {
        System.out.println("parser");
        File sourceFile = File.createTempFile("Test", ".space");
        sourceFile.deleteOnExit();
        String content = ""
                + "This is a test\n"
                + "red green blue\n";
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(content);
        writer.close();
        List<List<String>> expResult = new ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(sourceFile.getAbsolutePath()));
        allLines.forEach(line -> expResult.add(Arrays.asList(line.split(" "))));
        FileParser instance = new SPACEFileParser();
        List<List<String>> result = instance.parser(sourceFile.getAbsolutePath());
        assertEquals(expResult, result);
    }

    /**
     * Test of parser method, of class FileParser.
     */
    @Test
    public void testParserCSV() throws IOException {
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
        FileParser instance = new CSVFileParser();
        List<List<String>> result = instance.parser(sourceFile.getAbsolutePath());
        assertEquals(expResult, result);
    }

    /**
     * Test of parser method, of class FileParser.
     */
    @Test
    public void testParserTAB() throws IOException {
        System.out.println("parser");
        File sourceFile = File.createTempFile("Test", ".tab");
        sourceFile.deleteOnExit();
        String content = ""
                + "This\tis\ta\ttest\n"
                + "red\tgreen\tblue\n";
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(content);
        writer.close();
        List<List<String>> expResult = new ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(sourceFile.getAbsolutePath()));
        allLines.forEach(line -> expResult.add(Arrays.asList(line.split("\t"))));
        FileParser instance = new TABFileParser();
        List<List<String>> result = instance.parser(sourceFile.getAbsolutePath());
        assertEquals(expResult, result);
    }

    /**
     * Test of parser method, of class FileParser.
     */
    @Test
    public void testParserPIPELINE() throws IOException {
        System.out.println("parser");
        File sourceFile = File.createTempFile("Test", ".pipeline");
        sourceFile.deleteOnExit();
        String content = ""
                + "This|is|a|test\n"
                + "red|green|blue\n";
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(content);
        writer.close();
        List<List<String>> expResult = new ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(sourceFile.getAbsolutePath()));
        allLines.forEach(line -> expResult.add(Arrays.asList(line.split("|"))));
        FileParser instance = new PIPELINEFileParser();
        List<List<String>> result = instance.parser(sourceFile.getAbsolutePath());
        assertEquals(expResult, result);
    }

    /**
     * Test of getUpperCaseFileExtension method, of class FileParser.
     */
    @Test
    public void testGetUpperCaseFileExtension() {
        System.out.println("getUpperCaseFileExtension");
        String fileName = "Test.csv";
        FileParser instance = new FileParserImpl();
        String expResult = "CSV";
        String result = instance.getUpperCaseFileExtension(fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of isFileExtensionCompatible method, of class FileParser.
     */
    @Test
    public void testIsFileExtensionCompatible() {
        System.out.println("isFileExtensionCompatible");
        String className = FileParserImpl.class.getSimpleName();
        String fileName = "Test.csv";
        FileParser instance = new FileParserImpl();
        boolean expResult = false;
        boolean result = instance.isFileExtensionCompatible(className, fileName);
        assertEquals(expResult, result);
    }

    public class FileParserImpl extends FileParser {

        public FileParserImpl() {
            super("");
        }

        @Override
        public List<List<String>> parser(String fileName) {
            return null;
        }

    }
}
