package lab3.Calculator;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        LogicalOP prob1 = new LogicalOP();
       // System.out.println(prob1.verifyFastTrack("Fasttrack"));

        System.out.println(prob1.between3and8(5));

        Calculator calc = new Calculator();

        System.out.println("\n sum: " + calc.sum(20,10) + "\n subtract: " + calc.subtraction(20,10) +
                "\n multiply: " + calc.multiply(20,10) + "\n divide: " + calc.divide(20,10));


        LogicalOP temaOP = new LogicalOP();
        System.out.println( "\n the bigger number is: "+temaOP.checkBiggerNumber(20,10));

        System.out.println(temaOP.isItFastTrack("FastTrackIT"));
        System.out.println(temaOP.fastTrackandNumber("FastTrackIT", -3));
        System.out.println(temaOP.snow(7));
        System.out.println(temaOP.numberEqual(4));

        System.out.println(temaOP.verifyNumber(100));


        System.out.println(temaOP.isNumberEven(-99));
        System.out.println(temaOP.isEligibleToVote(28));

        System.out.println(temaOP.biggestNumber(-10,100,50));



        // Given a text input, if it is "FastTrack",
        // then print "Learning text comparison".
        // If not, print "Got to try some more"


        //Given a number, if it's equal to or higher than 2
        // and equal to or lower than 8, print the number




    }
}
