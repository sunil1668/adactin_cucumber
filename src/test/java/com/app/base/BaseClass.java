package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	public static void loadDriver(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void impWait()
	{
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	public static WebElement findElement(By by)
	{
		return driver.findElement(by);
	}
	
	public static WebElement findelementobject(WebElement element)
	{
		return element;
		
	}
	
	public static void sendData(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	
	public static void clickData(WebElement element)
	{
		element.click();
	}
	
	public static String properties(String data) throws IOException
	{
		FileReader file = new FileReader(new File("C:\\Users\\rajit\\eclipse-workspace\\"
				+ "adactin_cucumber\\src\\main\\resources\\Test.properties "));
		Properties prop = new Properties();
		prop.load(file);
		String list = prop.getProperty(data);
		return list;
		
	}
  public static void dropselectvisibletext(WebElement element, String data)
  {
	  Select obj = new Select(element);
	  obj.selectByVisibleText(data);
	  
  }
  public static void dropselectbyindex(WebElement element, int data)
  {
	  Select obj = new Select(element);
	  obj.selectByIndex(data);
	  
  }
  
  public static String Exceldata(String sheetname, int row, int col) throws IOException
  {
	  String value ="null";
	  
	  FileInputStream f = new FileInputStream(new File("C:\\Users\\rajit\\eclipse-workspace\\"
	  		+ "adactin_cucumber\\Excel\\Excel.xlsx"));
	  
	  @SuppressWarnings("resource")
	Workbook work = new XSSFWorkbook(f);
	  Sheet sheet = work.getSheet(sheetname);
	  Row rows = sheet.getRow(row);
	  Cell cell = rows.getCell(col);
	  
	  CellType celltype =cell.getCellType();
	  if(celltype==CellType.STRING)
	  {
		value= cell.getStringCellValue();
	  }
	  else if(celltype==CellType.NUMERIC)
	  {
		  
		  if(DateUtil.isCellDateFormatted(cell))
				  {
			  Date date = cell.getDateCellValue();
			  SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
				 value= sf.format(date);
				 System.out.println(value);
				 return value;
				  }
		
	  }
	  else
	  {
		    double d = cell.getNumericCellValue();
		    value = String.valueOf(d);
		    return value;		    
	  }
	return value;  
  }
  
	public static void waiting() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	
	public static void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	public static void explicitwait()
	{
		WebDriverWait wait = new  WebDriverWait(driver,20);
		Alert element = wait.until(ExpectedConditions.alertIsPresent());
	}
 	
}

