
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase_103 {
	public static void main(String[] Args) throws Throwable {
		System.out.println("Md Shahajada Imran");
		
		//close previously opened edge browser which opened by Selenium Webdriver script.
		Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
		
		Runnable r=()->{
			try {
				myTest();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		//Running multiple browsers at the same time
		Thread t=new Thread(r); //First Browser
		Thread t1=new Thread(r); //2nd Browser
		t.start();
		//t.join(); //wait until first browser done
		t1.start();
		
	}
	
	
	//Test No: 103
	//Test Name: Users are able to search in bing search engine
	//Input: No Argument
	//Output: None
	//Created by: Md Shahajada Imran
	public static void myTest() throws Throwable {	
				
				WebDriver driver=new EdgeDriver();
				driver.get("https://www.bing.com/");				
				
				//Optional Steps (Script will click on the button if appears during runtime else ignore clicking which insures avoiding NoSuchElement exception.)
			    List<WebElement> aButtons=driver.findElements(By.cssSelector("#b_siprov2_cn_65187 > div > div.b_siprov2_hdr > button"));
			    if (aButtons.size()>0) {
			    	aButtons.get(0).click();
			    }
			    
			    driver.findElement(By.name("q")).sendKeys("Md Shahajada Imran");
				try {
					driver.findElement(By.xpath("//*[@id=\"search_icon\"]/svg")).click();
				} catch (Exception e) {
					
				}
				try {
					driver.findElement(By.id("b_icon_spyglass")).click();
				} catch (Exception e) {
				
				}
				driver.quit();
	}

}
