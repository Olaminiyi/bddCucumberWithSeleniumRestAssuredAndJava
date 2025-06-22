//package StepsDefinitions;
//
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.time.Duration;
//
//
//public class GoogleSearchSteps {
//        WebDriver driver = null;
//
//    @Given("browser window is open")
//    public void browser_window_is_open() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir=/Users/olaminiyi/Library/Application Support/Google/Chrome/User Data");
//        options.addArguments("profile-directory=Default");
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//    }
//
//    @Given("user is on google search page")
//    public void user_is_on_google_search_page() {
//        driver.navigate().to("https://google.com");
//    }
//
//    @When("user enters a text in the search box")
//    public void user_enters_a_text_in_the_search_box() throws InterruptedException {
//        driver.findElement(By.name("q")).sendKeys("Automation step by step");
//        Thread.sleep(2000);
//    }
//
//    @When("hits enter")
//    public void hits_enter() throws InterruptedException {
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//    }
//
//    @Then("user is navigated to the search")
//    public void user_is_navigated_to_the_search() {
//        driver.getPageSource().contains("Online Courses");
//        driver.close();
//        driver.quit();
//    }
//}
