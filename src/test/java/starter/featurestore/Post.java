package starter.featurestore;

import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {
    @Step("I perform POST.operational for login")
    public void PerformPOSToperationalforlogin() {
        HashMap<String,String> postContent = new HashMap<>();
        postContent.put("username", "mor_2314");
        postContent.put("password", "83r5^_");

        given().contentType(ContentType.JSON);
        with().body(postContent);
        when().post("https://fakestoreapi.com/auth/login");
    }

//    protected String url = "https://fakestoreapi.com/";
//
//    @Step("I set POST api endpoints")
//    public String setPostApiEndpoint() {
//        return url + "auth/login";
//    }
//    @Step("I send POST HTTP request")
//    public void sendPostHttpRequest() {
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("username", "mor_2314");
//        requestBody.put("password", "83r5^_");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
//    }
//
//
    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }
//
//    @Step("I receive valid data for new post")
//    public void validateDataNewPost() {
//        restAssuredThat(response -> response.body("username", equalTo("mor_2314")));
//        restAssuredThat(response -> response.body("password", equalTo("83r5^_")));
//    }


}
