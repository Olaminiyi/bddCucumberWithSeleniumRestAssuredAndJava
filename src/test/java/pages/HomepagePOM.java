package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomepagePOM {
    protected WebDriver driver;
    By pageTitle = By.xpath("//*[contains(@class, 'app_logo')]");
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

    public HomepagePOM(WebDriver driver){
        this.driver = driver;
    }

    void homePageDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app_logo")));
        driver.findElement(pageTitle).isDisplayed();
       //  return pageTitle;
       // assert pageTitle.equalsIgnoreCase("Swag Labs");
    }
}
