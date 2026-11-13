package basics;

import java.util.Arrays;

public class MemoryAndPassByValueDemo {

    public static void main(String[] args) {
        // 1. Primitive (Stack mein value '10' store hui)
        int number = 10;
        changePrimitive(number);
        System.out.println("After method call, primitive number: " + number); // 10 hi rahega!

        // 2. Array Object (Heap mein [10, 20, 30] bana, Stack mein 'scores' ke paas uska address hai)
        int[] scores = {10, 20, 30};
        changeArrayElement(scores);
        System.out.println("After changing element, scores: " + Arrays.toString(scores)); // [99, 20, 30] ho jayega!

        // 3. Reassignment Trap (Interviewer ka favorite sawal!)
        reassignArray(scores);
        System.out.println("After reassigning array, scores: " + Arrays.toString(scores)); // Kya print hoga?
    }

    static void changePrimitive(int x) {
        x = 99; // Sirf local copy badli
    }

    static void changeArrayElement(int[] arr) {
        arr[0] = 99; // Address ki copy mili, par Heap mein original array ke 0th index ko badal diya
    }

    static void reassignArray(int[] arr) {
        // Yahan local copy 'arr' ko ek NAYE Heap array ka address de diya
        arr = new int[]{500, 600, 700};
    }
}
