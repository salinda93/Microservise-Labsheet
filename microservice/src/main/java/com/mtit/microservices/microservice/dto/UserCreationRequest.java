package com.mtit.microservices.microservice.dto;

public class UserCreationRequest {
    private String fullname;
    private String age;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
