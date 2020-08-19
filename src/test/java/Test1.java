
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Test1
{
    private WebDriver driver;
    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.navigate().to("https://dev-1.clicktrans.pl/register-test/courier");
    }
    @Test
    public void clickTest()
    {
        //Assert.assertEquals(driver.getTitle(),"Rejestracja jako Przewoźnik - reprezentuję firmę");
        driver.findElement(By.id("user_register_company_name")).sendKeys("Transport Company");
        driver.findElement(By.id("user_register_email")).sendKeys("aaa@gmail.com");
        driver.findElement(By.id("user_register_name")).sendKeys("Jan Nowak");
        driver.findElement(By.id("user_register_phone")).sendKeys("500000123");
        driver.findElement(By.id("user_register_plainPassword")).sendKeys("Alfa123a");
        driver.findElement(By.id("user_register_settings_agreementRegulations")).click();
        driver.findElement(By.id("user_register_settings_agreementPersonalData")).click();
        driver.findElement(By.id("user_register_submit")).click();
    }
    @After
    public void tearDown()
    {


    }
}
