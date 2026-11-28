package basics;
import java.util.*;
    // creating user defined array example Student

 class Student {


     int a ;
     String b;
     public Student ( int a , String b) //Constructor hai ye same class name wala automatic call hojata hai without creating any object
     {
         this.a = a;
         this.b = b;
     }

}

public class Array {

    public static void main (String[] args)
    {
//        int[] arr = {12,212,21,21,2,1,2,1,2,1,2,1,2,1,2,1,23131,3,1,2,3,13,1,23132,3,};
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }

//        Student obj = new Student(num , naam);

        Scanner o = new Scanner(System.in);

        System.out.println("enter the total number of student details that you are going to enter : ");

        int size = o.nextInt();

        Student[] arr = new Student[size];

        for(int i=0 ; i< arr.length ; i++)
        {
            //ye input loop ke through user defined data type wali array me input lene ka logic hai
            System.out.print("enter name : ");
            String abc = o.nextLine();
            System.out.print("enter roll no : ");
            int abcd = o.nextInt();
            arr[i] = new Student(abcd,abc);
        }
        for(int i=0 ; i< arr.length ; i++)
        {
            // ye print ka logic hai
            System.out.println(arr[i]);
        }

    }
}
