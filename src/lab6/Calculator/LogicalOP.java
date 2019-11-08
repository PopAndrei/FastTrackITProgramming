package lab6.Calculator;

import java.util.List;

public class LogicalOP {

    public void insertInList (List<Integer>list, int number){
        list.add(number);
    }
// TEMA LAB 14

    public void showList (List mylist){
        for(int i = 0; i < mylist.size(); i++){

            System.out.println(mylist.get(i));
        }
    }


    public void insertinList (List<Integer> mylist,int number ){
        mylist.add(number);
        System.out.print(mylist);
    }

    public void showFromNumber (List<Integer> mylist, int number){
        for (int i = 0; i < mylist.size(); i++) {
            if (mylist.get(i) == number) {
                for (int j = mylist.indexOf(i) + 1; j < mylist.size(); j++ )
                System.out.println(mylist.get(j));
            }
        }
    }



    public void showReverse (List<Integer> mylist){
        for(int i = mylist.size() - 1; i >= 0; i--){

            System.out.print(mylist.get(i) + " ");
        }
    }


    public void addString (List<String> mylist, int position, String word){
        mylist.add(position,word);
        System.out.print(mylist);
    }


    public void addtoList (List <Integer> mylist, int number ){
        mylist.add(0, number);
        System.out.print(mylist);
    }

    public void indexAndPosition (List<Integer> mylist){
        for (int i = 0; i < mylist.size(); i ++){
            System.out.println("Pe pozitia "+ i + " valoarea este " + mylist.get(i));
        }
    }


    public void biggestNumber (List<Integer> mylist){
        int biggest = mylist.get(0);
        for (int i = 0; i < mylist.size(); i ++){
            if (mylist.get(i) >= biggest){
                biggest = mylist.get(i);

            }
        }
        System.out.println(biggest);
    }

    //8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

}
