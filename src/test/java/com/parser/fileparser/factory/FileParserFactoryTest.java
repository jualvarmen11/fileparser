/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.parser.fileparser.factory;

import com.parser.api.FileParser;
import com.parser.api.abstractfactory.FileParserAbstractFactory;
import com.parser.config.CSVFileParser;
import com.parser.config.PIPELINEFileParser;
import com.parser.config.SPACEFileParser;
import com.parser.config.TABFileParser;
import com.parser.config.abstractfactory.CSVFileParserFactory;
import com.parser.config.abstractfactory.PIPELINEFileParserFactory;
import com.parser.config.abstractfactory.SPACEFileParserFactory;
import com.parser.config.abstractfactory.TABFileParserFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juanito
 */
public class FileParserFactoryTest {

    /**
     * Test of getFileParser method, of class FileParserFactory.
     */
    @Test
    public void testGetFileParserCSV() {
        System.out.println("getFileParser");
        FileParserAbstractFactory factory = new CSVFileParserFactory();
        FileParser expResult = new CSVFileParser();
        FileParser result = FileParserFactory.getFileParser(factory);
        assertEquals(expResult.getClass(), result.getClass());

    }

    /**
     * Test of getFileParser method, of class FileParserFactory.
     */
    @Test
    public void testGetFileParserTAB() {
        System.out.println("getFileParser");
        FileParserAbstractFactory factory = new TABFileParserFactory();
        FileParser expResult = new TABFileParser();
        FileParser result = FileParserFactory.getFileParser(factory);
        assertEquals(expResult.getClass(), result.getClass());

    }

    /**
     * Test of getFileParser method, of class FileParserFactory.
     */
    @Test
    public void testGetFileParserSPACE() {
        System.out.println("getFileParser");
        FileParserAbstractFactory factory = new SPACEFileParserFactory();
        FileParser expResult = new SPACEFileParser();
        FileParser result = FileParserFactory.getFileParser(factory);
        assertEquals(expResult.getClass(), result.getClass());

    }

    /**
     * Test of getFileParser method, of class FileParserFactory.
     */
    @Test
    public void testGetFileParserPIPELINE() {
        System.out.println("getFileParser");
        FileParserAbstractFactory factory = new PIPELINEFileParserFactory();
        FileParser expResult = new PIPELINEFileParser();
        FileParser result = FileParserFactory.getFileParser(factory);
        assertEquals(expResult.getClass(), result.getClass());

    }

}
