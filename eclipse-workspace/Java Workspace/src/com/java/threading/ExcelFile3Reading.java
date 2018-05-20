package com.java.threading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile3Reading implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\bhanu\\Downloads\\Softwares\\ReadExcel.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fin);
			Sheet sheet = wb.getSheet("Sheet1");
			System.out.println("---------------------------------");
			for (int i = 14; i <21; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++) {
					System.out.print(row.getCell(j).getStringCellValue() + "|| ");

				}
				System.out.println();

			}
			fin.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
