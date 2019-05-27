package com.pets.api.tests;

import com.pets.api.service.PetStore;
import com.pets.api.service.wrapper.store.implementation.StoreApi;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

@SuppressWarnings("JavadocType")
public class BaseExtension {
    
    PetStore petStore;

    @BeforeMethod
    public void setUpMethod() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @BeforeClass
    public void setUp() {
        instantiateReal();
    }

    private void instantiateReal() {
        petStore = new PetStore(new StoreApi());
    }
    
}
