package com.order.Food.Delivary.service;

import com.order.Food.Delivary.model.Order;
import com.order.Food.Delivary.repo.OrderRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;


    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

}

