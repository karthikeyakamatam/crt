import java.util.Stack;
public class CombinationSum{
   static void comSum(int arr[],int k,int n)
   {
    int temp=0;
    Stack <Integer> stk=new Stack<>();
    for(int i=0;i<n;i++)
    {
        if(arr[i]==k)
        {
            break;
        }
        else
        {
            stk.push(arr[i]);
        }
    }
    while(!stk.isEmpty())
    {
        
    }
   }
    public static void main(String[] args) {
        int n=4;
        int arr[]={2,3,6,7};
        int k=7;
        comSum(arr,k,n);
    }
}