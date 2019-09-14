public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome,");

        //Types of data
        String firstName = "Andrei";
        String lastName = "Pop";
        byte age = 29;
        char sex = 'M';
        float height = 1.91f;
        String race = "human";
        String eyeColor = "green";
        String hairColor = "light brown";

        short bones = 206;
        short muscles = 650;
        double hairs = 5000000d;

        System.out.println( "\t" + firstName + " " + lastName + "\n"
                + "\t" + age + " " + sex + "\n"
                + "\t" + race + "\n"
                + "\t" + height + "m tall" + "\n"
                + "\t" + hairColor + " hair" + "," + " " + eyeColor + " eyes");

        int bonesAndMuscles = bones + muscles;
        System.out.println("\n" + "The total sum of Andrei's number of bones and muscles is: " + bonesAndMuscles );

        double distributionOfHair = hairs/(bones + muscles);
        System.out.println( "\n" + "The distribution of hair: " + distributionOfHair);
        System.out.printf("\t\t\t" + "Other Method: " + "%.12f", distributionOfHair);
        System.out.println("\n"
                + "\n"
                + "Urmeaza punctul 3. Let's do some more calculus!");

        float a = 10f;
        byte b = 4;
        float c = a/b;
        float d = (float) a / b;
        System.out.printf("%.1f", c);
        System.out.println("\n" + d + " - Nu inteleg aici de ce imi afiseaza rezultatul corect, dar la modelul anterior nu..." + "\n"
                + "Aha! am descoperit, trebuie macar o variabila dintre a si b sa fie float sau double (ceva ce poate sa contina si ce e dupa virgula), altfel facea o operatie normala de integer  " + "\n"
        + "Urmeaza punctul 4. MORE!");



    }
}