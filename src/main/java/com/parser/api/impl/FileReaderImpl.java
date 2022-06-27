/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parser.api.impl;

import com.parser.api.FileParser;
import com.parser.api.FileReader;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juanito
 */
public class FileReaderImpl implements FileReader {

    private Path getPathFromFileName(String fileName) {
        return Paths.get(fileName);
    }

    private List<String> getLines(String fileName) throws IOException {
        return Files.readAllLines(getPathFromFileName(fileName));
    }

    @Override
    public List<String> readFile(String fileName) {
        try {
            return getLines(fileName);
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }
}
