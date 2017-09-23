package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium1 {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.setProperty("webdriver.ie.driver", "F:/Drivers/IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get("https://www.google.co.in");
		driver1.manage().window().maximize();
		driver1.close();
		driver1.quit();
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.close();
		driver2.close();
		

		

	}

}
