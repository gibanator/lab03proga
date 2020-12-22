package com.lab03.fairytale.person;
import com.lab03.fairytale.*;
import com.lab03.fairytale.environment.*;

import java.util.Objects;

public class Waiter extends Person{
    private Food meal;
    private Table table;

    public Waiter(String Name, String Sex){
        super(Name, Sex);
    }
    public Waiter() {
        super();
    }

    public Table getTable() {
        return table;
    }

    public Food getMeal(){
        return this.meal;
    }

    @Override
    public String toString() {
        return String.format("Сгенерирован официант с именем " + getInfo()[0] + ".");
    }

    public int hashCode() {
        return Objects.hash(meal, table);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waiter w = (Waiter) o;
        return (meal == w.meal) && (table.equals(w.table));
    }
}
