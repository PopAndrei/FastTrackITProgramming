package lab5.Calculator;

public class Main {

    public static void main(String [] args){

        LogicalOP op = new LogicalOP();

        System.out.println("Exercitiul 1. \n" + op.sum(1,2,3,4));
        System.out.println(op.subtraction(100,10,10,10));
        System.out.println(op.multiply(5.5f,3.4f,10.5f));
        System.out.println(op.divide(1000,100,10,1));
        System.out.println("\nExercitiul 2.");



    }
}
