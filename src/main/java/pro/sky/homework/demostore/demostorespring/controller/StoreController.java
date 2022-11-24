package pro.sky.homework.demostore.demostorespring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/store/order/add")
    public void addOrders(Integer... integers) {
        storeService.addOrders(integers);
    }
}
