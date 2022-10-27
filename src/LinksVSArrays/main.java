package LinksVSArrays;
import java.util.LinkedList;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();



        long startTime;
        long elapsedTime;
        long endTime;


        for(int i = 0; i<1_000_000; i++){
            link.add(i);
            array.add(i);
        }

        //______________LinkedList______________
        startTime = System.nanoTime();
        link.get(0);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + " ns");





        //______________ArrayList______________
        startTime = System.nanoTime();
        array.get(0);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
//ArrayLISTS
        startTime = System.nanoTime();
        array.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("ArrayLists:\t" + elapsedTime + "ns");
//LinkedLISTS
        startTime = System.nanoTime();
        link.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + "ns");


    }
}
