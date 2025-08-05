package com.kaushiki.khare.sample.ex_03_TestNG_Allure_Report;

import com.kaushiki.khare.sample.ex_01_RA_Basics.RestAssured_HelloWorld;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class test_testNG {
    String pincode;

    @Test
    // We would enter a valid pincode
    public void test_TC1_valid_pincode()
    {
        pincode = "226005";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    // We would enter special characters instead of a valid pincode
    public void test_TC2_invalid_pincode()
    {
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    // We would enter blank space instead of a valid pincode
    public void test_TC3_valid_pincode()
    {
        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }


    }
