package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\POMclass\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	
	public void selectByVisibleText(WebElement element, String value) {
		Select se = new Select(element);
		se.selectByVisibleText(value);
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	
}