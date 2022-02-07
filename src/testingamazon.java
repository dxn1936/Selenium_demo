import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
public class testingamazon {

	public static void main(String[] args) {
		System.out.println("Inside GivenBrowser is open");
		System.setProperty("webdriver.opera.driver", "C:\\Users\\darsh\\Desktop\\operadriver_win64\\operadriver.exe" );
		WebDriver driver=new OperaDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
