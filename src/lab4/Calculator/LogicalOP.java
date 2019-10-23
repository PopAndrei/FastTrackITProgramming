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

    //TEMA LAB 12 - FOR


    public void until100 (int number){
        if (number >= 100) {
            for (int i = number; i >= 100; i--) {
                System.out.print(i + " ");
            }
        }
            else {
                for (int i = number; i<= 100; i++){
                    System.out.print(i + " ");
            }
        }
    }

    public void untilMinus100 (int number){
        if (number >= -100) {
            for (int i = number; i >= -100; i--) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = number; i<= -100; i++){
                System.out.print(i + " ");
            }
        }
    }

    public void betweenTwo (int first, int second){
        if (first >= second){
            for ( int i=first; i >= second; i--){
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = first; i <= second; i++ ){
                System.out.print(i + " ");
            }
        }
    }

    public void fromBIGtoSMALL(int first, int second){
        if (first >= second) {
            for (int i = second; i <= first; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = first; i <= second; i++){
                System.out.print(i + " ");
            }
        }
    }

    public void fromONEtoHUNDRED () {
        for (int i = 2; i % 2 == 0 && i <= 100; i+=2) {
//            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


    //}

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.



    }
