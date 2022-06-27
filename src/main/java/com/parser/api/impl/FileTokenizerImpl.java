/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parser.api.impl;

import com.parser.api.FileTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Juanito
 */
public class FileTokenizerImpl implements FileTokenizer {

    @Override
    public List<List<String>> tokenizer(List<String> allLines, String delimiter) {
        List<List<String>> tokens = new ArrayList<>();
        allLines.forEach(line -> tokens.add(Arrays.asList(line.split(delimiter))));
        return tokens;
    }

}
