package sel_assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Devanshi_Selenium_assignment2d_Spain {
	public static void main(String[] args)
	{

	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	WebDriver dr = new FirefoxDriver();
	 dr.get("https://www.olay.es/es-es");
	 dr.manage().window().maximize();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[2]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_imgfemale\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[firstname]\"]")).sendKeys("devanshi");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[lastname]\"]")).sendKeys("Chaudhary");
      dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_labelgrs_consumer[secondary_lastname]\"]")).sendKeys("xyyzz");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[emails][0][address]\"]")).sendKeys("devanshi0114@gmail.com");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][password]\"]")).sendKeys("devanshi.14");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][confirm]\"]")).sendKeys("devanshi.14");
	 ((JavascriptExecutor)dr).executeScript("scroll(0,400)");
	  dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][day]\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][day]\"]/option[2]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][month]\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][month]\"]/option[2]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][year]\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][year]\"]/option[2]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][year]\"]")).click();	
dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[phones][0][fulltelephonenumber]\"]")).sendKeys("+347060213919");
		 ((JavascriptExecutor)dr).executeScript("scroll(0,800)");
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_ctl74\"]")).click();
	 dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_submit\"]")).click();
	}

}
