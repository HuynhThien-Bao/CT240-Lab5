package com.ctu.lab5.exporter;

class CsvReader implements DocumentReader {
    @Override
    public String readContent(String filePath) {
        return "Content from CSV file: " + filePath;
    }
}

