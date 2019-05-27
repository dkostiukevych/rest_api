package com.pets.api.service;

import com.pets.api.service.wrapper.store.StoreApiService;
import io.restassured.response.Response;

import java.util.logging.Logger;

@SuppressWarnings("JavadocType")
public class PetStore {
    
    private StoreApiService storeApiService;

    public PetStore(StoreApiService storeApiService) {
        this.storeApiService = storeApiService;
    }
    
    private PetStore() {}

    private Logger log = Logger.getLogger(PetStore.class.getName());
    
    public Response getInventory() {
        log.info("Getting Inventory...");
        final Response response = storeApiService.getInventory();
        log.info("Inventory API Response: " + response.prettyPrint());
        return response;
    }
    
}
