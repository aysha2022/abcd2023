package com.bit.test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiseIF {
	WebDriver dr;
//@Test
public void classWork() {
	//if i is divisible by 3pnt hi,if i is divisible by 5pnt hello,3&5 pnt hi hello in 1 to 100
	for ( int i = 1; i <= 100 ; i++ ) {
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("Hi Hello");
		} else if (i % 3 == 0) {
			System.out.println("Hi");
		} else if (i % 5 == 0) {
			System.out.println("Hello");
		} else {
			System.out.println(i);
		}
	
	}
		for(int i=1; i<=50; i++) {
			if(i%3 == 0&& i%5 ==0) {
				System.out.println("yahoo");
			}
			else if(i% 3==0) {
				System.out.println("you");
			}
			else if(i%5==0) {
				System.out.println("&me");
			}
			else {
				System.out.println(i);
			}
		}
	}
/*WebDriver dr;
	void hovourOverOnMenus() {
		int menuSize = dr.findElements(By.xpath("//ol[@class='Cw6Gc']/li")).size();
		for(int i=1;i<=menuSize;i++) {
			dr.findElement(By.xpath("//ol[@class='Cw6Gc']/li["+i+"]")).click();//co{"+ncatination+"}
		}
		void hovourOverOnMenus( List<webelement>elements) {
			int menuSize = .size();
			for(int i=1;i<=menuSize;i++) {
				dr.findElement(By.xpath("//ol[@class='Cw6Gc']/li["+i+"]")).click();//co{"+ncatination+"}
		
		
	}
	
	
//ol[@class='Cw6Gc']/li*/

//dr= new ChromeDriver();
void hoveroverOnMenus() {

	int menuSize = dr.findElements(By.xpath("//ol[@class='Cw6Gc']/li")).size();

	for (int i = 1; i <= menuSize; i++) {

		dr.findElement(By.xpath("//ol[@class='Cw6Gc']/li[" + i + "]")).click();
	}
}
void hoveroverOnMenus(List<WebElement> elements) {

	int menuSize = elements.size();

	for (int i = 1; i <= menuSize; i++) {

		elements.get(i).click();

	}
}
@Test
public void m1() {
	hoveroverOnMenus();



}

}