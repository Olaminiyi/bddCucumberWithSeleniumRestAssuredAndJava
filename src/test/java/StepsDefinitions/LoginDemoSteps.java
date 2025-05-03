package StepsDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginDemoSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("browser window is open")
    public void browser_window_is_open(){
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        wait = new WebDriverWait(driver,Duration.ofSeconds(40));
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
       driver.get("https://www.saucedemo.com");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password)  {

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    @When("user click on login")
    public void user_click_on_login() {
        WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
        loginBtn.click();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page()  {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app_logo")));
        String pageTitle = driver.findElement(By.className("app_logo")).getText();
        assert pageTitle.equalsIgnoreCase("Swag Labs");

        driver.quit();
    }

}
