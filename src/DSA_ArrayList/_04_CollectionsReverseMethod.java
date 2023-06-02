package DSA_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _04_CollectionsReverseMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(90);
        list.add(70);
        list.add(12);
        list.add(30);
        list.add(1);
        System.out.println("Original ArrayList : " + list);
        Collections.reverse(list);
        System.out.println("Reverse ArrayList : " + list);
        Collections.sort(list);
        System.out.println("Ascending Order of ArrayList : " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order of ArrayList :"+list);

        // Collections.reverseOrder()  -----> Returns a comparator that imposes the reverse of the natural ordering on
        //                                      a collection of objects that implement the Comparable interface.
    }
}
