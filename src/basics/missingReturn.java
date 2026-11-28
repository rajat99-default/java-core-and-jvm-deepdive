package basics;

public class missingReturn {
    static int test(int x) {
        if (x > 0) {
            return 1;
        }
       else return 0;
        // Compile Error: missing return statement! Kyunki x <= 0 ke liye koi return nahi hai
    }
    public static void main (String[] args)
    {
        System.out.println(test(23));
    }
}
