import java.util.Scanner;

//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are given a number "tar".
//4. Complete the body of printTargetSumSubsets function - without changing signature - to calculate and print all subsets of given elements, the contents of which sum to "tar". Use sample input and output to get more idea.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
public class TargetSumSubsetUsingRecursion {

    public static void main(String[] args) throws Exception {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=readme.nextInt();
        }
        int target=readme.nextInt();
        printTargetSumSubsets(arr,0,"",0,target);
    }
    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx==arr.length)
        {
            if(sos==tar){
                System.out.println(set+".");
            }
            return;
        }
        printTargetSumSubsets(arr,idx+1,set + arr[idx],sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);

    }

}
