package com.mtit.microservices.accountservice.dto;

public class UserRequest {

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

    @Override
    public java.lang.String toString() {
        return "UserRequest{" +
                "fullname=" + fullname +
                ", age=" + age +
                '}';
    }
}
