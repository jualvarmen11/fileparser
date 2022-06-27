/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parser.config;

import com.parser.api.FileParser;
import com.parser.api.impl.FileReaderImpl;
import com.parser.api.impl.FileTokenizerImpl;
import java.util.List;

/**
 *
 * @author Juanito
 */
public class CSVFileParser extends FileParser {

    public CSVFileParser() {
        super(",");
        reader = new FileReaderImpl();
        tokenizer = new FileTokenizerImpl();
    }

    @Override
    public List<List<String>> parser(String fileName) {
        return isFileExtensionCompatible(this.getClass().getSimpleName(),fileName) ? tokenizer.tokenizer(reader.readFile(fileName), delimiter) : null;
    }



}
