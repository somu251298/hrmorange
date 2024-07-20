package com.hrmorange.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority=1)
	public void verifyRadiobutton()
	{
		driver.findElement(By.xpath("//input[@id='benzradio']")).click();
	}
	@Test(priority=2)
	public void verifyclick()
	{
		driver.findElement(By.xpath("//input[@id='hondacheck']")).click();
	}
	@Test(priority=3)
	public void verify()
	{
		WebElement ab=driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
		Select op=new Select(ab);
		op.selectByValue("orange");
	}
	@Test(priority=4)
	public void mouseover()
	{
		WebElement ab=driver.findElement(By.xpath("//button[@id='mousehover']"));
		String ac=ab.getCssValue("background-color");
		System.out.println(ac);
	}
	
	
	
	
	
	
	
	
	
	
}
