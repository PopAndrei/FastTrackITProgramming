package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1.name);

        cat1.jump();
        cat1.meow();
        cat1.name = "Sarah";

        System.out.println("I'll name you... Sarah...");
        cat1.purring();
        cat1.rub_against();

    }
}
