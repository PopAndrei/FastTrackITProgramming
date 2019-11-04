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

    //
}
