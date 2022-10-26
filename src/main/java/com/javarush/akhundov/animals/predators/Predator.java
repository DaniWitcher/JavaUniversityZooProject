package com.javarush.akhundov.animals.predators;

import com.javarush.akhundov.animals.Animal;
import com.javarush.akhundov.interfaces.Eatable;
import com.javarush.akhundov.utility.Preferences;

public abstract class Predator extends Animal {
    @Override
    public boolean eat(Eatable meal, Preferences preferences){
        return tryToEat((Animal) meal,preferences);
    }
}
