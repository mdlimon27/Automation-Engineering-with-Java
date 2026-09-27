import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase_101 {
	public static void main(String[] Args) throws Throwable {
		System.out.println("Md Shahajada Imran");
		
		Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.bing.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Optional Steps (Script will click on the button if appears during runtime else ignore clicking which insures avoiding NoSuchElement exception.)
	    List<WebElement> aButtons=driver.findElements(By.cssSelector("#b_siprov2_cn_65187 > div > div.b_siprov2_hdr > button"));
	    if (aButtons.size()>0) {
	    	aButtons.get(0).click();
	    }
	    
	    driver.findElement(By.name("q")).sendKeys("Md Shahajada Imran");
	    driver.findElement(By.cssSelector("#sb_form > a.cdxConv_slsboxl.dimmed > div > div")).click();
	    
	    //closing the 2nd tab
	    var tabs=driver.getWindowHandles().toArray();
	    driver.switchTo().window(tabs[1].toString());
	    driver.close();
	    
	    //pointing to the 1st tab
	    tabs=driver.getWindowHandles().toArray();
	    driver.switchTo().window(tabs[0].toString());
	    
	    //Clicking on the ImageCreator link
	    driver.findElement(By.linkText("Image creator")).click();
	    
	    //Pointing to the 2nd tab
	    tabs=driver.getWindowHandles().toArray();
	    driver.switchTo().window(tabs[1].toString());
	    
	    driver.findElement(By.name("gmc__textarea")).sendKeys("A Rose in a garder in bangladesh");
	    driver.findElement(By.className("gmbtn__btn")).click();
	    Thread.sleep(70000);
	    
	}

}
