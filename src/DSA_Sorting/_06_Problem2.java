
/*
    Give an array of names of the fruits, you are supposed to sort it in lexicographical order using the selection sort
    input : ["kiwi", "apple" , "papaya", "mango", "orange", "dragonFruit", "banana"]
    output : ["apple", "banana", "dragonFruit", "kiwi", "mango", "orange", "papaya"]
*/

package DSA_Sorting;

public class _06_Problem2 {
    public static void main(String[] args) {
        String[] fruits = {"kiwi", "apple" , "papaya", "mango", "orange", "dragonFruit", "banana"};
        int n = fruits.length;
        sortFruits(fruits, n);
        for (String Fruits : fruits) {
            System.out.print(Fruits + " ");
        }
    }

    private static void sortFruits(String[] fruits, int n) {
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(fruits[j].compareTo(fruits[maxIndex]) < 0) maxIndex = j;
            }
            // swap
            String temp = fruits[i];
            fruits[i] = fruits[maxIndex];
            fruits[maxIndex] = temp;
        }
    }
}
