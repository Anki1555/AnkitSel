package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class basePage {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String mainWindow;
	FileOutputStream ops;
	File srcVen;
public basePage()
{
	File src= new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
	
	try {
		//ops = new FileOutputStream(srcVen);
		FileInputStream ip = new FileInputStream(src);
		prop = new Properties();
		prop.load(ip);
	}catch (Exception e) {
		System.out.println("Exception : "+ e.getMessage());
	}
}

public static void initialization()
{
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
	}
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	mainWindow = driver.getWindowHandle();
}

}
