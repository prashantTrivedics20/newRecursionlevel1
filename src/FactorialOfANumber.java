import java.util.Scanner;

public class FactorialOfANumber {

    public static int  factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int fact=factorial(n-1);
        int fn=n*fact;
        return fn;

    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int res=factorial(n);
        System.out.println(res);



    }
}
