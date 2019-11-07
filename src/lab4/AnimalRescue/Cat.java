package lab4.AnimalRescue;

public class Cat extends Animal {

    Cat(){
        setName("Shane");
    }
    Cat(String name){
        setName(name);
    }

    public void talk (){
        System.out.println("Meow");
    }

    public void jump (){
        System.out.println("silent jump");
    }

    public void eat (){
        System.out.println("Purrring and eating");
    }
    public void move (){
        System.out.println("silent move");
    }
}
