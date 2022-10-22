import java.util.Scanner;

public class printDecresingIncreasing {

    public static void printDecresingIncreasing(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        printDecresingIncreasing(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        printDecresingIncreasing(n);
    }
}
