package com.customer.entity;

import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @NotNull(message = "Product ID is mandatory")
    private Integer productId;
    @NotNull(message = "Product name is mandatory")
    private String productName;
    private LocalDateTime purchaseDate;
    @NotNull(message = "Status is mandatory")
    private String status;
    @Min(value = 1, message = "Quantity must be greater than 0")
    private Integer quantity;
    @Min(value = 0, message = "Total value must be 0 or greater")
    private Integer totalValue;
    
   
	
}
