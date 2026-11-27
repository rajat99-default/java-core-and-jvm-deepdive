package basics;
import java.util.*;

class Demo {
    int add(int a, int b) {        // Instance method
        return a + b;
    }
}

class JavaPractice4 {
    int multiply(int a, int b) { // Static method
        return a * b;
    }

    static int sampleMethod(int g) { // Class-level method returning int
        return g * 2;
    }

    public static void main(String[] args) {
        Demo o = new Demo();
        JavaPractice4 q = new JavaPractice4();
        System.out.println(o.add(10, 20));      // Called via object
        System.out.println(q.multiply(10, 20));     // Called directly in same class
        System.out.println(sampleMethod(5));      // Called directly in same class
    }
}