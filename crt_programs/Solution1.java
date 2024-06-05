import java.util.*;
class Solution1 {
    public static int longestMountain(int[] arr) {
        
   int n=arr.length;
   if (n<3)
   return 0;
   int max_len=0,i=1;
   while(i<n-1)
   {
    if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
    {
        int left=i-1;
        while(left>0 && arr[left-1]<arr[left])
        {
            left--;
        }
        int right=i+1;
        while(right<n-1 && arr[right]>arr[right+1])
        {
            right++;
        }
        int curr_len=right-left+1;
        max_len=Math.max(max_len,curr_len);
        i=right;
    }
    else{
        i++;
    }

   }
    return max_len;    
 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=longestMountain(arr);
        System.out.println(result);
    }
}