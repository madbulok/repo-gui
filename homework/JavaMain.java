package homework;

import java.util.Random;

public class JavaMain {

    public static void main(String[] args) {
        Random random = new Random();

        Plate plate = new Plate(100);

        Animal[] animalArray = {
                new Cat("Барсик", random.nextInt(20) + 10),
                new Cat("Персик", random.nextInt(20) + 10),
                new Cat("Косточка", random.nextInt(20) + 10)
        };

        for (Animal pet: animalArray) {
            pet.eat(plate);
        }

        plate.increaseFood(50);

        System.out.printf("%d котов создано.\n", Cat.getCountCat());
        System.out.printf("%d собак создано.\n", Dog.getCountDog());
    }
}


