package lab3.Calculator;

public class LogicalOP {


    //public String verifyFastTrack(String text) {
    //  if (text.equals("FastTrack")) {
    //     return ("Learning text comparison");
    //  } else {
    //     return ("Got to try some more");
    //  }
    //  }

    public int between3and8(int number) {
        if (number >= 2 && number <= 8) {
            return number;
        } else {
            return (0);

        }
    }

    public int checkBiggerNumber(int first, int second) {

        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    public String isItFastTrack(String first) {
        if (first.equals("FastTrackIT")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }


    }

    public String fastTrackandNumber(String first, int second) {
        if (first.equals("FastTrackIT") && second <= 3) {
            return (first + " " + second);
        } else {
            return (second + " " + first);
        }
    }


    public String snow(int number) {
        if (number > 8 || number == 6) {
            return ("The amount of snow this winter was(cm): " + number);
        } else {
            return ("The forcast snow is(cm): " + number);
        }
    }

    public String numberEqual(int number) {
        if (number > 3 && number != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (number == 4) {
            return ("The number is equal to 4");
        } else {
            return ("The number is lower than 3");
        }
    }

    public String verifyNumber(int number) {
        switch (number) {
            case 5:
                return ("The number is: 5");

            case 10:
                return ("The number is: 10");

            case 25:
                return ("The number is: 25");


            default:
                return ("The number is: " + number);
        }
    }

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String biggestNumber(int first, int second, int third) {
        if (first >= second && first >= third) {
            return ("The bigger number is: " + first);
        } else if (second >= first && second >= third) {
            return ("The bigger number is: " + second);
        } else {
            return ("The bigger number is: " + third);
        }
    }
}
