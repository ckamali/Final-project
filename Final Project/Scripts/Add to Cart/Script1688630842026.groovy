import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.demoblaze.com/");
driver.manage().window().maximize();

WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Samsung galaxy s6']")));
element.click();
WebDriverWait wait1 = new WebDriverWait(driver, 10);
WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add to cart']")));
element1.click();
