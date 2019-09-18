package lab2;

public class Main {
    public static void main(String[] args) {

      int x = 24;
      int y = 4;
      int sum = sum(x,y);
        System.out.println("The result of the sum is: " + sum);

      int subtraction = subtraction(x,y);
        System.out.println("The result of the subtraction is: " + subtraction);

      int multiply = multiply(x,y);
        System.out.println("The result of the multiplication is: " + multiply);

      int divide = divide(x,y);
        System.out.println("The result of the division is: " + divide);


    }

    public static int sum (int first, int second) {
        int rez = first + second;
        return rez;
    }
    public static float sum ()
    public static int subtraction (int first, int second) {
        int rez = first - second;
        return rez;
    }
    public static int multiply (int first, int second) {
        int rez = first * second;
        return rez;
    }
    public static int divide (int first, int second) {
        int rez = first / second;
        return rez;
    }
}