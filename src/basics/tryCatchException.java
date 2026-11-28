package basics;
class Calculation{

    public  int add(int a , int b ) throws Exception{
        if(a<0 && b<0)
        {
            throw new Exception("no negative numbers allowed");
        }
        return a+b;
    }
}
public class tryCatchException {



    public static void main (String[] args)
    {
        Calculation obj = new Calculation();
//        obj.add(12,32);
////        Calculation.add(-2,-3);
            try{
                int sum = obj.add(-12,-21);
                System.out.println(sum);
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

    }

}
