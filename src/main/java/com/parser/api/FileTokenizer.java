/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.parser.api;

import java.util.List;

/**
 *
 * @author Juanito
 */
public interface FileTokenizer {

    public abstract List<List<String>> tokenizer(List<String> allLines, String delimiter);
}
