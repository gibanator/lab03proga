package com.lab03.fairytale.interactions;
import com.lab03.fairytale.person.*;
import com.lab03.fairytale.environment.*;
import com.lab03.fairytale.Food;

import java.util.Objects;

public class WaiterClientInteraction implements Interactions{
    private Waiter w;
    private Eater e;

    public void addEater(Eater E){
        this.e = E;
    }
    public void addWaiter(Waiter W){
        this.w = W;
    }

    @Override
    public void Interaction(){
        Food f = w.getMeal();
        String s;
        if (w.getInfo()[1] == "female"){
            s = "Официантка ";
        }
        else
            s = "Официант ";
        System.out.println(s + w.getInfo()[0] + " приносит клиенту " + e.getInfo()[0] + " " + e.getNameOfFood() + ".");
    }
}
