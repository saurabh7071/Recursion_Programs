
// WAP to Reverse the given ArrayList

package DSA_ArrayList;

import java.util.ArrayList;

public class _03_ReverseTheList {
    static void ReverseList(ArrayList<Integer> list){
        int i=0; int j=list.size()-1;
        while(i < j){
            Integer temp = Integer.valueOf(list.get(i));        //   temp = i
            list.set(i,list.get(j));                            //   i = j
            list.set(j,temp);                                   //   j = temp
            i++; j--;
        }
    }
    static int ReverseList1(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            return list.get(i);
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(3);
        list.add(78);
        list.add(5);
        list.add(34);
        list.add(20);
        list.add(100);
        System.out.println("Original ArrayList : "+list);
//        ReverseList(list);
        ReverseList1(list);
        System.out.println("Reverse ArrayList : "+list);

    }
}
