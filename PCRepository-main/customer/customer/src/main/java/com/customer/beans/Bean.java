package com.customer.beans;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bean {
	   @NotNull(message = "Customer ID is mandatory")
	private Integer customerId;
	   @NotNull(message = "Product ID is mandatory")
	private Integer productId;
	   @Min(value = 1, message = "Quantity must be greater than 0")
	private Integer quantity;
	
	
}
