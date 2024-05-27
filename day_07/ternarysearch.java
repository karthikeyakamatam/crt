/*Ternary search
 * we divide the array into three parts
 * 1.create two mids    temp=(high-low)/3  mid1=low+temp   mid2=high-temp
 *  it will divided nito three portions    (low to mid1)  (mid1+1 to mid2-1)  (mid2 to high)
 */


import java.util.*;
public class ternarysearch {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        
        int key=sc.nextInt();
    
        sc.close();
        System.out.println(trisearch(ar, key));
}
  public static int trisearch(int[] ar, int key)
  {
    int low=0, high=ar.length-1;
    
    while(low<=high)
    {
    int distance=(high-low)/3;  //creating distance of each portion
    int mid1=low+distance;
    int mid2=high-distance;
    if(key==ar[mid1])
    {
        return mid1;
    }
    else if(key<ar[mid1])
    {
        high=mid1-1;
    }
    else if(key==ar[mid2])
    {
        return mid2;
    }
    else if(key<ar[mid2])
    {
        low=mid1+1;
        high=mid2-1;
    }
    else 
    {
        low=mid2+1;
    }


  }
  return -1;
}

}