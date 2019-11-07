package lab4.AnimalRescue;

public class Dog extends Animal {


    Dog() {
        setName("Kapa");
        setAge(2);
        setBreed("WolfDog");
        setColor("White");
        setSex('F');
    }
    public void talk (){
        System.out.println("BARK");
    }

    public void jump (){
        System.out.println("the dog runs away");
    }

    public void eat (){
        System.out.println("munching munch munch");
    }
    public void move (){
        System.out.println("running in circles");
    }
}





