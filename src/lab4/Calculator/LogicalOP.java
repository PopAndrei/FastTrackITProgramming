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


    //AM SA INCERC SA FAC PENTRU ORICE NUMAR INTRODUCI IN METODA
    // 9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
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








    //TEMA LAB 12 - WHILE


    public void toOneHundred (int number){
        while (number < 100){
            System.out.print(number + " ");
            number++;
        }
        while (number >= 100){
            System.out.print(number + " ");
            number--;
        }
    }

    public void toMinusOneHundred (int number){
        while (number < -100){
            System.out.print(number + " ");
            number++;
        }
        while (number >= -100){
            System.out.print(number + " ");
            number--;
        }
    }

    public void fromXtoY(int first, int second){
        while (first >= second){
            System.out.print(first + " ");
            first --;
        }
        while (first <= second) {
            System.out.print(first + " ");
            first ++;
        }
    }

    public void whileSmalltoBIG (int first, int second){
        if (first >= second){
            int x = first;
            first = second;
            second = x;
        }

        while (first <= second){
            System.out.print(first + " ");
            first++;
        }
    }


    public void evenTOhundred(){
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
            x++;
        }
    }
    public void oddTOhundred(){
        int x = 1;
        while (x <= 100){
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
            x++;
        }
    }

    public String fromANDaverage(){
        int first = 111;
        int second = 8899;
        int count = 0;
        int sum = 0;
        while (first <= second){
            sum += first;
            first ++;
            count ++;
        }
        return "The sum is: " + sum + "\n and the average is: " + (float)sum/count;
    }

    public String theAverageofSEVEN(int first, int second){
        if (first >= second){
            int x = first;
            first = second;
            second = x;
        }
        int count = 0;
        int sum = 0;
        while(first <= second){
            if(first % 7 == 0){
                sum += first;
                count ++;
            }
            first ++;
        }
        return "This is the average of the numbers divisible by 7:  " + (float)sum/count;
    }

    public void fibonacciNumbers(int number){
        int first = 0;
        int second = 1;
        int third = 0;
        int count = 0;
        System.out.print("The first " + number + " numbers of Fibonacci's String are: " + first + " " + second + " ");
        while (count <= number - 3){
            third = first + second;
            first = second;
            second = third;
            count ++;
            System.out.print(third + " ");
        }
    }


    public void CozaLozaWoza (){
        int x = 1;
        int count = 0;
        while (x <= 110){
            if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0){
                System.out.print("CozaLozaWoza ");
            }
            else if (x % 5 == 0 && x % 7 == 0){
                System.out.print("WozaLoza ");
            }
            else if (x % 3 == 0 && x % 7 == 0){
                System.out.print("CozaWoza ");
            }
            else if (x % 3 == 0 && x % 5 == 0){
                System.out.print("CozaLoza ");
            }
            else if(x % 7 == 0){
                System.out.print("Woza ");
            }
            else if (x % 5 == 0){
                System.out.print("Loza ");
            }
            else if (x % 3 == 0){
                System.out.print("Coza ");
            }
            else {
                System.out.print(x + " ");
            }
            if (x % 11 == 0) {
                System.out.println();
            }
            x++;
        }
    }
//10. Creati o metoda numita CozaLozaWoza.
//
//Metoda va afisa:
//
//- numerele de la 1 la 110
//
//- 11 numere pe linie
//
//- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//
//- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//
//- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//
//- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//
//- se va afisa CozaWoza pentru multiplu de 3 SI 7
//
//- se va afisa WozaLoza pentru multiplu de 5 SI 7
//
//- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
//
//Ar trebui sa arate similar:
//
//1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//
//Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//
//23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
//
//
//......9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.


    }
