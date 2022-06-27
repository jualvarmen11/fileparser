/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.parser.api;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Juanito
 */
public abstract class FileParser {

    protected final String delimiter;
    protected FileReader reader;
    protected FileTokenizer tokenizer;

    public FileParser(String delimiter) {
        this.delimiter = delimiter;
    }

    public abstract List<List<String>> parser(String fileName);

    protected String getUpperCaseFileExtension(String fileName) {
        return Optional.ofNullable(fileName).filter(f -> f.contains(".")).map(f -> f.substring(fileName.lastIndexOf(".") + 1)).orElse("").toUpperCase();
    }

    protected boolean isFileExtensionCompatible(String className, String fileName) {        
        return className.startsWith(getUpperCaseFileExtension(fileName));
    }

}
