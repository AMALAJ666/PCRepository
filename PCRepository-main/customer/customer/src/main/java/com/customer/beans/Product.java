package com.customer.beans;

import com.customer.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer productId;
    private String productName;
    private String category;
    private Integer unitPrice;
    private Integer stock;
    private Integer stockValue;

    private String description;



    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
        calculateStockValue();  // Recalculate stockValue whenever unitPrice changes
    }


    public void setStock(Integer stock) {
        this.stock = stock;
        calculateStockValue();  // Recalculate stockValue whenever stock changes
    }



    // Method to calculate the stock value
    private void calculateStockValue() {
        if (unitPrice != null && stock != null) {
            this.stockValue = this.unitPrice * this.stock;
        } else {
            this.stockValue = null; // Set to null if any value is missing
        }
    }

   
}
