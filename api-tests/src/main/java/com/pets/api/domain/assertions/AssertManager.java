package com.pets.api.domain.assertions;

import com.pets.api.error.handling.FaultSide;
import io.restassured.response.Response;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

@SuppressWarnings("JavadocType")
public class AssertManager {

    public static void assertNoErrors(Response response){
        
        assertEquals(response.getStatusCode(), 200, 201);
        List<FaultSide> errors = response.jsonPath().getList("FaultSide", FaultSide.class);
        if (errors != null && !errors.isEmpty())
            fail( "We expected that response doesn't contain errors. However it does: " + errors );
    }

    public static void assertContainsSpecificError(Response response, int errorId){
        List<FaultSide> errors = response.jsonPath().getList("whoFaults", FaultSide.class);
        if ((errors == null) && errors.isEmpty()){
            for (FaultSide error: errors) {
                if (error.getFaultStatusCode() == errorId) return;
            }
            fail("We expected that response contains specific error. However it doesn't: " + response);
        }
    }

    public static void assertUnauthorized(Response response){
        assertEquals(response.getStatusCode(), 401);
    }
    
}
