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

        System.out.println("\n\nExercitiul 7. ");
        op.arraySYMBOL('$'); //am scris metoda in asa fel incat sa se poata pune orice caracter aici, chiar si acea linie
        System.out.println("\n\nExercitiul 8. ");
        op.displayWithout(emptyArray, 5);

        System.out.println("\n\nExercitiul 9. ");
        emptyArray = new int [] {-10,2,3,4,5,-13,7,-11,9,10};
        op.secondLowest(emptyArray);

        System.out.println("\n\nExercitiul 10. ");
        int [] firstArray = new int [] {10,2,3,4,5,13,7,11,9,10};
        emptyArray = new int [10];
        op.copyArray(firstArray,emptyArray);

        System.out.println("\n\n LAB 13 TEMA OPTIONALA ARRAYS - Exercitiul 1. ");
        int [] anotherArray = new int []{-1,-1,-3,4,5,13,7,11,9,10};
        op.secondLow(anotherArray);

        System.out.println("\n\nExercitiul 2. ");
        op.insertINarray(3, 7,anotherArray);

        System.out.println("\n\nExercitiul 3. ");
        op.lowestANDbiggest(anotherArray);

        System.out.println("\n\nExercitiul 4. ");
        anotherArray = new int []{1,2,3,4,5,6,7};
        op.reverseArray(anotherArray);

        System.out.println("\n\nExercitiul 5. ");
        anotherArray = new int []{-1,-1,-3,4,5,13,7,11,9,10,13};
        op.duplicateElements(anotherArray);

        System.out.println("\n\nExercitiul 6. ");
        String [] firstarray = new String []{"Andrei", "Cosmin", "Diana", "Vlad"};
        String [] secondarray = new String [] {"Andre", "Cosmin", "Dina", "Vlad Tepes", "Andrei"};
        op.duplicateStrings(firstarray,secondarray);

        System.out.println("\n\nExercitiul 7. ");
        anotherArray = new int[]{10,2,3,4,5,13,7,11,9,10};
        op.arrangeArray(anotherArray);







    }
}
