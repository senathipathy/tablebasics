package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBasic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\workspace\\manoj\\TableBasic\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icaionlineregistration.org/Admin_Module/login.aspx");
		Thread.sleep(1000);
		WebElement button=driver.findElement(By.xpath("//a[contains(text(),'Register as Faculty')]"));
		button.click();
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.id("ddlPOU"));
		Select s =new Select(ele1);
		s.selectByIndex(36);
		WebElement ele2=driver.findElement(By.id("ddlSalutation"));
		Select s1 =new Select(ele2);
		s1.selectByIndex(2);
		WebElement ele3=driver.findElement(By.id("txt_name"));
		ele3.sendKeys("manoj");
		WebElement ele4=driver.findElement(By.id("txt_lastname"));
		ele4.sendKeys("kumar");
/*		WebElement ele5=driver.findElement(By.id("txt_dob"));
		Select s2=new Select(ele5);
		List<WebElement>ele6=s.getOptions();
		for(int i=0;i<ele6.size();i++) {
			WebElement ele7=ele6.get(i);
			String date=ele7.getText();
			s2.selectByVisibleText(date);    */
	    WebElement ele5=driver.findElement(By.id("Txt_add"));
	    ele5.sendKeys("Anna nagar 600040");
	    Thread.sleep(100);
	    WebElement ele6=driver.findElement(By.id("ddl_state"));
		Select s2 =new Select(ele6);
		s2.selectByIndex(31);
		WebElement ele7=driver.findElement(By.xpath("(//select[@name='ddl_City'])"));
		Select s3 =new Select(ele7);
		s3.selectByVisibleText("COIMBATORE");
		driver.findElement(By.id("txt_mail")).sendKeys("manoj123.b@gmail.com");
		driver.findElement(By.id("txt_pin")).sendKeys("600040");
		driver.findElement(By.id("txt_uname")).sendKeys("mano2912");
		driver.findElement(By.id("txt_mbl")).sendKeys("9003612567");
		driver.findElement(By.id("txt_pswd")).sendKeys("sample!123");
		
		driver.findElement(By.id("txt_Repswd")).sendKeys("sample!123");
		driver.findElement(By.id("//input[@id='Button1']")).click();
	    
	    
	    
	
		
			
		}
		
	}


