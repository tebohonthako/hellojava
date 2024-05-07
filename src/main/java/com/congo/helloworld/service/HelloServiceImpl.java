package com.congo.helloworld.service;

import com.congo.helloworld.entity.Hello;
import com.congo.helloworld.repository.HelloRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HelloServiceImpl implements HelloService{

    private HelloRepo helloRepo;

    public String getText() {
        return "Hello world";
    }
}
