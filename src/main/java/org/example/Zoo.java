package org.example;

import java.util.List;

public record Zoo(List<Animal> animals) {
    public int calculateFoodRequirments(List<Animal> animals) {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.specie().foodRequirmentsGrams();
        }
        return sum;
    }
}
