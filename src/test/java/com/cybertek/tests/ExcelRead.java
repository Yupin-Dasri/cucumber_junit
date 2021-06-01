package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void excel_read_test() throws IOException {

        String excelPath = "SampleData.xlsx";

        FileInputStream fileInputStream = new FileInputStream(excelPath);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Employees");

        String test = sheet.getRow(2).getCell(2).toString();

        System.out.println(test);

    }


}
