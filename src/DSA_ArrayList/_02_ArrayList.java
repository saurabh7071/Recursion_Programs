package DSA_ArrayList;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
public class _02_ArrayList {
    public static void main(String[] args) {

//        ArrayList bhi ek class hoti hai jo java.util package ke ander present hoti hai ......
//        import java.util.ArrayList;

//        ArrayList have variable size means at the time of execution we increase and decrease the size of the ArrayList...
//        but in Array this is not possible , size of array is not variable , we can't change


        /*
                 Syntax :

                 ArrayList<Wrapper_class> ArrayList_name = new ArrayList<>();

         */

        /*
                ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Float> list = new ArrayList<>();
                ArrayList<Boolean> list = new ArrayList<>();
         */

        ArrayList<Integer> list = new ArrayList<>();

        // Add new element

        list.add(90);
        list.add(91);       // list_name.add(element);
        list.add(92);
        list.add(93);
        System.out.println(list);


        // Get an element at index i

        System.out.println(list.get(0));    // 90
        System.out.println(list.get(1));    // 91
        System.out.println(list.get(2));    // 92


        // print with for loop

        System.out.println("\nPrint with for loop\n");
        for(int i=0;i<list.size();i++){                 // arr.length = list.size()
            System.out.println(list.get(i));            // sout(i)    = list.get(i)
        }


        // Printing the ArrayList directly

        System.out.println("\nprinting the ArrayList directly\n");
        System.out.println(list);


        // Adding element at some index i

        System.out.println("\n*************************\n");

        list.add(4,100);
        System.out.println(list);

        list.add(5,150);
        System.out.println(list);


        // Modifying element at index i

        System.out.println("\n*****************************\n");

        list.set(4,200);
        System.out.println(list);

        list.set(5,250);
        System.out.println(list);


        // Removing an element at index i

        System.out.println("\n******************************\n");

        list.remove(4);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);


        // Removing any element without knowing their index

        System.out.println("\n******************************\n");

        list.remove(Integer.valueOf(91));
        System.out.println(list);

        System.out.println(list.remove(Integer.valueOf(90)));       // boolean value return karta hai .....
        System.out.println(list.remove(Integer.valueOf(94)));


        // Checking if an element exits  ---> return true and false

        System.out.println("\n*********************************\n");

        System.out.println(list.contains(Integer.valueOf(92)));  // True
        System.out.println(list.contains(Integer.valueOf(100))); // False


        // If you don't specify class, You can put anything inside list

        System.out.println("\n**********************************\n");

        System.out.println("If you don't specify class, You can put anything inside list");

        ArrayList list1 = new ArrayList();

        list1.add("Saurabh");
        list1.add(2003);
        list1.add(true);
        list1.add(98.3f);
        System.out.println(list1);


        System.out.println("\n*********************************\n");

        list.add(45);
        list.add(65);
        list.add(90);
        list.add(90);
        System.out.println(list);


        System.out.println("\n*********************************\n");

        // Print the index of first occurence of the repeated element

        // indexOf(element)  ---> It is used to return in this list of the first occurance of the specified element
        //                          or -1 if the list does not contain this element


        System.out.println(list.indexOf(90));
        System.out.println(list.indexOf(100));


        System.out.println("\n*************************************\n");


        // Print the last index of repeated elements

        System.out.println(list.lastIndexOf(90));
        System.out.println(list.lastIndexOf(100));


        System.out.println("\n***********************************\n");


        // Check list is empty or not

        System.out.println(list.isEmpty());

        ArrayList<Float> l = new ArrayList<>();     //Empty ArrayList
        System.out.println(l.isEmpty());
    }

}
