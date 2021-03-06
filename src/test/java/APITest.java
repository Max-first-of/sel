import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import junit.framework.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URI;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class APITest {

    public static WebDriver driver;
    @BeforeAll
    static void setUP() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "91.0");
        capabilities.setCapability("enableVNC", true);
        RemoteWebDriver driver1 = new RemoteWebDriver(
                URI.create("http://192.168.0.100:4444/wd/hub").toURL(),
                capabilities); driver = driver1;

    }
    @Test
    public void test21()
    {
        Assert.assertEquals("a", "A");
    }
    @Description("Важный тест")
    @Test
    public void test2(){
        Assert.assertEquals("ex", "ex");
    }
    @Description("Fee")
    @Test
    public void test3(){
        String s = "";
        step1();
    }
    @Test
    public void test4(){
        driver.get("https://ya.ru");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException ie){

        }
        WebElement element = driver.findElement(By.id("text"));
        element.sendKeys("Работа");
        WebElement search = driver.findElement(By.tagName("button"));
        search.click();
    }
    @Step("Воу воу воу")
    public void step1(){

    }
}

