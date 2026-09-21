package com.QualityAssurace.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase_101 {
	public static void main(String[] Args) throws Throwable {
		System.out.println("Md Shahajada Imran");
		
		Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
		
		//Creating an Instance of EdgeDriver class with WebDriver Interface.
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.mortgagecalculator.org");
		Thread.sleep(5);
		driver.manage().window().maximize();
		Thread.sleep(3);
		
		//Filling-up information in edit fields
		driver.findElement(By.name("param[homevalue]")).sendKeys("400000");
		driver.findElement(By.name("param[downpayment]")).sendKeys("100000");
		driver.findElement(By.name("param[principal]")).sendKeys("300000");
		driver.findElement(By.name("param[interest_rate]")).sendKeys("6.7");
		Select select; //Variable declaration
		select=new Select(driver.findElement(By.name("param[start_month]")));
		select.selectByVisibleText("Dec");
		
		driver.findElement(By.name("param[term]")).sendKeys("15");
		driver.findElement(By.name("param[start_year]")).sendKeys("2026");
		driver.findElement(By.name("param[property_tax]")).sendKeys("10000");
		driver.findElement(By.name("param[pmi]")).sendKeys(".6");
		driver.findElement(By.name("param[hoi]")).sendKeys("2000");
		driver.findElement(By.name("param[hoa]")).sendKeys("700");
		select=new Select(driver.findElement(By.name("param[milserve]")));
		select.selectByVisibleText("FHA");
		
		//Clicking the Calculate button
		driver.findElement(By.name("cal")).click();
		Thread.sleep(7);
		
		//Inserting a Checkpoint
		String vOutput=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println("Monthly Payment is "+vOutput);
		if(vOutput.equals("$4,346.424")) {
			System.out.println("Test Passed");
		}else {
			System.err.println("Test Failed");
			return; //exits current method. In this case, Exits the main method or Script stops execution.
		}
		System.out.println("This line will not print if test fails");
	}

}
