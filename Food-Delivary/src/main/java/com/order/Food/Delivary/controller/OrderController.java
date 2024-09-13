package com.order.Food.Delivary.controller;

import com.order.Food.Delivary.model.Order;
import com.order.Food.Delivary.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrder")
    public List<Order> getOrders(){
        return orderService.getAllOrders();
    }


}
