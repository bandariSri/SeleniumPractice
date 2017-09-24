package com.selenium.practice;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScript {
	public static void main(String args[]){
		System.setProperty("webdriver.ie.driver","F:/Drivers/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.navigate().to("https://www.google.co.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(js.executeScript( "return document.title;").toString());
		System.out.println(js.executeScript( "return document.domain;").toString());
		driver.close();
		driver.quit();
	}

}
