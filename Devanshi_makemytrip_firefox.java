package sele_assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Devanshi_makemytrip_firefox {
	public static void main(String[] args) throws InterruptedException
	{
		 //Launch Makemytrip website
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		 dr.get("https://www.makemytrip.com/");
		 dr.manage().window().maximize();
		
		 //selecting roundtrip
		 
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]")).click();
		 
		 //selecting source and destination
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")).click();
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Dehradun");
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).click();
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Chennai");
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")).click();
		 
		 //departure date and return date
		 
		 //dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label")).click();
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[3]/div/p")).click();
		// dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label")).click();
		 //dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/label")).click();
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[5]/div/p")).click();
		 //dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/label")).click();
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		 
		 dr.findElement(By.xpath("//*[@id=\"sorter_btn_onward\"]")).click();
		 Thread.sleep(1000);
		 dr.findElement(By.xpath("//*[@id=\"left-side--wrapper\"]/div/div/div[1]/div[1]/div/div[2]/ul/li[1]/a")).click();
		
		 //printing the lowest price on console
		 
		// WebElement text = dr.findElement(By.xpath("//*[@id=\"ow-domrt-jrny\"]/div/div[1]/label/div[2]/div[3]/div"));
	     //System.out.print(text.getText());
		 //String str = dr.findElement(By.xpath("//*[@id=\"ow-domrt-jrny\"]/div/div[1]/label/div[2]/div[3]/div/p/span")).getText();
		 //System.out.print(str);
		 
		 //booking the ticket and opening of review pageS
		 dr.findElement(By.xpath("//*[@id=\"left-side--wrapper\"]/div/div/div[4]/div/div[1]/div/div[3]/div[2]")).click();
		 
		 
		 
	}

}
