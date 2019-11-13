package lab7.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int getInt (){
        int number = 0;
        boolean repeat = false;
      do {  try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number: ");
            number = scan.nextInt();
            repeat = false;
        }catch (InputMismatchException e){
            System.out.println("Incorrect value entered, please input a number.");
          repeat = true;
        }
        } while (repeat == true);
        return number;
    }

}
