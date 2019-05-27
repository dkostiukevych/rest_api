package com.pets.api.service.base;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

@SuppressWarnings("JavadocType")
public class RequestBuilder {
    
    public static RequestSpecification basic() {
        return given()
                .header("Accept", JSON);
    }
    
    public static RequestSpecification basicWithId(int id) {
        return given()
                .header("Accept", JSON)
                .pathParam("orderId", id);
    }
    
}
