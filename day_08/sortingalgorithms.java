import java.util.*;
public class sortingalgorithms
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
   // selectionsort(arr);  //when array is passed for function it is always passed by  REFERENCE
                         //(even though we are not returing from function anything it changes the array becuase of reference)
   //Bubblesort(arr);
   //insertionsort(arr);
   //quicksort(arr,0,arr.length-1);
   sc.close();
   mergesort(arr, 0, arr.length-1); 
   for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}
static void selectionsort(int[] arr)
{
    for(int position=0;position<=arr.length-2;position++)
    {
        for(int next=position+1;next<=arr.length-1;next++)
        {
            if(arr[position]>arr[next])
            {
                int temp=arr[position];
                arr[position]=arr[next];
                arr[next]=temp;
            }
        }
    }
}
static void Bubblesort(int[] arr)
{
 for(int i=0;i<arr.length;i++)   
 {
    for(int j=0;j<(arr.length-1)-i;j++)
    {
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;

        }
    }

 }
}
static void insertionsort(int a[])
{
     
    for(int i=1;i<a.length;i++)
    {
        int temp=a[i];
        int j=i-1;
        while(j>=0 && temp<a[j])
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=temp;

    }
}
static int partition(int arr[], int start,int end)
{
    int pivot=arr[start];
    int pivotIdx=start;
   while(start<end)
   {
    while(start<arr.length && arr[start]<pivot)
    {
        start++;
    }
    while(end>0 && arr[end]>=pivot)
    {
        end--;
    }
    if(start<end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
   }
   int tmp=arr[pivotIdx];
   arr[pivotIdx]=arr[end];
   arr[end]=tmp;
return end;
}



static void quicksort(int[] arr,int start ,int end)
{
    if(start<=end)
    {
        int pivotIdx=partition(arr,start,end);
        quicksort(arr, start, pivotIdx-1);
        quicksort(arr, pivotIdx+1, end);
    }
    
    
}
static void mergesort(int arr[],int start,int end)
{
    if(start>=end)
    return;
    //divide until each sublist contains single element
    int mid=(start+end)/2;
    mergesort(arr, start, mid);
    mergesort(arr, mid+1, end);
    //merge into sorted order
    merge(arr,start,end);
}
static void merge(int[] arr,int start,int end)
{
    int mid=(start+end)/2;
    int i=start;
    int j=mid+1;
    int idx=0;
    int[] temp=new int[end-start+1];
    while(i<=mid && j<=end)
    {
        if(arr[i]<arr[j])
        {
            temp[idx++]=arr[i++];
        }
        else{
            
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
}
}