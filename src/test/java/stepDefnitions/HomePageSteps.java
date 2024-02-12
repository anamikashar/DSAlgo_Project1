package stepDefnitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
public static WebDriver driver;
String URL = "https://dsportalapp.herokuapp.com/";

By getStarted = By.xpath("//button[text()='Get Started']");
By dataStructures = By.xpath("//a[text()='Data Structures']");
By dropdown = By.xpath("//div[@class='dropdown-menu show']");
By array = By.xpath("//a[text()='Arrays']");
By warning = By.xpath("//div[@role='alert']");

@Given("The user opens Home Page")
public void the_user_opens_home_page() {
   
driver = new ChromeDriver();
driver.get(URL);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@When("The user clicks {string} button")
public void the_user_clicks_button(String string) throws InterruptedException {
   
driver.findElement(getStarted).click();
Thread.sleep(1000); 
}

@Then("The user should enter the home page")
public void the_user_should_enter_the_home_page() {

System.out.println("the user enters the home page"); 
}

@When("The user clicks {string} drop down")
public void the_user_clicks_drop_down(String string) throws InterruptedException {

driver.findElement(dataStructures).click();
Thread.sleep(1000);
}

@Then("The user should see {int} panes with different data structires")
public void the_user_should_see_panes_with_different_data_structires(Integer int1) {

 System.out.println("the_user see panes with different data structires");  

}

@When("The user clicks \"Array\"on drop menu")
public void the_user_clicks_array_on_drop_menu() throws InterruptedException {

driver.findElement(array).click();
Thread.sleep(1000);  
}

@Then("It should alert the user with a message {string}")
public void it_should_alert_the_user_with_a_message(String string) {
driver.findElement(warning).getText(); 

}
}