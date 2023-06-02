
// WAP to sort an ArrayList of Strings in Descending order.

package DSA_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _05_SortString {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add("My");
        li.add("name");
        li.add("Is");
        li.add("saurabh");
        System.out.println("Original String Arraylist are : " + li);
        Collections.sort(li);
        System.out.println("Sorted String ArrayList in Ascending order  are : "+li);
        Collections.sort(li,Collections.reverseOrder());
        System.out.println("Sorted String ArrayList in Descending order  are : "+li);

        // Sorting or String : Lexico Graphical order
    }
}
