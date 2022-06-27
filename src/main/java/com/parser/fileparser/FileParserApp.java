/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parser.fileparser;

import com.parser.api.FileParser;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juanito
 */
public class FileParserApp {

    private final FileParser fileParser;
    private final String fileName;

    /**
     * To execute main() through CLI use java -jar target/fileparser-1.0.jar FileName.ext
     */
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Please specifiy a file name!!!");
            } else {
                FileParserApp fileParserApp = new FileParserApp(args[0]);
                List<List<String>> lines = fileParserApp.parser();
                if (lines.size() != 0) {
                    lines.forEach(line -> System.out.println(line));
                } else {
                    System.out.println("The specified file does not exist!!!");
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.err.println("The file extension is not supported yet!!!");
        }
    }

    private Path getPathFromFileName(String fileName) {
        return Paths.get(fileName);
    }

    private boolean isValidFile(String fileName) {
        return Files.exists(getPathFromFileName(fileName));
    }

    public FileParserApp(String fileName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.fileName = fileName;
        this.fileParser = getFileParserInstance(getClassNameByExtension(getUpperCaseFileExtension(fileName)));
    }

    public List<List<String>> parser() {
        return fileParser.parser(fileName);
    }

    private Class getClassNameByExtension(String fileExtension) throws ClassNotFoundException {
        return Class.forName("com.parser.config" + "." + fileExtension + FileParser.class.getSimpleName());
    }

    private FileParser getFileParserInstance(Class className) throws InstantiationException, IllegalAccessException {
        return (FileParser) className.newInstance();
    }

    private String getUpperCaseFileExtension(String fileName) {
        return Optional.ofNullable(fileName).filter(f -> f.contains(".")).map(f -> f.substring(fileName.lastIndexOf(".") + 1)).orElse("").toUpperCase();
    }

}
