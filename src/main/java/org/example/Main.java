package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Species mammal = new Species("mammal", 10000);
        Species cat = new Species("cat", 5000);

        Owner lionOwner = new Owner("John", 55, "Avenue des Champs-Élysées");
        Owner humansOwner = new Owner("Money", 55, "Federal Reserve");

        Animal lion = new Animal(1, cat, 6, lionOwner);
        Animal pinkPanter = new Animal(2, cat, 50, lionOwner);
        Animal human = new Animal(3, mammal, 6, humansOwner);

        System.out.println(lion.toString());
        System.out.println(pinkPanter.toString());
        System.out.println(lion.equals(pinkPanter));

        //Bonus
        List<Animal> animals = new ArrayList<>(Arrays.asList(lion, pinkPanter, human));
        Zoo ourZoo = new Zoo(animals);
        System.out.println("Our zoo requiers: " + ourZoo.calculateFoodRequirments(animals) + " grams of calories per day.");

    }
}