package lab6.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer>  myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        Integer x = 3;
        myList.remove(x);
        myList.remove(Integer.valueOf(2));
        System.out.println(myList.contains(3));
        System.out.println(myList);

        LogicalOP op = new LogicalOP();

        op.insertInList(myList, 20);
        System.out.println(myList);

        System.out.println("\nTEMA LAB 14");

        System.out.println("\nExercitiul 1.");
        // System.out.println(myList.size()); // am descoperit cum sa aflu lungimea unei liste (stackOverflow iz nice)
        List<Integer> homelist = new ArrayList<>();
        homelist.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        op.showList(homelist);

        System.out.println("\n\nExercitiul 2.");
        op.insertinList(homelist, 11);

        System.out.println("\n\nExercitiul 3.");
        op.showFromNumber(homelist, 6);

        System.out.println("\n\nExercitiul 4.");
        op.showReverse(homelist);

        System.out.println("\n\nExercitiul 5.");
        List<String> stringlist = new ArrayList<>();
        stringlist.addAll(Arrays.asList("Andrei", "Diana", "Ionut", "Vlad"));
        op.addString(stringlist,2, "Cosmin");

        System.out.println("\n\nExercitiul 6.");
        op.addtoList(homelist, 0);

        System.out.println("\n\nExercitiul 7.");
        //op.indexAndPosition(homelist);
        homelist.add(24);
        homelist.add(25);
        System.out.println(homelist.get(13));
       op.indexAndPosition(homelist);

        System.out.println("\n\nExercitiul 8.");
        op.biggestNumber(homelist);





    }
}
