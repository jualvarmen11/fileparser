/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parser.fileparser.factory;

import com.parser.api.FileParser;
import com.parser.api.abstractfactory.FileParserAbstractFactory;

/**
 *
 * @author Juanito
 */
public class FileParserFactory {
    public static FileParser getFileParser(FileParserAbstractFactory factory){
        return factory.createFileParser();
        
    }
}
