package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.featurestore.SingleGet;
import starter.featurestore.Post;
import starter.featurestore.Get;
import starter.featurestore.Delete;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    SingleGet singleGet;

    @Steps
    Post post;


    @Steps
    Delete delete;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints() {
        get.setApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse() {
        get.validateHttpResponseCode200();
    }


    @Given("I perform POST.operational for login")
    public void PerformPOSToperationalforlogin() {
        post.PerformPOSToperationalforlogin();
    }

//    @When("I send POST HTTP request")
//    public void sendPostHttpRequest() {
//        post.sendPostHttpRequest();
//    }
//
//    @Then("I receive valid HTTP response code 201")
//    public void receiveValidHttp201() {
//        post.receiveHttpResponseCode201();
//    }
//
//    @And("I receive valid data for new post")
//    public void validateDataNewPost() {
//        post.validateDataNewPost();
//    }

    @Given("I set GET api endpoints to get single post")
    public void setGetApiEndpointsToGetSinglePost() {
        singleGet.setApiEndpoints();
    }

    @When("I send GET HTTP request to get single post")
    public void sendGetHttpRequestToGetSinglePost() {
        singleGet.sendGetHttpRequest();
    }

    @And("I receive valid data for single post")
    public void receiveValidDataForSinglePost() {
        singleGet.validateDataDetailPost();
    }

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints() {
        delete.setDeleteApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        delete.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void receiveValidHttp204() {
        delete.validateHttpResponse204();
    }
}
