package testselenium;

import framework.Helper;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {

    public static void main(String[] args) throws InterruptedException {

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

        WebElement categoriesLink = driver.findElement(By.partialLinkText("Categ"));
        categoriesLink.click();

        System.out.println("Page title is : " + driver.getTitle());

        //click on 'add categories button'
        WebElement addCAtegoryButton = driver.findElement(By.className("pull-right"));
        addCAtegoryButton.click();

        //Fill titlle field
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys(Helper.getRandomText());

        // Click on 'save button'
        WebElement saveButton = driver.findElement(By.id("save-category-button"));
        saveButton.click();
        
        

        //alternativni nacin
//        driver.findElement(By.id("save-category-button")).click();

        //regions
        
        WebElement navBar = driver.findElement(By.className("navbar-nav"));
        List<WebElement> liTags = navBar.findElements(By.tagName("li"));
        liTags.get(4).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement addPortalButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addPortalButton.click();
        
        
        Thread.sleep(7000);
        driver.quit();
    }

}
