package lab7;

import lab7.Calculator.Read;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Read read = new Read();
        int a = read.getInt();
        System.out.println("The number is: " + a);



//            System.out.print("Enter a String: ");
//        String string = scan.next();
//        System.out.println("The entered String is: " + string);


    }
}
