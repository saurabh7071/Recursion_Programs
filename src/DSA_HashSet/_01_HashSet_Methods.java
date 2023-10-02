package DSA_HashSet;

import java.util.HashSet;

public class _01_HashSet_Methods {
    public static void main(String[] args) {

        // Declaration
        HashSet<String> st = new HashSet<>();

        // Adding an elements to a HashSet
        st.add("Saurabh");
        st.add("Rajnandan");
        st.add("Abhay");
        st.add("Mission");

        System.out.println(st);

        // Check if HashSet contains a particular key  --> Return boolean ans
        System.out.println(st.contains("Saurabh"));
        System.out.println(st.contains("Rajnandan"));

        // Size of a HashSet
        System.out.println("Size of HashSet : " + st.size());

        // Removing an element from the HashSet
        st.remove("Mission");

        System.out.println("Size of HashSet : " + st.size());

        System.out.println("\n");

        // Traversing the HashSet
        for (String str : st) {
            System.out.println(str);
        }

    }
}
