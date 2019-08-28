package com.Selenium.Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingXlsxFile {

	public String[] xlxsReturn() throws IOException {

		int i = 0;
		String value[] = new String[8];
		FileInputStream excelFile = new FileInputStream(
				"D:\\new\\eclipse-workspace\\AutomationTesting\\Orangehrmlocators.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIt = sheet.rowIterator();
		while (rowIt.hasNext()) {
			Row row = rowIt.next();

			Iterator<Cell> cellIt = row.cellIterator();
			while (cellIt.hasNext()) {
				Cell cell = cellIt.next();
				// System.out.println(cell.toString());
				
				value[i] = cell.toString();
				i++;

			}
			// System.out.println();
		}
		return value;

	}
}
