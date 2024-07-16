package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;

public class Pageobj extends BaseClass {
	
	public static void login(String username,String password) {
		 sendkeys(driver.findElement(By.id("email")), username);
         sendkeys(driver.findElement(By.id("pass")), password);
	} 
         
     public static void submit()  {  
         click(driver.findElement(By.xpath("//button[@name='login']")));
	}
	
	

}
