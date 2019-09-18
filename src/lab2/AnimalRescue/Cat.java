package lab2.AnimalRescue;

public class Cat {

    String name = "Zara";
    String color = "grey-blue";
    String breed = "Russian Cat";
    float age = 5.5f;
    char sex = 'f';

    public void meow (){
        System.out.println("Meooow!");
    }

    public void jump (){
        System.out.println("...silent jump...");
    }

    public void eat (){
        System.out.println("Eating and purring...");
    }
    public void rub_against (){
        System.out.println(name + " is rubbing against your leg.");
    }

    public void purring () {
        System.out.println("The cat is purring...");
    }
}
