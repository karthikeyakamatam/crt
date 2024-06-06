import java.util.Stack;
public class stack6Prob {
    static int[] findGreatest(int[] arr)
    {
        Stack<Integer> stack=new Stack<Integer>();
        int res[]=new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i])
            {
                stack.pop();
            }
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
    static int[] findSmallest(int[] arr,int great[])
    {
        for(int i=0;i<great.length;i++)
        {
            int fl=1;
            if(!(great[i]==1))
            {
                int j=0;
                for(j=0;j<arr.length;j++)
                {
                    if(arr[j]==great[i])
                    {
                        break;
                    }
                }
                for(int k=j+1;k<arr.length;k++)
                    {
                        if(arr[k]<great[i])
                        {
                            great[i]=arr[k];
                            fl=0;
                            break;
                        }
                    }
                    if(fl==1)
                    {
                        great[i]=-1;
                    }
                }
            }
        return great;
    }
    public static void main(String[] args) {
        int arr[]={5,1,9,2,1,7};
        int great[]=new int[arr.length];
        int small[]=new int[arr.length];
        great=findGreatest(arr);
        small=findSmallest(arr,great);
        for (int i:great)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i:small)
        {
            System.out.print(i+" ");
        }
}
}
