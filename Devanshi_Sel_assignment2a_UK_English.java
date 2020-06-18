package sel_assignment_2;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;


public class Devanshi_Sel_assignment2a_UK_English {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver();
	 dr.get("https://www.olay.co.uk/en-gb");
	 dr.manage().window().maximize();
	 
	 // for registering - already registered
	 
	// dr.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[2]")).click();
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[emails][0][address]\"]")).sendKeys("devanshi0114@gmail.com");
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][password]\"]")).sendKeys("devanshi.14");
    // dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][confirm]\"]")).sendKeys("devanshi.14");
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][day]\"]")).click();
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][day]\"]/option[15]")).click();
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][month]\"]")).click();
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][month]\"]/option[2]")).click();
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][year]\"]")).click();
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][year]\"]/option[10]")).click();
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][year]\"]")).click();
	// ((JavascriptExecutor)dr).executeScript("scroll(0,400)");
	// dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_submit\"]")).click();
	 
	 // for signIn
	 dr.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[1]")).click();
     dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_username\"]")).sendKeys("devanshi0114@gmail.com");
     dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_password\"]")).sendKeys("devanshi.14");
     dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_SIGN IN\"]")).click();
	} 
}
