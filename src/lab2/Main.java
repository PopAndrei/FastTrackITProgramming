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


    }

    public static void writeJAVA () {
        System.out.println("       J " + "   a   " + " V     V " + "   a   ");
        System.out.println("       J " + "  a a  " + "  V   V  " + "  a a  ");
        System.out.println(" J     J " + " aaaaa " + "   V V   " + " aaaaa ");
        System.out.println("   J J   " + "a     a" + "    V    " + "a     a");
    }



    public static void salut() {
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