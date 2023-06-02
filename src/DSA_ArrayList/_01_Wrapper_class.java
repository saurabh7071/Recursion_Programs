package DSA_ArrayList;

public class _01_Wrapper_class {
    public static void main(String[] args) {

//        Wrapper Class ---> kisi primitive datatype ko class ke object ke ander wrap karna......

//        java.util.lang package ke ander hoti hai .....

//        Integer obj = new Integer();  ----> Method Deprecated in new version

//        Syntax of Wrapper class object

//        Integer obj_name = Integer.valueOf(element);

//        The Integer class wraps a value of the primitive type int in an object. An object of type Integer
//                  contains a single field whose type is int.

        Integer obj = Integer.valueOf(7);
        System.out.println(obj);

        Float obj1 = Float.valueOf(6.4f);
        System.out.println(obj1);

    }
}
