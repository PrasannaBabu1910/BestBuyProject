package Project;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.GDurationSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tasks {

	@Test

	public void BestbuyTestcase1() throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bestbuy.com/");
		driver.quit();
	}

	@Test
	public void BestbuyTestcase2() throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bstby.com/");
		driver.quit();
	}

	@Test
	public void BestbuyTestcase3signuploginfuncgtionality() throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='us-link']"));
		findElement.click();
		driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
		driver.findElement(By.xpath("//a[@data-lid='ubr_mby_account_home_b']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Create Account']")).click();
		driver.quit();
	}

	@Test
	public void BestbuyTestcasenavigationallMenu() throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494");
		driver.findElement(By.xpath("//a[@class='us-link']")).click();
		driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
		driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
		driver.findElement(By.xpath("//button[@class='c-button-unstyled close-button-flyout menuCloseBtn']")).click();
		driver.findElement(By.xpath("//a[@data-lid='hdr_td_topdeals']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-lid='hdr_dotd']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-lid='hdr_best_buy_totaltech']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-lid='hdr_crd']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-lid='hdr_gift_cards']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-lid='hdr_gift_ideas']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-lid='hdr_health']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='v-p-right-xxs utility-nav-drawer-btn-label']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='accountMenuCloseText']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='v-p-right-xxs']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void BestbuyTestcasesearchforandaddtoCart() throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494");
		driver.findElement(By.xpath("//a[@class='us-link']")).click();
		driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
		driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
		driver.findElement(By.xpath("//button[@class='c-button-unstyled close-button-flyout menuCloseBtn']")).click();
		driver.findElement(By.xpath("//input[@id='gh-search-input']"))
				.sendKeys("Insignia™ - 50\" Class F30 Series LED 4K UHD Smart Fire TV", Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='header-search-button']")).click();
		driver.findElement(By.xpath("//button[@data-sku-id='6525240']")).click();
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		driver.findElement(By.xpath("//div[@class='checkout-buttons__checkout']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as Guest']")).click();
		driver.findElement(By.xpath("//input[@id='user.emailAddress']")).sendKeys("lrprasannaraghu@gmail.com");
		driver.findElement(By.xpath("//input[@id='user.phone']")).sendKeys("8668117797");
		driver.findElement(By.xpath("//span[text()='Continue to Payment Information']")).click();
		Thread.sleep(1500);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("SNAP/certificate3.png");
		FileUtils.copyFile(source, dest);
		Thread.sleep(1000);
		driver.quit();
	}
	
	
}