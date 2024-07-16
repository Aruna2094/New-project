package org.baseclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
      
	public static WebDriver driver;
	
	public static void openbrowser(String value) {
		if(value.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(value.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
		}
				}
	
	public static void urllaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	public static void findelement(String value, String attvalue  ) {
	    if(value.equalsIgnoreCase("id")) {
	    	driver.findElement(By.id(attvalue));
	    }
	    else if(value.equalsIgnoreCase("name")) {
	    	driver.findElement(By.name(attvalue));
	    }
	    else if(value.equalsIgnoreCase("classname")) {
	    	driver.findElement(By.className(attvalue));
	    }
	}     
	
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
    }
	public static void click(WebElement e) {
		e.click();
	}
	
	public static String getpropertyvalue(String key) throws IOException {
		Properties p=new Properties();
                 p.load(new FileReader("C:\\Users\\senthil\\eclipse-workspace\\AssesmentTrika\\src\\test\\resources\\datas\\data.properties"));
        return p.getProperty(key).toString();
	}
	
	
	
	
}
