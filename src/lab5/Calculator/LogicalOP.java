package lab5.Calculator;

public class LogicalOP {


    public int sum (int first, int second){return first + second;}
    public int sum (int first, int second, int third, int fourth){return first + second + third + fourth;}
    public float sum (float first, float second){ return first + second; }
    public float sum (float first, float second, float third){ return first + second + third; }

    public int subtraction (int first, int second){return first - second;}
    public int subtraction (int first, int second, int third, int fourth){return first - second - third - fourth;}
    public float subtraction (float first, float second){ return first - second; }
    public float subtraction (float first, float second, float third){ return first - second - third; }

    public int multiply (int first, int second){return first * second;}
    public int multiply (int first, int second, int third, int fourth){return first * second * third * fourth;}
    public float multiply (float first, float second){ return first * second; }
    public float multiply (float first, float second, float third){ return first * second * third; }

    public float divide (float first, float second) { return first/second; }
    public float divide (float first, float second, float third) {return first/second/third; }
    public float divide (float first, float second, float third, float fourth) {return first/second/third/fourth; }


    public void pozitii () {
        int[] arPozitii = new int[100];
        for (int i = 1; i <= 100; i++ ) {
            arPozitii [i-1] = i;
        }
        for (int i = 0; i< 100; i ++){
            System.out.print(arPozitii [i] + " ");
        }
    }

    public void evenArray ( int [] evenarray) {
        evenarray [0] = 2;
        int counter = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                evenarray [counter] = i;
                counter ++;
            }
//        for (int i = 2; i <= evenarray.length && i % 2 == 0; i += 2) {
//
//            evenarray[i - 2] = i;
        }
        for (int i = 0; i < evenarray.length; i++) {
            System.out.print(evenarray[i] + " ");

        }
    }


    public float averageArray (int [] array){
        float sum = 0;
        for (int i = 1; i <= array.length; i++ ) {
            array [i-1] = i;
            sum += i;
        }
        return sum/array.length;
    }


    public boolean checkString (String [] array, String word) {
        for (int i = 0; i < array.length; i++) {
            if (word.equals(array[i])) {
                return true;
            }
        }
        return false;
    }


    public void checkPosition (int [] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("The position is: " + i);
            }
        }
    }

    public void arraySYMBOL (char symbol){
        char [] line = new char [10];
       for (int i = 0; i < line.length; i++){
           line [i] = symbol;
           System.out.println("\n");
               for (int j = 0; j < line.length; j++){
                   System.out.print(line[i] + " ");
           }
       }

    }

    public void displayWithout (int [] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.print("");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

    public void secondLowest (int [] array) {
        int lowest = array[0];
        int secondlowest = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= lowest){
                lowest = array [i];
            }
        }
            for (int j = 0; j< array.length; j++){
                if (array[j] <= secondlowest && array[j] != lowest){
                    secondlowest = array[j];
                }
            }
        System.out.print("The lowest number in the array is: " + lowest + "\nAnd the second lowest number is: " + secondlowest);
        }

    public void copyArray ( int [] firstarray, int [] secondarray){
        System.out.println("Original array: " + "    Copied array: ");
        for (int i = 0; i < firstarray.length; i++) {
            secondarray [i] = firstarray [i];
            System.out.println(firstarray[i] + "\t\t\t\t\t" + secondarray[i]);
        }
        }




    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
    // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
}
