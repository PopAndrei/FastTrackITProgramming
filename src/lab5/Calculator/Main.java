package lab5.Calculator;

public class Main {

    public static void main(String [] args){

        LogicalOP op = new LogicalOP();

        System.out.println("Exercitiul 1. \n" + op.sum(1,2,3,4));
        System.out.println(op.subtraction(100,10,10,10));
        System.out.println(op.multiply(5.5f,3.4f,10.5f));
        System.out.println(op.divide(1000,100,10,1));
        System.out.println("\nExercitiul 2. \nValorile din acest array sunt: ");
        op.pozitii();
        System.out.println("\n\nExercitiul 3. \nValorile din acest array sunt: ");
        int [] emptyArray = new int [50];
        op.evenArray(emptyArray);
        System.out.println("\n\nExercitiul 4. ");
        emptyArray = new int [4];
        System.out.println(op.averageArray(emptyArray));
        System.out.println("\n\nExercitiul 5. ");

        String [] wordArray = new String [] {"Amdrei", "Ardei", "Andei", "Anrei", "Aluetu", "Andrei"};
        System.out.println(op.checkString(wordArray, "Andrei"));

        System.out.println("\n\nExercitiul 6. ");
        emptyArray = new int [] {1,2,3,4,5,6,7,8,9,10};
        op.checkPosition(emptyArray, 8);






    }
}
