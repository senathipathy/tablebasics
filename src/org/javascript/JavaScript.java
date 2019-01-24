package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\workspace\\manoj\\TableBasic\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.greenstechnologys.com");
        Thread.sleep(1000);
        WebElement print=driver.findElement(By.xpath("//div/child::h1"));
       String style= print.getAttribute("style");
       System.out.println(style);
       String colour= print.getAttribute("colour");
       System.out.println(colour);
     /*    WebElement username=driver.findElement(By.id("email"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','manoj')",username);
        Thread.sleep(500);
        WebElement password=driver.findElement(By.xpath("(//h2)[9]"));
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        js1.executeScript("arguments[0].setAttribute('style', 'background: red')",password);
        Thread.sleep(500);
    /*  WebElement login=driver.findElement(By.id("u_0_2"));
        JavascriptExecutor js2=(JavascriptExecutor)driver;
        js2.executeScript("arguments[0].click()",login);*/



	}

}
//js.executeScript("arguments[0].setAttribute('style', 'background: yellow')"
//(//h2)[9]