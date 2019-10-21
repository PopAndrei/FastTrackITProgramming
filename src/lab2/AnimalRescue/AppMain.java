package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        //System.out.println(cat1.name);

        cat1.jump();
        cat1.meow();
        //cat1.name = "Sarah";

        System.out.println("I'll name you... Sarah...");
        cat1.purring();
        cat1.rub_against();

        cat1.setName("Sarah");
        cat1.setAge(5);
        cat1.setHealthLevel((byte) 9);
        cat1.setHungerLevel((byte)10);
        cat1.setHappyLevel((byte)3);
        cat1.setFavouriteFood("Whiskas");
        cat1.setFavouriteActivity("sleeping");

        System.out.println("\nCat Name :"+ cat1.getName() + "\n" + "Age: " + cat1.getAge() + "\n" + "Health Level: "+ cat1.getHealthLevel() +
                "\n" + "Hunger Level: "+ cat1.getHungerLevel() + "\n" + "Happy Level: "+cat1.getHappyLevel() +
                "\n" + "Favourite food: "+ cat1.getFavouriteFood() +
                "\n" + "Favourite activity: "+cat1.getFavouriteActivity());


        Adopter vlad = new Adopter();
        vlad.setAdopterName("Vlad");
        vlad.setMoney(200);

        System.out.println("\n" + "Adopter Name: " + vlad.getAdopterName() + "\n" + "Budget: " + vlad.getMoney());


        CatFood whiskas = new CatFood();
        whiskas.setFoodName("Whiskas");
        whiskas.setPrice(50);
        whiskas.setQuantity(10);
        whiskas.setInStock(true);

        System.out.println("\n Food Name: " + whiskas.getFoodName() + "\n Price: " + whiskas.getPrice() + "\n Quantity: " + whiskas.getQuantity() +
                "\n In Stock: " + whiskas.getInStock());

        FavoriteActivity activity = new FavoriteActivity();
        activity.setFavoriteActivity("sleeping");

        System.out.println("\n Favourite Activity Name: " + activity.getFavoriteActivity());

        Veterinarian vet = new Veterinarian();
        vet.setVetName("Hank");
        vet.setVetSpecialization("Intensive Care");

        System.out.println("\n Name of Vetenerian: " + vet.getVetName() + "\n Specialization: " + vet.getVetSpecialization());


        //În metoda main din clasa Main din pachetul AnimalRescue,
        // creați cel puțin câte o instanță a fiecărui obiect și afisați valorile.


    }
}
