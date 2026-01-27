package com.ex_14_FirstAssignment.implementation;

import com.ex_14_FirstAssignment.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    @Override
    public String makeSound() {
        return "Playing music with Sony Speakers!";
    }
}
