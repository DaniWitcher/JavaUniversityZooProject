package com.javarush.akhundov.animals.herbivores;

import com.javarush.akhundov.interfaces.Eatable;

public class Goat extends Herbivore implements Eatable {

    public Goat(){
        maxAmountOfAnimal = 140;
        normalWeight = 60;
        weight = normalWeight;
        speed = 3;
        isHungry = false;
        mealAmountToEat = 10;
    }

    @Override
    public Goat multiply() {
        return new Goat();
    }

}
