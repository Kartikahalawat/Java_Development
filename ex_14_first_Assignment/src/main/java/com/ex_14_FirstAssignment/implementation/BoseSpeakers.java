package com.ex_14_FirstAssignment.implementation;

import com.ex_14_FirstAssignment.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music with Bose Speakers!";
    }
}
