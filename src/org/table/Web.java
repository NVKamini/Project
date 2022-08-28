package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	//to print all content in table
	WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
	//to print even rows
	System.out.println("Even rows"+"\n"+"-------------");
	List<WebElement> even = table.findElements(By.xpath("//table[@id='customers']//tbody//tr[position()mod 2=1]"));
	for(int i=0;i<even.size();i++){
		WebElement row1 = even.get(i);
		String text1 = row1.getText();
		System.out.println(text1);
	}
	//to print all data
	System.out.println("\n"+"All Datas"+"\n"+"-------------");
	List<WebElement> list = table.findElements(By.tagName("tr"));
	for(int i=0;i<list.size();i++)
	{
		WebElement row = list.get(i);
		String text = row.getText();
		System.out.println(text);
	}
	
	
}
}

