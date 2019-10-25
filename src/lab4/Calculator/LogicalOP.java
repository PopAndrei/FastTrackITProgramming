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
        //abia dupa ce am iesit ieri la tabla pt exercitiul asta mi-am dat seama ca numele metodei e gresit :)))
        // (ar trebui sa fie de la mic la mare) :))))
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

    public void oddOnetoHundred () {
        for (int i = 1; !(i % 2 == 0) && i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }

    public int sumtoHundred (int number){
        int sum = 0;
       if (number <= 100){
               for (int i = number; i <= 100; i++){
            sum += i;
        }
        return sum;
       }
       else {
               for (int i = number; i >= 100; i--){
                   sum += i;
               }
               return sum;
       }
    }


    public float averageToHundred (int number){
        int sum = 0;
        int counter = 0;
        if (number <= 100){
            for (int i = number; i <= 100; i++){
                sum += i;
                counter ++;
            }
            return (float)sum/counter;
        }
        else {
            for (int i = number; i >= 100; i--){
                sum += i;
                counter ++;
            }
            return (float)sum/counter;
        }
    }

//    public void star(int numberOfStars){
//       int counter = 0;
//        for (int i = numberOfStars; i > 0 ; i--) {
//            counter ++;
//            System.out.print("*" + counter);
//            if (i == 0){
//                System.out.println("\n");
//            }
//            else {
//                for ()
//            }

//            if(counter == numberOfStars){
//                System.out.println("\n");
//            }
//            for (int j = i; j == 0; j--){
//                    System.out.print("7");
//                }
//            }
//
//    }

    public void infiniteStar(int numberOfStars){
        int row = 0;
        for (int i = 0; i <= numberOfStars; i++){
            row++;
            System.out.print("\n" + "\n");

            {for (int j = 0; j <= numberOfStars - row; j++ ) {
                System.out.print("*");
            }
            }
        }
    }


    //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    //
    //
    //*******
    //
    //******
    //
    //*****
    //
    //****
    //
    //***
    //
    //**
    //
    //*
    //
    //Cateva mentiuni:
    //- pentru a putea rezolva problema, trebuie folosite doua bucle for. O bucla se va construi in alta bucla.
    //
    //- prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
    //
    //- semnul asterisk (*) se poate afisa sub forma de string
    //
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.



    }
