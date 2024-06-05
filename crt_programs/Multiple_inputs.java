import java.util.*;
public class Multiple_inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a multiple values separeted by spaces ");
        String input =sc.nextLine();

        String[] values=input.trim().split("\\s+");
        System.out.println("enterd values: "+values);
        int[] arr=new int[10];
        int i=0;
        for (String value: values)
        {
            System.out.println(value+ " ");
            arr[i]=Integer.parseInt(value);
            i++;
        }
        int c=0;
        for(int v:)
    }
}
