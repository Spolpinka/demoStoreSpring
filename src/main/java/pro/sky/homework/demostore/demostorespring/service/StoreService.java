package pro.sky.homework.demostore.demostorespring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.sky.homework.demostore.demostorespring.model.Order;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")
public class StoreService {
    private final List<Order> ordersList = new ArrayList<>();

    public void addOrders(Integer[] integers) {
        for (Integer i :
                integers) {
            ordersList.add(new Order(i));
        }
    }

    public List<Integer> getOrdersId() {
        List<Integer> result = new ArrayList<>();
        for (Order order : ordersList) {
            result.add(order.getId());
        }
        return result;
    }
}
