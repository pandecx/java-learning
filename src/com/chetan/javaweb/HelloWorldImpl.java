package com.chetan.javaweb;

import javax.jws.WebService;
//Service Implementation
@WebService(endpointInterface = "com.chetan.javaweb.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }
}