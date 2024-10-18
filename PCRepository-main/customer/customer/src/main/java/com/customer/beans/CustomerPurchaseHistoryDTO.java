package com.customer.beans;

import java.util.List;

import com.customer.entity.Customer;
import com.customer.entity.Purchase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPurchaseHistoryDTO {
    private Customer customer;
    private List<Purchase> purchases;
}
