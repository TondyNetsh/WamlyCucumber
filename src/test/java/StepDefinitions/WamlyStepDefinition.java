package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WamlyStepDefinition {
    public WebDriver driver;
    @Given("^User is on Wamly login page$")
    public void verifyLoginPage() throws Throwable {
        System.out.println("Login page verified");
        System.setProperty("webdriver.chrome.driver","C:/Users/CMDQ1/IdeaProjects/WebDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://ui.uatwamly.co.za/");
        driver.manage().window().maximize();
    }

    @When("^User enters (.+) and clicks next$")
    public void user_enters_and_clicks_next(String username) throws Throwable {
        System.out.println("Username used is: " + username);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("login-btn-2")).click();
    }
    @Then("^User Enters (.+) to login$")
    public void user_enters_to_login(String password) throws Throwable {
        System.out.println("User password is: " + password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
    @Then("^User is navigated to Wamly dashboard$")
    public void user_is_navigated_to_wamly_dashboard() throws Throwable {
        System.out.println("Welcome to Wamly dashboard: " + driver.getTitle());
    }
}
