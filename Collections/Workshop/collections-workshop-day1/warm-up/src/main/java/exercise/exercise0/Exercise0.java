package exercise.exercise0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 *             for loop and foreach loop.
 *
 */
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughList(){

        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it

        // TODO Exercise #0 a) Hint: Don't forget to specify the type of the list (Integer, String etc.)

        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements

        // TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements

        // TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements

        ArrayList<Integer> listaArray = new ArrayList<Integer>();
        for(int i=0;i<=50;i+=2)
            listaArray.add(i);
        Iterator<Integer> iter = listaArray.iterator();
        while (iter.hasNext()){
            int elem = iter.next();
            System.out.println(elem);
         }

        for(int i : listaArray)
            System.out.println(i);

        ListIterator<Integer> listIter = listaArray.listIterator();
        while (listIter.hasNext()){
            int el = listIter.next();
            System.out.println(el);
        }

    }

    public static void main(String[] args) {
        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
        Exercise0 ex=new Exercise0();
        ex.iterateThroughList();
    }
}
