package api.utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class APIUtils {

    public static Response getRequest(String endpoint) {
        return given()
                .baseUri(ConfigManager.getProperty("baseUrl"))
                .when()
                .get(endpoint)
                .then()
                .extract().response();
    }

    public static Response postRequest(String endpoint, Object pojoPayload) {
        return given()
                .baseUri(ConfigManager.getProperty("baseUrl"))
                .header("Content-Type", "application/json")
                .body(pojoPayload)
                .when()
                .post(endpoint)
                .then()
                .extract().response();
    }
}