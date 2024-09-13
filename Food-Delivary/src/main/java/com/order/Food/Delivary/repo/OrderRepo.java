package com.order.Food.Delivary.repo;

import com.order.Food.Delivary.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
}
