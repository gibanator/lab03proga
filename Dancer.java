package com.lab03.fairytale.person;

import java.util.Objects;

public class Dancer extends Person{
    @Override
    public String toString() {
        return String.format(getInfo()[0] + " танцует.");
    }

    public int hashCode() {
        return Objects.hash();
    }
}
