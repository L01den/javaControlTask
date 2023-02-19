package org.example;

import java.io.*;
import java.util.List;

class Toy {
    private String name;
    private int id;
    private int dropRate;


    public Toy(String name, int drop, int id){
        this.name = name;
        dropRate = drop;
        this.id = id;

    }

    public String getName() {
        return name;
    }
    public static void getAword(List<Toy> toys, int n){
        int num;
        String toy;
        for (int i = 0; i < n; i++) {
            num = (int)(Math.random()*100);
            if(num >= 0 && num <= 20){
                toy = toys.get(0).toString();
                System.out.println(toy);
            }else if(num >= 20 && num <= 40){
                toy = toys.get(1).toString();
                System.out.println(toy);
            } else{
                toy = toys.get(2).toString();
                System.out.println(toy);
            }
            WorkFile.writeFile(toy);
        }

    }

    public int getId() {
        return id;
    }

    public double getDropRate() {
        return dropRate;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Toy{" +
                "name- '" + name + '\'' +
                ", id - " + id +
                '}';
    }


}
