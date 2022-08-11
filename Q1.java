package Java_Basics;

/**
 1. How to create a class, object, method and its signature.
 */
public class Q1 {
    void isMethod() {
        //fields are used to store data
        String a = "This is a Method";
        System.out.println(a);
    }

    public static void main(String[] args) {
       // Created an object of Basics_01
        Q1 obj = new Q1();
        // Calling the method
        obj.isMethod();
    } 
    }
