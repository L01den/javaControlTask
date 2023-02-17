package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Toy builder = new Toy("Lego", 20, 1);
        Toy car = new Toy("Lamborghini", 20, 2);
        Toy robot = new Toy("Бамблби", 60, 3);

        List<Toy> allToys = new ArrayList<>();
        allToys.add(builder);
        allToys.add(car);
        allToys.add(robot);

//        for (Toy i: allToys) {
//            System.out.println(i);
//        }
        Toy.getAword(allToys, 10);
    }
}