package com.kaushiki.khare.sample.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class RA_test2_lab {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the pin code please");
        String pin = scanner.next();
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);


    }
}
