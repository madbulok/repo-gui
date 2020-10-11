package homework;

public class Cat extends Animal {

    private String name;
    private static int countCat = 0;

    public Cat(String name) {
        this.name = name;
        MAX_DISTANCE_RUN = 200;
        MAX_DISTANCE_SWIMM = 0;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) return;
        if (distance < MAX_DISTANCE_RUN) System.out.printf("%s пробежал %d метров.\n", name, distance);
        else System.out.printf("%d метров слишком много!\n", distance);
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) return;
        System.out.println("Кот не уммет плавать!");
    }
}
