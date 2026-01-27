package com.ex_14_FirstAssignment.main;

import com.ex_14_FirstAssignment.beans.Person;
import com.ex_14_FirstAssignment.beans.Vehicle;
import com.ex_14_FirstAssignment.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ex_14_FirstAssignment {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);

        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();
    }
}
