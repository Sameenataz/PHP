package Excer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class expedia {
    public static void main(String[] args) throws InterruptedException {

        //step1: Launch the browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Sameena_Automation_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //step2: Enter the URL/Website and maximize it
        driver.get("https://www.expedia.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        //step3: click on flight tab in the page
        driver.findElement(By.xpath("//span[text() = 'Flights']")).click();

        Thread.sleep(5000);
        //step4: click on Leaving From field and enter the value as Bangalore and select the first suggested option
        driver.findElement(By.xpath("//button[@aria-label = 'Leaving from']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder = 'Where are you leaving from?']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//input[@placeholder = 'Where are you leaving from?']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder = 'Where are you leaving from?']")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        //step5: click on Going to field and enter the value as delhi and select the first suggested option
        driver.findElement(By.xpath("//button[@aria-label = 'Going to']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder = 'Where are you going to?']")).sendKeys("Delhi");
        driver.findElement(By.xpath("//input[@placeholder = 'Where are you going to?']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder = 'Where are you going to?']")).sendKeys(Keys.ENTER);

        //step6: click on Departing date field and click on date 3rd sep and click on done button
        driver.findElement(By.xpath("//button[@id = 'd1-btn']")).click();
        driver.findElement(By.xpath("//button[@aria-label= '3 Sep 2020']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
        Thread.sleep(5000);

        //step7: click on Returning date field and click on date 24th sep and click on done button
        driver.findElement(By.xpath("//button[@id = 'd2-btn']")).click();
        driver.findElement(By.xpath("//button[@aria-label= '24 Sep 2020']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
        Thread.sleep(5000);

        //step7: click on Search button
        driver.findElement(By.xpath("//button[@data-testid = 'submit-button']")).click();
    }
}
