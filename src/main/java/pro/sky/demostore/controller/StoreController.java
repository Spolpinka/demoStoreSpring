package pro.sky.demostore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.demostore.service.StoreService;

import java.util.List;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/store/order/get")
    public List<Integer> getOrdersId() {
        return storeService.getOrdersId();
    }
    @GetMapping("/store/order/add")
    public String addOrders(@RequestParam("id") Integer... ids) {
        storeService.addOrders(ids);
        return "Приняты id " + ids;
    }
}
