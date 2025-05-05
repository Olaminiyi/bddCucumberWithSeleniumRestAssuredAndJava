//package StepsDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import pageFactory.HomePage_PF;
//import pageFactory.LoginPage_PF;
//import pages.LoginPagePOM;
//
//import java.time.Duration;
//
//public class LoginPagePFSteps {
//
//    WebDriver driver = null;
//    LoginPage_PF login;
//    HomePage_PF home;
//    WebDriverWait wait;
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
//        login = new LoginPage_PF(driver);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
//        login.enterUsername(username);
//        login.enterPassword(password);
//    }
//
//    @When("user click on login")
//    public void user_click_on_login() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
//        login.clickOnLogin();
//    }
//
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page()  {
//        home = new HomePage_PF(driver);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
//        home.checkPageTitleIsDisplay();
//        driver.quit();
//    }
//}
