package com.ty;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Nokia implements Mobile{
    @Override
    public void call() {
        System.out.println("Calling using Nokia mobile");
    }
}
