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
                + "Urmeaza punctul 3. Let's do some more calculus!" + "\n");

        byte a3 = 10;
        byte b3 = 4;
        float c3 = a3/b3;
        float d3 = (float) a3 / b3;
        System.out.printf("%.3f", c3);
        System.out.println("\n" + d3 + " - Nu inteleg aici de ce imi afiseaza rezultatul corect, dar la modelul anterior nu..." + "\n"
                + "Aha! am descoperit, trebuie macar o variabila dintre a si b sa fie float sau double"  + "\n"
                + "(ceva ce poate sa contina si ce e dupa virgula), altfel facea o operatie normala de integer" + "\n");

        float a2 = 344f;
        byte b2 = 5;
        float c2 = a2/b2;
        System.out.println(c2);

        System.out.println("\n"
        + "Urmeaza punctul 4. MORE!" + "\n");

        /* 4. Printati rezultatul urmatoarelor operatiuni:

        a. -5 + 8 * 6

        b. (55+9) % 9

        c. 20 + -3*5 / 8

        d. 5 + 15 / 3 * 2 - 8 % 3 */

        int a = -5;
        int b = 8;
        int c = 6;
        int d = a + (b * c);
        System.out.println( "Rezultatul operatiunii a. este: " + d);

        a = 55;
        b = 9;
        c = (a + b) % b;
        d = (55 + 9) % 9;
        System.out.println("Rezultatul operatiunii b. este: " + c + " sau " +  d);

        float e = 20 + (float)(-3*5) / 8;
        System.out.println("Rezultatul operatiunii c. este: " + e);

        a = 5;
        b = 15;
        c = 3;
        int f = 2;
        int g = 8;

        int h = a + b / c * f - g % c;

        d = 5 + 15 / 3 * 2 - 8 % 3;
        e = a + (float)b / c * --c - (a+c) % c;
        System.out.println("Rezultatul operatiunii d. este: " + d + " " +  e + " " + h);

    }
}