package com.QualityAssurace.Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumQA {
   public static void main(String[] Args) throws IOException, Throwable {
	   System.out.println("Md Shahajada Imran");
	   
	   //Close previously open edge browser by script
	   Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
	   
	   //creating an instance of EdgeDriver class where WebDriver interface is type
	   WebDriver driver=new EdgeDriver();
	   driver.get("https://www.google.com/"); //open edge browser and load google home page
	   
	   driver.findElement(By.name("q")).sendKeys("Md Shahajada Imran");
	   driver.findElement(By.name("btnK")).click();
	   
	  /* Thread.sleep(5); //Synchronization point (wait 5 seconds)
	   String vCapchaPageText=driver.findElement(By.xpath("/html/body/div[1]/div")).getText();
	   System.out.println(vCapchaPageText);
		
	   //Printing total number of characters exist in the CAPTCHA page
	   int vTextsInPage=vCapchaPageText.length();   
	   System.out.println("There are "+vTextsInPage+" charectters/letters in the CAPTCHA page");
   
	   //Getting the IP Address from the page
	   String[] myArray=vCapchaPageText.split("IP address:");
       System.out.println(myArray[1]);
       String[] myArray2=myArray[1].split("Time:");
       String IpAddress=myArray2[0];
       IpAddress=IpAddress.trim();
       System.out.println(IpAddress);*/
   }
}
