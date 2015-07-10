package com.ecare.seleniumtrainning;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		WebElement wb=driver.findElement(By.xpath("//select[@id='Carlist']"));
		
	List<WebElement> list=driver.findElements(By.xpath("//select[@id='Carlist']/option"));
	
		
		Select sel=new Select(wb);
		
		sel.selectByVisibleText("Toyota");
		sel.selectByIndex(list.size()-1);
		//sel.selectByIndex(3);
		//sel.selectByValue("Opel Car");
		WebElement defualt=sel.getFirstSelectedOption();
		System.out.println(defualt.getText());
		List<WebElement> lt=sel.getOptions();
		Iterator it=lt.iterator();
		/*while(it.hasNext()){
			System.out.println((it.next()).toString());	
		}
		*/
		
		/*for (WebElement a:lt){
			System.out.println(a.getText());
		}
		*/
		
		for (int i=0;i<lt.size()-1;i++){
			System.out.println(lt.get(i).getText());
		}
		
		//System.out.println("default selected"+sel.getFirstSelectedOption().getText());
		
		
		//working with multiple select box
		/*WebElement wb=driver.findElement(By.xpath("//select[@name='FromLB']"));
		Select sel=new Select(wb);
		System.out.println("check weblist i multiple "+sel.isMultiple());
		if (sel.isMultiple()){
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		driver.findElement(By.xpath("//input[@value='->']")).click();
		}*/
		
		/*sel.deselectByIndex(22);
		sel.deselectAll();
		sel.deselectByValue("sdcsd");
		sel.deselectByVisibleText("");
		sel.getAllSelectedOptions();
		*/
		
	//driver.close();
		
		
		
		
	}

}
