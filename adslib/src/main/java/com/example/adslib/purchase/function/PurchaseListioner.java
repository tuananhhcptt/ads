package com.example.adslib.purchase.function;

public interface PurchaseListioner {
    void onProductPurchased(String productId, String transactionDetails);
    void displayErrorMessage(String errorMsg );
    void onUserCancelBilling( );
}