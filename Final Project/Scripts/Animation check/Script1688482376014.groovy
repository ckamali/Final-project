import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","C:\\Browser drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.demoblaze.com/");
driver.manage().window().maximize();
driver.findElementByXPath("//span[@class='carousel-control-next-icon']").click();
driver.findElementByXPath("//span[@class='carousel-control-next-icon']").click();
driver.findElementByXPath("//span[@class='carousel-control-next-icon']").click();