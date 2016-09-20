package com.stephanie;

public class DinosaurSupervisor {

    public static void main(String[] args) {
	    Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur diplodocus =new Dinosaur();
        Dinosaur great_dane = new Dinosaur();


        t_rex.roar();
        velociraptor.roar();
        diplodocus.roar();
        great_dane.bark();
        great_dane.say_hi();
    }
}
