package StepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HooksSteps {

    WebDriver driver = null;
    WebDriverWait wait;

    @Before(value="@smoke", order=1)
    public void browserSetup() {

        System.out.println("  I am inside browserSetup");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @Before(order=0)
    public void setup2() {
        System.out.println("   I am inside setup2 \n");
    }

    @After(order=1)
    public void teardown() {
        System.out.println("   I am inside teardown");
        driver.close();
        driver.quit();
    }

    @After(order=2)
    public void teardown2() {
        System.out.println("  I am inside teardown2 \n");
    }

    @BeforeStep
    public void beforeSteps() {
        System.out.println("  I am inside beforeSteps ----");
    }

    @AfterStep
    public void afterSteps() {
        System.out.println("  I am inside asfterSteps ====");
    }


    @Given("user is on login page")
    public void user_is_on_login_page() {
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
    }

}
