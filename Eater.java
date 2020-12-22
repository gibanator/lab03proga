package com.lab03.fairytale.person;
import com.lab03.fairytale.*;
import com.lab03.fairytale.environment.*;

import java.util.Objects;
import java.util.Random;

public class Eater extends Person{
    private Food meal;
    private Table table;
    private boolean wants_to_eat;

    public Eater(String Name, String Sex){
        super(Name, Sex);
        final Random random = new Random();
        this.meal = Food.getRandomFood();
    }
    public Eater(){
        super();
        final Random random = new Random();
        this.meal = Food.getRandomFood();
        int i = random.nextInt(4);
        if (i == 0) {
            wants_to_eat = false;
        }
        else{
            wants_to_eat = true;
        }
    }

    public void setTable(Table t){
        this.table = t;
    }

    public Table getTable() {
        return table;
    }

    public String getNameOfFood() {
        if (this.wants_to_eat == true)
            return this.meal.label;
        else
            return "ничего";
    }

    public boolean getIfWants() {
        return this.wants_to_eat;
    }

    public Food getMeal(){
        return this.meal;
    }

    @Override
    public String toString() {
        return String.format("Сгенерирован посетитель с именем " + getInfo()[0] + ", сидящий за столом с номером " + table.getNumber() + ". Он хочет " + getNameOfFood());
    }

    public int hashCode() {
        return Objects.hash(meal, table, wants_to_eat);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eater e = (Eater) o;
        return (meal == e.meal) && (table.equals(e.table)) && (wants_to_eat == e.wants_to_eat);
    }
}
