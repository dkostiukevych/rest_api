package com.pets.api.domain;

import com.pets.api.error.handling.TestException;
import io.restassured.response.Response;

@SuppressWarnings("JavadocType")
public class JsonConverter {

    private static String getStringByPath(Response response, String path) {
        if (response != null){
            try {
                return response.jsonPath().getString(path);
            } catch (Exception ex){
                return null;
            }

        }
        throw new TestException("Can't parse a response: response is empty");
    }

    private static <T>T getObjectByPath(Response response, String path, Class<T> objectType){
        if (response != null){
            try {
                return response.jsonPath().getObject(path, objectType);
            } catch (Exception ex){
                throw new TestException("Can't parse the response to get object: " +
                        objectType);
            }

        }
        throw new TestException("Can't parse a response: response is empty");
    }

    public static String getFirstOutcomeFromMarketResponse(Response response){
        if (response != null){
            try {
                return response.jsonPath().getString("whoCompetitions.event.market.outcome.id");
            } catch (Exception ex){
                throw new TestException("Can't parse the response to get outcome Ids: " +
                        response.asString());
            }

        }
        throw new TestException("Can't parse a response: response is empty");
    }
}
