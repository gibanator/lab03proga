package com.lab03.fairytale.person;

import com.lab03.fairytale.Food;

import java.util.Random;

public abstract class Person {
    private String name;
    private String sex;

    public Person(String Name, String Sex){
        this.name = Name;
        this.sex = Sex;
    }

    public Person(){
        Random random = new Random();
        int n = random.nextInt(2);
        if (n == 0) {
            this.sex = ("male");
            this.name = BoyNames.getRandomName().label;
        }
        else{
            this.sex = ("female");
            this.name = GirlNames.getRandomName().label;
        }
    }
    public String[] getInfo(){
        String[] info = new String[2];
        info[0] = this.name;
        info[1] = this.sex;
        return info;
    }
}


