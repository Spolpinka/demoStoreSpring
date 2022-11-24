package pro.sky.demostore.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.demostore.model.Order;

import java.util.ArrayList;
import java.util.List;
@Repository
@SessionScope
public class OrderRep {

    private final List<Order> ordersList = new ArrayList<>();

    public OrderRep() {
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public List<Order> addOrders(Integer[] integers) {
        for (Integer i :
                integers) {
            ordersList.add(new Order(i));
        }
        return ordersList;
    }
}
