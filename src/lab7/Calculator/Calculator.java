package lab7.Calculator;

import java.util.List;

public class Calculator {

    public void infiniteStar(int numberOfStars){
        int row = 0;
        for (int i = 0; i <= numberOfStars; i++){
            row++;
            System.out.print("\n" + "\n");

            for (int j = 0; j <= numberOfStars - row; j++ ) {
                System.out.print("*");
            }
        }
    }

    public float sum (float first, float second){ return first + second; }

    public float subtraction (float first, float second){ return first - second; }

    public float multiply (float first, float second) { return first * second;}

    public float divide (float first, float second) { return first/second; }

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

    public void arrangeArray (int [] array){

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++)
                if (array[i] >= array[j]) {
                    int number = array[i];
                    array[i] = array[j];
                    array[j] = number;
                }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void indexAndPosition (List<Integer> mylist){
        for (int i = 0; i < mylist.size(); i ++){
            System.out.println("Pe pozitia "+ i + " valoarea este " + mylist.get(i));
        }
    }


}
