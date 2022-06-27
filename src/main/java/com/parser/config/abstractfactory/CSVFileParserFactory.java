/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parser.config.abstractfactory;

import com.parser.api.FileParser;
import com.parser.api.abstractfactory.FileParserAbstractFactory;
import com.parser.config.CSVFileParser;

/**
 *
 * @author Juanito
 */
public class CSVFileParserFactory implements FileParserAbstractFactory{

    @Override
    public FileParser createFileParser() {
        return new CSVFileParser();
    }
    
    
    
}
