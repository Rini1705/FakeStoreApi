package starter.featurestore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;


public class SingleGet {
    protected static String url = "https://fakestoreapi.com/";

    @Step("I set GET api endpoints")
    public String setApiEndpoints() {
        return url + "carts/5";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid data for detail post")
    public void validateDataDetailPost() {
        restAssuredThat(response -> response.body("id", equalTo(5)));
        restAssuredThat(response -> response.body("userId", equalTo(3)));
    }
}
