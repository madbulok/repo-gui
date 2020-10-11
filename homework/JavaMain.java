package homework;

import java.util.Random;

public class JavaMain {

    public static void main(String[] args) {
        Random random = new Random();

        Animal[] animalArray = {
                new Cat("Барсик"),
                new Cat("Персик"),
                new Cat("Косточка"),
                new Dog("Жучок"),
                new Dog("Хатико"),
                new Dog("Чарли")
        };

        for (Animal person: animalArray) {
            person.run(random.nextInt(700));
            person.swim(random.nextInt(15));
        }

        System.out.printf("%d котов создано.\n", Cat.getCountCat());
        System.out.printf("%d собак создано.\n", Dog.getCountDog());
    }
}


