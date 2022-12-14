package com.javarush.akhundov.animals.herbivores;

import com.javarush.akhundov.animals.Animal;
import com.javarush.akhundov.interfaces.Eatable;
import com.javarush.akhundov.plants.Grass;
import com.javarush.akhundov.utility.Preferences;

public class Duck extends Herbivore implements Eatable {

    public Duck(){
        maxAmountOfAnimal = 200;
        normalWeight = 1;
        weight = normalWeight;
        speed = 4;
        isHungry = false;
        mealAmountToEat = 0.15;
    }

    @Override
    public Duck multiply() {
      return new Duck();
    }

    @Override
    public boolean eat(Eatable meal, Preferences preferences) {
        if(meal instanceof Grass){
            return true;
        }
        else {
            return tryToEat((Animal) meal, preferences);
        }
    }
}
