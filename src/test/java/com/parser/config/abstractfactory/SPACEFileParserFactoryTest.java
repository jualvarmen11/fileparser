/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.parser.config.abstractfactory;

import com.parser.api.FileParser;
import com.parser.config.SPACEFileParser;
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
public class SPACEFileParserFactoryTest {

    /**
     * Test of createFileParser method, of class SPACEFileParserFactory.
     */
    @Test
    public void testCreateFileParser() {
        System.out.println("createFileParser");
        SPACEFileParserFactory instance = new SPACEFileParserFactory();
        FileParser expResult = new SPACEFileParser();
        FileParser result = instance.createFileParser();
        assertEquals(expResult.getClass(), result.getClass());
    }

}
