package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://bvtest.school.cubes.rs/login");

        WebElement emailFiled = driver.findElement(By.name("email"));
        emailFiled.sendKeys("qa@cubes.rs");
        
        WebElement passwordFiled = driver.findElement(By.name("password"));
        passwordFiled.sendKeys("cubesqa");
        
        WebElement LoginButton = driver.findElement(By.className("btn-primary"));
        LoginButton.click();
        
        WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
        signaturesLink.click();
        
//        driver.quit();
        
        
    }

}
