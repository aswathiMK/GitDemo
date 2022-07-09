import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntrodution  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "E:/Work/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		String str=driver.getTitle();
		
		System.out.println(str);
		
		driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
		
		

	}

}
