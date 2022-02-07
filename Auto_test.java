import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
public class Auto_test {
public static void main(String args[])
{
	System.setProperty("webdriver.opera.driver", "C:\\Users\\darsh\\Desktop\\operadriver_win64\\operadriver.exe" );
	
	//amazon signin
	WebDriver driver=new OperaDriver();
	driver.get("https://www.amazon.in");
	driver.findElement(By.className("nav-line-1-container")).click();
	driver.findElement(By.id("ap_email")).sendKeys("darshannaik18598@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("12345");
	driver.findElement(By.id("signInSubmit")).click();
	try {
	Thread.sleep(8000);
	
}catch(InterruptedException e) {
	e.printStackTrace();
}
	//login successful
	System.out.println("login to amazon.in");
	//operation testing
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
	driver.findElement(By.id("nav-search-submit-button")).click();
}
}