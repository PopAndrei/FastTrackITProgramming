package lab2.AnimalRescue;

public class Cat {

   private String name;
   private String color;
   private String breed;
   private float age;
   private char sex;
   private byte healthLevel;
   private byte hungerLevel;
   private byte happyLevel;
   private String favouriteFood;
   private String favouriteActivity;

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

    public void setName(String newName){
        this.name = newName;
    }
    public String getName (){
        return name;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getColor (){
        return color;
    }

    public void setBreed (String newBreed){
        this.breed = newBreed;
    }
    public String getBreed() {
        return breed;
    }

    public void setAge(float newAge){
        this.age = newAge;
    }
    public float getAge(){
        return age;
    }

    public void setSex(char newSex){
        this.sex = newSex;
    }
    public char getSex(){
        return sex;
    }

    public void setHealthLevel(byte newHealthLevel){
        this.healthLevel = newHealthLevel;
    }
    public byte getHealthLevel(){
        return healthLevel;
    }

    public void setHungerLevel (byte newHungerLevel){
        this.hungerLevel = newHungerLevel;
    }
    public byte getHungerLevel(){
        return hungerLevel;
    }

    public void setHappyLevel(byte newHappyLevel){
        this.happyLevel = newHappyLevel;
    }
    public byte getHappyLevel(){
        return happyLevel;
    }

    public void setFavouriteFood(String newFavourieFood){
        this.favouriteFood = newFavourieFood;
    }
    public String getFavouriteFood(){
        return favouriteFood;
    }

    public void setFavouriteActivity(String newFavouriteActivity){
        this.favouriteActivity = newFavouriteActivity;
    }
    public String getFavouriteActivity(){
        return favouriteActivity;
    }


}
