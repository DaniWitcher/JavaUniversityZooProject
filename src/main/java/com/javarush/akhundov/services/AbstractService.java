package com.javarush.akhundov.services;

import com.javarush.akhundov.field.Cell;
import com.javarush.akhundov.field.GameField;

public abstract class AbstractService {
    protected GameField gameField;

    public void runService(){
        for(int i = 0; i < gameField.getHeight(); i++){
            for(int j = 0; j < gameField.getWidth(); j++){
                cellAction(gameField.field[i][j]);
            }
        }
    }

    public abstract void cellAction(Cell cell);
}
