package com.pets.api.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static com.pets.api.domain.assertions.AssertManager.assertNoErrors;

@SuppressWarnings("JavadocType")
public class StoreManagementTests extends BaseExtension {
    
    @Test
    public void testCanGetInventory() {
        Response response = petStore.getInventory();
        assertNoErrors(response);
    }
}
