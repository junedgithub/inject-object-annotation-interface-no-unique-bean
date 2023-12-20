package com.ty;

import org.springframework.stereotype.Component;

@Component("moto")
public class Moto implements Mobile {

    @Override
    public void call() {
        System.out.println("Calling using MoTo mobile");
    }
}
