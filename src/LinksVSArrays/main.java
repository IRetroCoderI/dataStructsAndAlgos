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
        System.out.println(link.size());
        System.out.println(array.size());

    }
}
