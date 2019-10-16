package lab4.AnimalRescue;

public class Cat {

    String name = "Zara";
    String color = "grey-blue";
    String breed = "Russian Cat";
    float age = 5.5f;
    char sex = 'f';
    byte healthLevel = 8;
    byte hungerLevel = 3;
    byte happyLevel = 10;
    String favouriteFood = "Whiskas";
    String favouriteActivity = "sleeping";

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

    //animal: nume, vârstă, nivelul stării de sănătate (de la 1 la 10), nivelul senzației de foame (de la 1 la 10),
    // nivelul stării de spirit (de la 1 la 10), numele mâncării preferate, numele activității de recreere preferate
}
