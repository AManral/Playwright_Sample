package oe.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import oe.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HomePageTest extends BaseTest {


    @Test
    public void homePageSanityTest() {
     Boolean isPageLoaded=homePage.isPageHeaderVisible();

     Assert.assertEquals(isPageLoaded,true);

     homePage.setInputAmount("20");
     homePage.setInputFromCurrency("ada");
     homePage.setInputToCurrency("aed");
     homePage.clickCovertButton();

    }


}
