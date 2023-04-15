package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class Post {
    protected String url = "https://fakestoreapi.com/";

    @Step("I set POST api endpoints")
    public String setPostApiEndpoint() {
        return url + "auth/login";
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("usernamse", "mor_2314");
        requestBody.put("password", "83r5^_");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for new post")
    public void validateDataNewPost() {
        restAssuredThat(response -> response.body("id", equalTo(101)));
        restAssuredThat(response -> response.body("title", equalTo("coba-coba")));
    }
}
