package sel_assignment_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Devanshi_Sel_assignment_2c_Germany {
	
	public static void main(String[] args)
	{

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver();
	 dr.get("https://www.olaz.de/de-de");
	 dr.manage().window().maximize();
	 
	 //for registering
	 
	 dr.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[2]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_imgfemale\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[firstname]\"]")).sendKeys("devanshi");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[lastname]\"]")).sendKeys("Chaudhary");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[emails][0][address]\"]")).sendKeys("devanshi0114@gmail.com");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][password]\"]")).sendKeys("devanshi.14");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][confirm]\"]")).sendKeys("devanshi.14");
	 ((JavascriptExecutor)dr).executeScript("scroll(0,400)");
	  dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Container\"]/div[6]/div[3]/select")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Container\"]/div[6]/div[3]/select/option[15]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Container\"]/div[6]/div[4]/select")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Container\"]/div[6]/div[4]/select/option[2]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Container\"]/div[6]/div[5]/select")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Container\"]/div[6]/div[5]/select/option[10]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Container\"]/div[6]/div[5]/select")).click();	
	  dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_labelgrs_account[addresses][0][country]\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_labelgrs_account[addresses][0][country]\"]/option[2]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_labelgrs_account[addresses][0][country]\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_labelgrs_account[addresses][0][line1]\"]")).sendKeys("XYzzzz");
	 ((JavascriptExecutor)dr).executeScript("scroll(0,400)");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[addresses][0][postalarea]\"]")).sendKeys("XYzz788zz");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_labelgrs_account[addresses][0][city]\"]")).sendKeys("12344");
		 ((JavascriptExecutor)dr).executeScript("scroll(0,800)");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_ctl104\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_submit\"]")).click();
	
	 }
}