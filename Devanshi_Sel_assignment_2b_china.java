package sel_assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Devanshi_Sel_assignment_2b_china {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver();
	 dr.get("https://www.olay.com.cn/");
	 dr.manage().window().maximize();
	 
	
	 dr.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[1]")).click();
     dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_username\"]")).sendKeys("devanshi0114@gmail.com");
     dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_password\"]")).sendKeys("devanshi.14");
     dr.findElement(By.xpath("//*[@id=\"phdesktopbody_0_SIGN IN\"]")).click();
}
}