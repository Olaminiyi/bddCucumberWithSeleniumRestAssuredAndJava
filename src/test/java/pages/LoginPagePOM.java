package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPagePOM {

    protected WebDriver driver;
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    private By txt_username = By.id("user-name");
    private By txt_password = By.id("password");
    private  By btn_login = By.id("login-button");

    public LoginPagePOM(WebDriver driver){
             this.driver = driver;
         }

    public  void enter_username(String username){

        driver.findElement(txt_username).clear();
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).clear();
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin() {

        driver.findElement(btn_login).click();
    }

    public void loginValidUser(String username, String password) {

        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }

}
