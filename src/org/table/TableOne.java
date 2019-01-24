package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\workspace\\manoj\\TableBasic\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://toolsqa.com/automation-practice-table/");
        List<WebElement>rows=driver.findElements(By.tagName("tr"));
        for(int i=0;i<rows.size();i++) {
        	WebElement w=rows.get(i);
        	
             List<WebElement>data=w.findElements(By.tagName("td"));
         	for(int j=0;j<data.size();j++) {
       		WebElement x=data.get(j);
        	System.out.println(x.getText());
        		}
        	}
	}
	
}

        	
        	
        	