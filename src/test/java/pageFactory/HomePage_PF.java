package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

    @FindBy(className = "title")
    WebElement pageTitle;

    WebDriver driver;

    public HomePage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, LoginPage_PF.class);
    }

    public  void checkPageTitleIsDisplay(){
        pageTitle.getText();
        assert pageTitle.getText().equalsIgnoreCase("Products");
       // System.out.println("Page title is: " + pageTitle.getText());
    }
}
