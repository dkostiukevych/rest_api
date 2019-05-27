package com.pets.api.service.wrapper.store.implementation;

import com.pets.api.service.common.models.PetsOrder;
import com.pets.api.service.wrapper.store.StoreApiService;
import io.restassured.response.Response;

import static com.pets.api.service.base.RequestBuilder.basic;
import static com.pets.api.service.base.RequestBuilder.basicWithId;

@SuppressWarnings("JavadocType")
public class StoreApi implements StoreApiService {
    
    private final String INVENTORY_URI = "/store/inventory";
    private final String ORDER_URI = "/store/order/";
    
    public Response getInventory() {
        return basic()
                .get(INVENTORY_URI);
    }
    
    public Response getOrderById(int orderId) {
        return basicWithId(orderId)
                .get(ORDER_URI);
    }
    
    public Response placeAnOrder(PetsOrder petOrder) {
        return basic()
                .body(petOrder)
                .post(ORDER_URI);
    }
    
    public Response deletePurchaseById(int orderId) {
        return basicWithId(orderId)
                .delete(ORDER_URI);
    }
}
