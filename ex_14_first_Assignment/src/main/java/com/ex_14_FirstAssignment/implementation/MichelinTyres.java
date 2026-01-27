package com.ex_14_FirstAssignment.implementation;

import com.ex_14_FirstAssignment.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle move with Michelin";
    }
}
