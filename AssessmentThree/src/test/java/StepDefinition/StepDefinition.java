package StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class StepDefinition {
        WebDriver driver;
        @Given("User is on landing page")
        public void user_is_on_landing_page(){


                System.setProperty("webdriver.chromedriver","resources/chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("https://www.saucedemo.com/");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();

        }

        @When("^User login to application with (.+) and (.+)$")
        public void user_login_to_application_with_and(String username, String password) throws InterruptedException {
                driver.findElement(By.id("user-name")).sendKeys(username);
                Thread.sleep(2000);
                driver.findElement(By.id("password")).sendKeys(password);
                Thread.sleep(2000);
                driver.findElement(By.id("login-button")).click();
        }

        @Then("^inventory page is loaded$")
        public void inventory_page_is_loaded() throws Throwable {
                System.out.println("We are within!!!");
        }


}
