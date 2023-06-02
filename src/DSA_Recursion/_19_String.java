package DSA_Recursion;

import java.util.Scanner;

public class _19_String {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string : ");
//        String str = obj.next();
        String str = obj.nextLine();
        System.out.println(str);

        System.out.println("Length of the string : "+str.length()+"\n");

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3)+"\n");

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        System.out.println("Substring are : "+str.substring(1,5));
        System.out.println("Substring are : "+str.substring(1));


    }
}
