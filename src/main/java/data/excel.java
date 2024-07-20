package data;

import java.io.File;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel 
{

	File a;
	FileInputStream b;
	XSSFWorkbook c;
	XSSFSheet d;
	
	public excel(String excelpath)
	{
		try {
		a = new File(excelpath);
		b = new FileInputStream(a);
		c = new XSSFWorkbook(b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getsheet(String Sheetname, int row, int col)
	{
		d=c.getSheet(Sheetname);
		String h=d.getRow(row).getCell(col).getStringCellValue();
		return h;
		
	}
	public int getrow(String Sheetname)
	{
		d=c.getSheet(Sheetname);
		int a=d.getLastRowNum();
	    int	i=a+1;
		return i;
	}
	public int getcolumn(String Sheetname)
	{
		d=c.getSheet(Sheetname);
		short s=d.getRow(0).getLastCellNum();
		return s;
		
	}
	
}
