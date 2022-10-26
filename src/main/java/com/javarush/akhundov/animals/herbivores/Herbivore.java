package com.javarush.akhundov.animals.herbivores;

import com.javarush.akhundov.animals.Animal;
import com.javarush.akhundov.interfaces.Eatable;
import com.javarush.akhundov.plants.Grass;
import com.javarush.akhundov.utility.Preferences;

public abstract class Herbivore extends Animal implements Eatable{
    @Override
    public boolean eat(Eatable meal, Preferences preferences){
        return meal instanceof Grass;
    }
}
