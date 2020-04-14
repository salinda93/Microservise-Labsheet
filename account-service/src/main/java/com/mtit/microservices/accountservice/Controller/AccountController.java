package com.mtit.microservices.accountservice.Controller;

import com.mtit.microservices.accountservice.dto.UserRequest;
import com.mtit.microservices.accountservice.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class AccountController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody UserResponse createUser(@RequestBody UserRequest userRequest){

        System.out.println("User Details : "+userRequest);

        UserResponse userResponse = new UserResponse();
        userResponse.setUserId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully Created the user...");

        return userResponse;

    }
}
