package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream arquivo = new FileInputStream(new File("ARQUIVO.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
            XSSFSheet planilha = workbook.getSheetAt(0);
            for (Row linha : planilha) {
                for (Cell celula : linha) {
                    if (celula.getCellType() == CellType.NUMERIC) {
                        System.out.print(celula.getNumericCellValue() + "\t");
                    } else if (celula.getCellType() == CellType.STRING) {
                        System.out.print(celula.getStringCellValue() + "\t");
                    }
                }
                System.out.println();
            }
            arquivo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
