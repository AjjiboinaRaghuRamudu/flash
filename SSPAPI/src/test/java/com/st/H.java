package com.st;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class H {

  // public static void main(String[] args) {
    	
    	@Test
    	public void click(){
    	
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://automationpractice.com/index.php";
        String tagName = "";
        
        driver.get(baseUrl);
        //tagName = driver.findElement(By.id("email")).getTagName();
        //System.out.println(tagName);
        
        
        
        
        
        
        System.out.println("pass");
        
        
      driver.close();
        System.exit(0);
}
	
	
}
