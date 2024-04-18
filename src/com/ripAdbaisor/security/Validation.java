package com.ripAdbaisor.security;

import java.util.ArrayList;

import com.ripAdbaisor.business.Restaurant;

public class Validation extends Restaurant{
    protected final String[] LOCATIONLIST = {"Tenerife","Gomera","Hierro","Palma","Gran Canaria","Fuerteventura","Lanzarote"}; 
    protected int userInput;

    public Validation(String name, String location, String schedule, float mark) {
        super(name, location, schedule, mark);
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public boolean ValidateLocation(String location){
        boolean isEqual = false;
        for (String string : LOCATIONLIST) {
            if (string.equals(location)) {
                isEqual = true;
            }
        }
        return isEqual;
    }
}
