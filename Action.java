package com.lab03.fairytale;
import com.lab03.fairytale.environment.*;
import com.lab03.fairytale.interactions.WaiterClientInteraction;
import com.lab03.fairytale.person.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Action {
    private static Waiter[] waiters;
    private static Eater[] eaters;
    private static Table[] tables;

    public static void addWaiter(Waiter w){
        Waiter[] newarray = Arrays.copyOf(waiters, waiters.length+1);
        newarray[newarray.length - 1] = w;
        waiters = newarray;
    }
    public static void addEater(Eater e) {
        Eater[] newarray = Arrays.copyOf(eaters, eaters.length+1);
        newarray[newarray.length - 1] = e;
        eaters = newarray;
    }

    public static void addTable(Table t){
        Table[] newarray = Arrays.copyOf(tables, tables.length+1);
        newarray[newarray.length - 1] = t;
        tables = newarray;
    }
    public static void generate(int t){
        tables = new Table[0];
        eaters = new Eater[0];
        waiters = new Waiter[0];
        Random random = new Random();
        int i;
        int k;
        int overall_chairs = 0;
        int distorted = random.nextInt(4) + 1;
        int dancers = random.nextInt(4) + 1;
        System.out.println("Сгенерировано " + distorted + " смотрящихся в кривые зеркала.");
        for (i = 0; i < distorted; i++){
            Wanderer w = new Wanderer();
            System.out.println(w.toString());
        }
        System.out.println("\n");

        for (i = 0; i < dancers; i++) {
            Dancer d = new Dancer();
            System.out.println(d.toString());
        }
        System.out.println("\nА пока они развлекаются, другие едят: ");

        for (i = 0; i < t; i++) {
            int n = random.nextInt(3) + 2;
            Waiter w = new Waiter();
            addWaiter(w);
            System.out.println(w.toString());
            Table table = new Table(i, n);
            addTable(table);
            System.out.println(table.toString());
            for (k = 0; k < n; k++){
                Eater e = new Eater();
                e.setTable(table);
                if (e.getIfWants() == true)
                    addEater(e);
                System.out.println(e.toString());
            }
            overall_chairs += n;
            System.out.println("\n");
        }

        while (eaters.length != 0){
            for (i = 0; i < waiters.length; i++) {
                if (eaters.length == 0)
                    break;
                int a = random.nextInt(eaters.length);
                WaiterClientInteraction interaction = new WaiterClientInteraction();
                interaction.addWaiter(waiters[i]);
                interaction.addEater(eaters[a]);
                interaction.Interaction();
                for (; a < eaters.length-1;a++){
                    eaters[a] = eaters[a+1];
                }
                Eater[] newarray = Arrays.copyOf(eaters, eaters.length-1);
                eaters = newarray;
            }
        }
        System.out.println("Все посетители накормлены.");
    }
}
