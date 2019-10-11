package lab2;

public class Main {
    public static void main(String[] args) {

        salut();


      float x = 24.5f;
      int y = 4;
      float sum = sum(x,y);
        System.out.println("2. The result of the sum is: " + sum);

        x = 10;
        y = 3;
        System.out.println("3. " + divide(x,y));

        System.out.println("4. " + "\n" + "\t" + "a." + punctulA(5,8,6) + "\n" + "\t" + "b." + punctulB(55,9) +
                "\n" + "\t" + "c." +punctulC(20,3,5,8) +
                "\n" + "\t" + "d." + punctulD(5,15,3,2,8) + "\n");





      float subtraction = subtraction(x,y);
        System.out.println("The result of the subtraction is: " + subtraction);

      float multiply = multiply(x,y);
        System.out.println("The result of the multiplication is: " + multiply);

      float divide = divide(x,y);
        System.out.println("The result of the division is: " + divide);


    }

    public static void salut() {
        System.out.println("Hello" + "\n" + "Andrei");
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