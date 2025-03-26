package oe.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {

    @Test
    public void apiTest() {

        RestAssured.baseURI = "https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies.json";
        Response response = RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .header("user-agent",
                        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get()
                .then()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
