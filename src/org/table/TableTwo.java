package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\workspace\\manoj\\TableBasic\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://toolsqa.com/automation-practice-table/");
        List<WebElement>rows=driver.findElements(By.tagName("tr"));
        WebElement w=rows.get(0);
        List<WebElement>data=w.findElements(By.tagName("td"));
        for (WebElement webElement : data) {
        	System.out.println(webElement);
			
		}
        

	}

}
