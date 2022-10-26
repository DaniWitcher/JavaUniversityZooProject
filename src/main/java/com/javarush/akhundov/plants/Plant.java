package com.javarush.akhundov.plants;

import com.javarush.akhundov.interfaces.Eatable;
import com.javarush.akhundov.interfaces.Organism;

public abstract class Plant implements Eatable, Organism {
    protected double weight;
}
