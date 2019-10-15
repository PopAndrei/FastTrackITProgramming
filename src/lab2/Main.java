package lab2;

public class Main {
    public static void main(String[] args) {

        System.out.println("For the first problem in the homework:" + "\n");

        salut();


      float x = 24.5f;
      int y = 4;
      float sum = sum(x,y);
        System.out.println("1.2  The result of the sum is: " + sum);

        x = 10;
        y = 3;
        System.out.println("1.3  " + divide(x,y));

        System.out.println("1.4  " + "\n" + "\t" + "a." + punctulA(5,8,6) + "\n" + "\t" + "b." + punctulB(55,9) +
                "\n" + "\t" + "c." +punctulC(20,3,5,8) +
                "\n" + "\t" + "d." + punctulD(5,15,3,2,8) + "\n");

        System.out.println("For the next part of the homework:" + "\n" + "\n" + "\n" + "2." + "\n");



      float subtraction = subtraction(x,y);
        System.out.println("The result of the subtraction is: " + subtraction);

        int secondSum = sum(33,33);
        System.out.println("The result of the sum is: "+ secondSum);

      float multiply = multiply(x,y);
        System.out.println("The result of the multiplication is: " + multiply);

      float divide = divide(x,y);
        System.out.println("The result of the division is: " + divide);

        System.out.println("\n" + "3.");
        writeJAVA();

        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("\n" + "4. The average of the three numbers is:" + "\t" + average(a,b,c));

        System.out.println("\n" + "5.");
        displayFace();

        System.out.println("\n" + "6. The remainder of the division is:" + "\t" + remainderDivision(13,4));

        System.out.println("\n" + "7. The conversion of Fahrenheit to Celsius is: " + convertToCelsius(80));

        System.out.println("\n" + "8. The convertion of inches to meters is: " + convertToMeters(100));

        System.out.println("\n" + "9. The calculated speed is: ");
        calculateSpeed(100000, 1, 13, 45);





    }

    //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
// si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)

    public static void calculateSpeed (float meters, float hours, float minutes, float seconds) {
        float timeHours = hours + minutes/60 + seconds/3600;
        float timeSeconds = hours*3600 + minutes*60 + seconds;
        float km = meters/1000;
        float miles = meters/1609;
        float speedMs = meters / timeSeconds;
        float speedKmh = km / timeHours;
        float speedMph = miles/timeHours;


        System.out.println("The speed in Meter/Second is: " + speedMs + "\n" + "The speed in Kilometers/Hour is: " + speedKmh +
                "\n" + "The speed in Miles/Hour is: " + speedMph);
    }


    public static void writeJAVA () {
        System.out.println("       J " + "   a   " + " V     V " + "   a   ");
        System.out.println("       J " + "  a a  " + "  V   V  " + "  a a  ");
        System.out.println(" J     J " + " aaaaa " + "   V V   " + " aaaaa ");
        System.out.println("   J J   " + "a     a" + "    V    " + "a     a");
    }

    public static int average (int first, int second, int third) {return (first + second + third)/3;}

    public static void displayFace () {
        System.out.println(" +\" \"\"\" \"+ ");
        System.out.println("[| o   o |]");
        System.out.println(" |   ^   |");
        System.out.println(" |  \'-\'  |");
        System.out.println(" +__ _ __+");
    }

    public static int remainderDivision (int first, int second) {return first%second;}

    public static float convertToCelsius (float fahrenheit) {
        //C = 5/9 * (F -32)
        float celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static float convertToMeters (float inches) {
        float meters = inches / 39.37f;
        return meters;
    }


    public static void salut () {
        System.out.println("Hello" + "\n" + "\t" + "Andrei" + "\n");
    }



    public static int sum (int first, int second) {
        int rez = first + second;
        return rez;
    }
    public static float sum (float first, float second){
        return first + second;
    }

    public static int subtraction (int first, int second) {
        int rez = first - second;
        return rez;
    }
    public static float subtraction (float first, float second){ return first - second; }

    public static int multiply (int first, int second) {
        int rez = first * second;
        return rez;
    }
    public static float multiply (float first, float second) { return first * second;}
    public static int divide (int first, int second) {
        int rez = first / second;
        return rez;
    }
    public static float divide (float first, float second) { return first/second; }

    public static int punctulA (int first, int second, int third) { return -first + second * third;    }

    public static int punctulB (int first, int second) { return (first +second) % second;}
    public static float punctulC (float first, float second, float third, float fourth) { return first + (-second * third) / fourth;}
    public static int punctulD (int first, int second, int third, int fourth, int fifth) {return first + second / third * fourth - fifth % third;}
}