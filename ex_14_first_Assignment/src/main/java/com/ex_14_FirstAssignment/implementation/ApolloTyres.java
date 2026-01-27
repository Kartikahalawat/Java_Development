package com.ex_14_FirstAssignment.implementation;

import com.ex_14_FirstAssignment.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class ApolloTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehilce move with Apollo tyres";
    }
}
