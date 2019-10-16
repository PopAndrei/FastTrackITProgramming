package lab4.Calculator;

public class LogicalOP {


    public String verifyFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    public int between3and8(int number) {
        if (number >= 2 && number <= 8) {
            return number;
        } else {
            return (0);

        }
    }

    public void countBackward(int firstBig, int secondLow) {
        for (int i = firstBig; i >= secondLow; i--) {
            System.out.println(i);
        }
    }

    public float sumAndAverage() {
        float sum = 0;
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            counter += 1;

        }
        return (sum / counter);
    }

    //Write a program to sum only the odd number from 1 to 100, and compute the average.

    public float oddSumandAverage(){

    }
}