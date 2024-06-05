public class exception_handle {
public static void main(String[] args) {
    try{
        String s1=args[0];
        String s2=args[1];
        int a,b;
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        int res=a/b;
        System.out.println("result: " +res);

    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("out of array limit error");
        System.out.println(e);
    }
    catch(ArithmeticException e)
    {
        System.out.println("zero dision error");
        System.out.println(e);
    }

}    
}
