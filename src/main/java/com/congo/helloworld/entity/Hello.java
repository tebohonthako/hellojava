package com.congo.helloworld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Hello {
    @Id
    @GeneratedValue
//    private Long id;
    private String text = "Hello World!";

}
