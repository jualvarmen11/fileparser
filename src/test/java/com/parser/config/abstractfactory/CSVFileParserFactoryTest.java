/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.parser.config.abstractfactory;

import com.parser.api.FileParser;
import com.parser.config.CSVFileParser;
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
public class CSVFileParserFactoryTest {

    /**
     * Test of createFileParser method, of class CSVFileParserFactory.
     */
    @Test
    public void testCreateFileParser() {
        System.out.println("createFileParser");
        CSVFileParserFactory instance = new CSVFileParserFactory();
        FileParser expResult = new CSVFileParser();
        FileParser result = instance.createFileParser();
        assertEquals(expResult.getClass(), result.getClass());
    }

}
