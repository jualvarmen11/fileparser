/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.parser.api.abstractfactory;

import com.parser.api.FileParser;
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
public class FileParserAbstractFactoryTest {
    

    /**
     * Test of createFileParser method, of class FileParserAbstractFactory.
     */
    @Test
    public void testCreateFileParser() {
        System.out.println("createFileParser");
        FileParserAbstractFactory instance = new FileParserAbstractFactoryImpl();
        FileParser expResult = null;
        FileParser result = instance.createFileParser();
        assertEquals(expResult, result);
    }

    public class FileParserAbstractFactoryImpl implements FileParserAbstractFactory {

        public FileParser createFileParser() {
            return null;
        }
    }
    
}
