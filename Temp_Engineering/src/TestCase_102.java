

import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase_102 {
	public static void main(String[] Args) throws Throwable {
		System.out.println("Md Shahajada Imran");
		
		//close previously opened edge browser which opened by Selenium Webdriver script.
		Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.bing.com/");
		Thread.sleep(7000);
		
		//Optional Steps (Script will click on the button if appears during runtime else ignore clicking which insures avoiding NoSuchElement exception.)
	    List<WebElement> aButtons=driver.findElements(By.cssSelector("#b_siprov2_cn_65187 > div > div.b_siprov2_hdr > button"));
	    if (aButtons.size()>0) {
	    	aButtons.get(0).click();
	    }
				
		driver.findElement(By.name("q")).sendKeys("Md Shahajada Imran");
		driver.findElement(By.cssSelector("#sb_form > a.cdxConv_slsboxl.dimmed > div > div")).click();
		
		//dealing 2 tabs of the Browser.
		var tabs=driver.getWindowHandles().toArray(); 
		driver.switchTo().window(tabs[0].toString()); //Selecting the 1st tab
		driver.close(); //close 1st tab out of 2 open tabs. 
		
		tabs=driver.getWindowHandles().toArray(); 
		driver.switchTo().window(tabs[0].toString()); //Selecting the remaining tab
		driver.manage().window().maximize(); //maximize the browser.
		
		//Finding out how many links present in the Edge Browser.
		var aLinks=driver.findElements(By.tagName("a"));
		System.out.println("There are "+aLinks.size()+" web elements which has <a> tag in this edge Browser.");
		int count=0;
		for (var e : aLinks) {
			String href=e.getAttribute("href");
			
			if(href !=null && !href.isEmpty()) {
				count++;
			}			
			//System.out.println(e.getText());
		}
		
		System.out.println("There are "+count+" Links in this Edge Browser.");
	}

}
