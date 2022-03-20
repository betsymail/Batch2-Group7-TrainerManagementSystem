package com.TrainerManagementSystem.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static      XSSFWorkbook excelWBook; 
    private static      XSSFSheet    excelWSheet; 
   

    
   public static String getCellDataTrainer(int RowNum, int ColNum) throws IOException {
      
    
	   FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources" + "/Testdata.xlsx");
	   excelWBook = new XSSFWorkbook(ExcelFile);
       excelWSheet = excelWBook.getSheetAt(0);
       return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();

   }
   public static String getCellDataTrainerInt(int RowNum, int ColNum) throws IOException {
	      
	    
	   FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources" + "/Testdata.xlsx");
	   excelWBook = new XSSFWorkbook(ExcelFile);
       excelWSheet = excelWBook.getSheetAt(0);
       return excelWSheet.getRow(RowNum).getCell(ColNum).getRawValue();

   }
   
   public static String getCellDataAdmin(int RowNum, int ColNum) throws IOException {
	      
	    
	   FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources" + "/Testdata.xlsx");
	   excelWBook = new XSSFWorkbook(ExcelFile);
       excelWSheet = excelWBook.getSheetAt(1);
       return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();

   }
   public static String getCellDataAdminInt(int RowNum, int ColNum) throws IOException {
	      
	    
	   FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources" + "/Testdata.xlsx");
	   excelWBook = new XSSFWorkbook(ExcelFile);
       excelWSheet = excelWBook.getSheetAt(1);
       return excelWSheet.getRow(RowNum).getCell(ColNum).getRawValue();

   }
   public static String getCellDataSignup(int RowNum, int ColNum) throws IOException {
	      
	    
	   FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources" + "/Testdata.xlsx");
	   excelWBook = new XSSFWorkbook(ExcelFile);
       excelWSheet = excelWBook.getSheetAt(2);
       return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();

   }
   public static String getCellDataSignupNumeric(int RowNum, int ColNum) throws IOException {
	      
	    
	   FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources" + "/Testdata.xlsx");
	   excelWBook = new XSSFWorkbook(ExcelFile);
       excelWSheet = excelWBook.getSheetAt(2);
       return excelWSheet.getRow(RowNum).getCell(ColNum).getRawValue();

   }
   }
