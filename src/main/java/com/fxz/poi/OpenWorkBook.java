package com.fxz.poi;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-02-07 17:48:03
 */
public class OpenWorkBook {

    public static void main(String[] args) throws Exception {
        File file = new File("openworkbook.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        if (file.isFile() && file.exists()) {
            System.out.println("openworkbook.xlsx open successfully!");
        } else {
            System.out.println("error to open openworkbook.xlsx file!");
        }
    }

}
