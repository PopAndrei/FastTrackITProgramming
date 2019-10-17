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

        System.out.println("\nCat Name :"+ cat1.name + "\n" + "Age: " + cat1.age + "\n" + "Health Level: "+ cat1.healthLevel +
                "\n" + "Hunger Level: "+ cat1.hungerLevel + "\n" + "Happy Level: "+cat1.happyLevel +
                "\n" + "Favourite food: "+ cat1.favouriteFood +
                "\n" + "Favourite activity: "+cat1.favouriteActivity);


        Adopter vlad = new Adopter();

        System.out.println("\n" + "Adopter Name: " + vlad.adopterName + "\n" + "Budget: " + vlad.money);


        CatFood whiskas = new CatFood();

        System.out.println("\n Food Name: " + whiskas.foodName + "\n Price: " + whiskas.price + "\n Quantity: " + whiskas.quantity +
                "\n In Stock: " + whiskas.inStock);

        FavoriteActivity activity = new FavoriteActivity();

        System.out.println("\n Favourite Activity Name: " + activity.favoriteActivity);

        Veterinarian vet = new Veterinarian();

        System.out.println("\n Name of Vetenerian: " + vet.vetName + "\n Specialization: " + vet.vetSpecialization);


        //În metoda main din clasa Main din pachetul AnimalRescue,
        // creați cel puțin câte o instanță a fiecărui obiect și afisați valorile.


    }
}
