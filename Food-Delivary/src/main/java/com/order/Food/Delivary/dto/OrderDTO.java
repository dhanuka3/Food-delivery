package com.order.Food.Delivary.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    @Column(name = "food_id")
    private int id;
    @Column(name = "food_name")
    private String name;
    private String price;
    private String availability;
    private int quantity;
}

