package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CONSTRUCTORMETHOD {
	ChromeDriver dr;

	public CONSTRUCTORMETHOD(ChromeDriver dr){
		this.dr = dr;
	}
	
	public ChromeDriver getChromeDriver() {
		
		return dr;
	}

	public void myWait(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}


	public void navigateToWebsite(String url) {
		dr.get(url);
	}

	public String getPageTitle() {

		String actualTitle = dr.getTitle();
		return actualTitle;
	}

	public String getPageUrl() {
		String actualUrl = dr.getCurrentUrl();
		return actualUrl;
	}

	public boolean verifyElementDisplay(By by) {
		boolean result = dr.findElement(by).isDisplayed();
		return result;
	}

	public String typeOnElementByWebElement(WebElement element, String value) {
		//dr.findElement(By.id("")).sendKeys("");
		element.sendKeys(value);
		return value;
	}
	
	public void typeOnElementByLocator(By by, String value) {
		//dr.findElement(By.id("")).sendKeys("");
		dr.findElement(by).sendKeys(value);
	}
	
	
	public void clickOnAnyElement(By locator) {

		// dr.findElement(By.id("dfvwevf")).click();
		dr.findElement(locator).click();
	}

	public void clickByXpath(String xpathValue) {
		dr.findElement(By.xpath(xpathValue)).click();
	}
	
	public void clickByCss(String cssSelector) {
		dr.findElement(By.cssSelector(cssSelector)).click();
	}
	
	public void clickById(String id) {
		dr.findElement(By.id(id)).click();
	}
	
//	public void clickFromListOfElements(By locator, int index) {
//		List<WebElement> ele = dr.findElements(locator);
//		
//	}
//	
//	public void getListofElementsAndClick(List<WebElement> ele, int index) {
//		//dr.findElements(By.xpath("")).get(3).click();
//		ele.get(index).click();
//	}
	
	public void getAnyText(By locator) {
		String text = dr.findElement(locator).getText();
		System.out.println(text);
	}

	public void getAttributeValue(By by, String attributeName) {
		//dr.findElement(By.id("")).getAttribute("name");
		String value = dr.findElement(by).getAttribute(attributeName);
		System.out.println(attributeName + " : " + value);
	}

}
