package com.mtit.microservices.microservice.Service;

import com.mtit.microservices.microservice.dto.OrderRequest;
import com.mtit.microservices.microservice.dto.OrderResponse;
import com.mtit.microservices.microservice.dto.UserCreationRequest;
import com.mtit.microservices.microservice.dto.UserCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;
import java.util.UUID;

@Service
public class OrderServiceImpl {

    @Autowired
    private RestTemplate restTemplate;


    public OrderResponse createOrder(OrderRequest orderRequest){

        UserCreationRequest userCreationRequest = new UserCreationRequest();
        userCreationRequest.setAge(orderRequest.getAge());
        userCreationRequest.setFullname(orderRequest.getFullname());
        ResponseEntity<UserCreationResponse> userCreationResponse = restTemplate.postForEntity("http://localhost:8080/users",userCreationRequest, UserCreationResponse.class);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setUserId(userCreationResponse.getBody().getUserId());
        orderResponse.setMessage("Successfully created the order.....");
        return orderResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }


}
