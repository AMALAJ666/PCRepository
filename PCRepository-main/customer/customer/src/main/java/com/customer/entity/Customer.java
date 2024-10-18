package com.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @NotNull(message = "Name is mandatory")
    @Column(nullable = false) // Adds NOT NULL constraint in the database
    private String name;

    @NotNull(message = "Email is mandatory")
    @Column(nullable = false, unique = true) 
    private String email;

    @NotNull(message = "Password is mandatory")
    @Size(min = 6, message = "Password should have at least 6 characters")
    @Column(nullable = false) 
    private String password;

    @NotNull(message = "Phone number is mandatory")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number should be 10 digits")
    @Column(nullable = false) 
    private String phoneNo;

    @NotNull(message = "Address is mandatory")
    @Column(nullable = false) 
    private String address;
}
