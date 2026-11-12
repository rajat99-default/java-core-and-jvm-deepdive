package jvm.internals;

public class HeapVsStackDemo {

    public static void main(String[] args) {
        // Primitive local variable -> Directly stored inside Thread's Stack Frame
        int stackPrimitive = 100;

        // Object Reference -> Reference stored on Stack, actual Object data on Heap new program
        String heapObject = new String("JVM Deep Dive");

        System.out.println("--- JVM Memory Layout Demo ---");
        System.out.println("Primitive on Stack: " + stackPrimitive);
        System.out.println("Reference on Stack -> Points to Heap Data: " + heapObject);

        memoryBreakdown(stackPrimitive);
    }

    private static void memoryBreakdown(int val) {
        // New Stack Frame pushed onto execution stack for this method call
        int localStackVar = val * 2;
        System.out.println("Inside New Stack Frame, Local Var: " + localStackVar);
    }
}
