package com.javarush.akhundov.animals.herbivores;

import com.javarush.akhundov.interfaces.Eatable;

public class Buffalo extends Herbivore implements Eatable {


    public Buffalo(){
        maxAmountOfAnimal = 10;
        normalWeight = 700;
        weight = normalWeight;
        speed = 3;
        isHungry = false;
        mealAmountToEat = 100;
    }

    @Override
    public Buffalo multiply() {
        return new Buffalo();
    }

}
