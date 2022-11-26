package pro.sky.demostore.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.sky.demostore.model.Order;
import pro.sky.demostore.repository.OrderRep;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {
    private OrderRep orderRep;

    public StoreService(OrderRep orderRep) {
        this.orderRep = orderRep;
    }

    public List<Order> addOrders(Integer[] ids) {
        return orderRep.addOrders(ids);
    }

    public List<Integer> getOrdersId() {
        List<Integer> result = new ArrayList<>();
        for (Order o :
                orderRep.getOrdersList()) {
            result.add(o.getId());
        }
        return result;
    }
}
