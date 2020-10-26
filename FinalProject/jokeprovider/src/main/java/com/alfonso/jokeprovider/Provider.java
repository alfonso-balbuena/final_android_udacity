package com.alfonso.jokeprovider;

import java.util.Arrays;
import java.util.List;

public class Provider {
    private int index;
    private List<String> jokes;

    public Provider() {
        index = 0;
        jokes = Arrays.asList("Why do fish live in saltwater? \n Because pepper makes them sneeze!","Why are giraffes’ necks so long? \n Because they have really smelly feet!");
    }

    public String getJoke() {
        if(index == jokes.size())
            index = 0;
        return jokes.get(index++);
    }
}