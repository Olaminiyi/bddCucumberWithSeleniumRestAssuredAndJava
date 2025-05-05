//package StepsDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import pages.HomepagePOM;
//import pages.LoginPagePOM;
//
//import java.time.Duration;
//
//public class LoginPagePOMSteps {
//
//    WebDriver driver;
//    WebDriverWait wait;
//    LoginPagePOM loginPagePOM;
//    HomepagePOM home;
//
//    @Given("browser window is open")
//    public void browser_window_is_open(){
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//    }
//
//    @And("user is on login page")
//    public void user_is_on_login_page() {
//
//        driver.get("https://www.saucedemo.com");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
//    }
//
//    @When("user enters {string} and {string}")
//    public void user_enters_and(String username, String password)  {
//
//        loginPagePOM = new LoginPagePOM(driver);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
//        loginPagePOM.enter_username(username);
//        loginPagePOM.enterPassword(password);
//
//    }
//    @When("user click on login")
//    public void user_click_on_login() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
//        loginPagePOM.clickLogin();
//    }
//
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page()  {
//
//        home = new HomepagePOM(driver);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
//        home.homePageDisplayed();
//        driver.quit();
//
//    }
//}
