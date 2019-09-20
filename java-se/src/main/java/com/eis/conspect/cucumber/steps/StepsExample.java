package testing.bdd.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepsExample {

    WebDriver webDriver;

    @Given("^Open \"([^\"]*)\" and start application$")
    public void openApp(String browser) throws Throwable {
        System.out.println("Opening " + browser);
        webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
    }

    @Given("^Open google in browser and input the following search request: \"([^\"]*)\"$")
    public void open_google_in_browser_and_input_the_following_search_request(String searchRequest) throws Throwable {
        System.out.println("Opening browser...");
        webDriver.get("https://google.com");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        webDriver.findElement(By.xpath("//input[@*='Поиск']")).sendKeys(searchRequest);
        webDriver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[contains(@*, 'Поиск')]")).click();
    }


    @When("^some actions$")
    public void some_actions() throws Throwable {
        System.out.println("Some actions steps...");

    }

    @Then("^first assert$")
    public void firstAssert() throws Throwable {
        System.out.println("Asserts...1");
    }

    @Then("^second assert$")
    public void secondAssert() throws Throwable {
        System.out.println("Asserts...2");
    }

    @Given("^Open \"([^\"]*)\" and open \"([^\"]*)\"$")
    public void open_and_open(String browser, String site) throws Throwable {
        System.out.println("Open " + browser + " on " + site);
    }

    @When("^Page is loaded$")
    public void page_is_loaded() throws Throwable {
    }

    @Then("^Main page of application is open$")
    public void main_page_of_application_is_open() throws Throwable {
    }

}
