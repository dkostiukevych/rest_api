package com.pets.api.service.wrapper.store;

import com.pets.api.service.common.models.PetsOrder;
import io.restassured.response.Response;

@SuppressWarnings("JavadocType")
public interface StoreApiService {
    
    Response getInventory();
    Response getOrderById(int orderId);
    Response placeAnOrder(PetsOrder petOrder);
    Response deletePurchaseById(int purchaseId);
}
