package com.ecare.seleniumtrainning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 */
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
  String filepath="D:\\TestData.xls";
  FileInputStream fis = new FileInputStream(filepath);
  Workbook bk=WorkbookFactory.create(fis);
  Sheet sh=bk.getSheet("Sheet1");
  
  for (int i=1;i<sh.getLastRowNum();i++){
for(int j=0;j<=sh.getRow(1).getLastCellNum();j++){	  
	  
  Row row=sh.getRow(i);
  
  //String col1=row.getCell().getStringCellValue();
  //String col2=row.getCell(1).getStringCellValue();
  
  System.out.println("print  value of column"+j+"::::"+row.getCell(j).getStringCellValue());
  //System.out.println("second column value "+col2);
}
  }
	}

}
