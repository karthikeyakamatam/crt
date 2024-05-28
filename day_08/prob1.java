/*
 * given an array containg 'n' integers you need to find the total number of inversions
 * 
 * INVERSION--two elements array of 'i' and array of 'j' form ana inversion if array 'i'> array of 'j'(arr[i]>arr[j]) and i<j
 * example:--input 
 *                5    (number of elements)
 *                0 5 2 3 1(array of elements)
 *          output:
 *                 5 (5 pairs of inversions (5,2) ; (5,3);  (5,1); (2,1); (3,1))
 */
import java.util.*;
public class prob1 {
    static int inversioncount(int[] arr)
    {
      int counter=0;
      for(int i=0;i<arr.length;i++)
      {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                counter++;
            }

        }
      }
      return counter;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
        System.out.println(inversioncount(arr));
        System.out.println(mergesort(arr, 0, n-1));
    }

    static int merge(int[] arr,int start,int end)
    {
        int mid=(start+end)/2;
        int i=start;
        int j=mid+1;
        int idx=0;
        int counter=0;
        int[] temp=new int[end-start+1];
        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                temp[idx++]=arr[i++];
            }
            else{
                counter+=(mid-i+1);
                temp[idx++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[idx++]=arr[i++];
        }
        while(j<=end)
        {
            temp[idx++]=arr[j++];
        }
        for(int index=0,originalIndex=start;index<temp.length;index++)
        {
            arr[originalIndex++]=temp[index];
        }
        return counter;
    }
    static int mergesort(int arr[],int start,int end)
{
    if(start>=end)
    return 0;
    //divide until each sublist contains single element
    int mid=(start+end)/2;
   int c1= mergesort(arr, start, mid);
    int c2=mergesort(arr, mid+1, end);
    //merge into sorted order
    int c3=merge(arr,start,end);
    return c1+c2+c3;
}
}
