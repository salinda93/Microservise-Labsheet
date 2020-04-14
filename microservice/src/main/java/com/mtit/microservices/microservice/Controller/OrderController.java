package com.mtit.microservices.microservice.Controller;

import com.mtit.microservices.microservice.Service.OrderServiceImpl;
import com.mtit.microservices.microservice.dto.OrderRequest;
import com.mtit.microservices.microservice.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request){

        System.out.println("Order Details : " + request);
        return orderService.createOrder(request);

    }
}
