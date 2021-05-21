package stepdefinition;

import browser.Browser;
import input.Input;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import url.URL;

import java.util.concurrent.TimeUnit;

public class SearchSteps {
    Browser br = new Browser();
    URL url = new URL();
    Input input = new Input();

    @Given("user is in search page")
    public void user_is_in_search_page() {
        br.chrome(url.googleSearchPage);
    }

    @When("user enter the keyword")
    public void user_enter_the_keyword() {
        br.driver.findElement(By.xpath(url.searchTab)).sendKeys(input.keyword);
    }

    @When("user press Enter key")
    public void user_press_enter_key() {
        br.driver.findElement(By.xpath(url.searchTab)).sendKeys(Keys.ENTER);
    }

    @Then("search result displayed")
    public void search_result_displayed() {
        String title = br.driver.getTitle();
        Assert.assertTrue(title.contains(input.keyword));
        br.driver.close();
    }
}
