package lab4.Calculator;


public class Main {

    public static void main(String[] args) {

      //  LogicalOP prob1 = new LogicalOP();
       // System.out.println(prob1.verifyFastTrack("Fasttrack"));

      //  System.out.println(prob1.between3and8(5));




        // Given a text input, if it is "FastTrack",
        // then print "Learning text comparison".
        // If not, print "Got to try some more"


        //Given a number, if it's equal to or higher than 2
        // and equal to or lower than 8, print the number

//FOR 1. Write a java program to count backwards from a given number to a lower given number

        LogicalOP lab4 =  new LogicalOP();
        lab4.countBackward(50,5);

        //Write a program called sumAndAverage to produce the sum of 1,2,3, .... to 100.
        // Also compute and display the average.

        System.out.println(lab4.sumAndAverage());

        //


        lab4.until100(50);
        System.out.println("\n");
        lab4.untilMinus100(-99);
        System.out.println("\n");
        lab4.betweenTwo(-3,16);
        System.out.println("\n");
        lab4.fromBIGtoSMALL(1, -10);
        System.out.println("\n");
        lab4.fromONEtoHUNDRED();

        }

    }


