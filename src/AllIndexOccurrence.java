import java.util.Scanner;

public class AllIndexOccurrence {
    public static int [] printAllOccurrence(int arr[],int x,int idx,int fsf)
    {
        if(idx==arr.length)
        {
            return new int[fsf];
        }
        if(arr[idx]==x)
        {
           int res[]= printAllOccurrence(arr,x,idx+1,fsf+1);
           res[fsf]=idx;
           return res;
        }
        else {
            int res[]= printAllOccurrence(arr,x,idx+1,fsf);
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= readme.nextInt();
        }
        int x=readme.nextInt();


        int resarr[]=printAllOccurrence(arr,x,0,0);
        if(resarr.length==0)
        {
            System.out.println();
            return;
        }
        for(int i=0;i<resarr.length;i++)
        {
            System.out.print(resarr[i]+" ");
        }

    }
}
