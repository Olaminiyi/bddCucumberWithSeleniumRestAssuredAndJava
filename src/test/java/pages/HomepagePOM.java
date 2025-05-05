package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomepagePOM {
    protected WebDriver driver;
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

    public HomepagePOM(WebDriver driver){
        this.driver = driver;
    }

    public void homePageDisplayed(){
        WebElement pageTitle = driver.findElement(By.className("title"));
        wait.until(ExpectedConditions.visibilityOf(pageTitle));
        pageTitle.getText();
        assert pageTitle.getText().equalsIgnoreCase("Products");
    }
}
