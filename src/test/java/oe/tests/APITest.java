package oe.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {

    @Test
    public void apiTest() {

        Response response = RestAssured.given()
//                .contentType("application/json")
                .header("Host","cdn.jsdelivr.net")
                .accept("*/*")
                .header(":method","GET")
                .header("Content-Type", "application/json")
                .header("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
                .header("User-Agent",
                        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get("http://localhost:3000/npm/@fawazahmed0/currency-api@latest/v1/currencies/usd.json")
                .then()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
