
package net.testrozetka.pages;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MakeOrderSuite {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void MakeOrderUnregUser() {
        // Test name: MakeOrderUnregUser
        // Step # | name | target | value | comment
        // 1 | open | https://rozetka.com.ua/mobile-phones/c80003/ |  |
        driver.get("https://rozetka.com.ua/mobile-phones/c80003/");
        // 2 | setWindowSize | 1440x900 |  |
        driver.manage().window().setSize(new Dimension(1440, 900));
        // 3 | click | css=.hub-i-cart-link-count |  |
        driver.findElement(By.cssSelector(".hub-i-cart-link-count")).click();
        // 4 | click | id=popup-checkout |  |
        driver.findElement(By.id("popup-checkout")).click();
        // 5 | type | id=reciever_name | Nizovets Ivanna |
        driver.findElement(By.id("reciever_name")).sendKeys("Nizovets Ivanna");
        // 6 | click | id=reciever_phone |  |
        driver.findElement(By.id("reciever_phone")).click();
        // 7 | type | id=reciever_phone | +380680137096 |
        driver.findElement(By.id("reciever_phone")).sendKeys("+380680137096");
        // 8 | click | id=reciever_email |  |
        driver.findElement(By.id("reciever_email")).click();
        // 9 | type | id=reciever_email | avksentev5@ |
        driver.findElement(By.id("reciever_email")).sendKeys("avksentev5@");
        // 10 | click | id=reciever_email |  |
        driver.findElement(By.id("reciever_email")).click();
        // 11 | click | id=reciever_email |  |
        driver.findElement(By.id("reciever_email")).click();
        // 12 | mouseOver | css=.opaque > .btn-link-i |  |
        {
            WebElement element = driver.findElement(By.cssSelector(".opaque > .btn-link-i"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 13 | type | id=reciever_email | avksentiev5@gmail.com |
        driver.findElement(By.id("reciever_email")).sendKeys("avksentiev5@gmail.com");
        // 14 | click | css=.opaque > .btn-link-i |  |
        driver.findElement(By.cssSelector(".opaque > .btn-link-i")).click();
        // 15 | click | linkText=Выберите подходящее отделение |  |
        driver.findElement(By.linkText("Выберите подходящее отделение")).click();
        // 16 | click | linkText=№5, пр-т. Победы, д. 24 (ТРЦ Smart Plaza, м. Политехнический институт) |  |
        driver.findElement(By.linkText("№5, пр-т. Победы, д. 24 (ТРЦ Smart Plaza, м. Политехнический институт)")).click();
        // 17 | mouseDownAt | id=make-order | 11.265625,17.046875 |
        {
            WebElement element = driver.findElement(By.id("make-order"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        // 18 | mouseMoveAt | css=html | 1204,563 |
        {
            WebElement element = driver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 19 | mouseUpAt | css=html | 1204,563 |
        {
            WebElement element = driver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        // 20 | click | css=body |  |
        driver.findElement(By.cssSelector("body")).click();
    }
}
