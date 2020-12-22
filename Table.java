package com.lab03.fairytale.environment;

import com.lab03.fairytale.person.Eater;

import java.util.Objects;

public class Table extends EnvironmentEntity{
    private int NumOfChairs;
    private int number;

    public Table(int Number, int chairs){
        super("Стол");
        this.number = Number;
        this.NumOfChairs = chairs;
    }

    public int getNumber() {
        return this.number;
    }
    @Override
    public String toString() {
        return String.format("Сгенерирован стол с " + NumOfChairs + " стульями под номером " + number + ".");
    }

    public int hashCode() {
        return Objects.hash(NumOfChairs, number);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table t = (Table) o;
        return (number == t.number) && (NumOfChairs == t.NumOfChairs);
    }
}
