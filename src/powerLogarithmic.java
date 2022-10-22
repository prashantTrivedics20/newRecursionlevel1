import java.util.Scanner;

public class powerLogarithmic {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();

        int x=readme.nextInt();

        int result=power(x,n);
        System.out.println(result);

    }

    public static int power(int x, int n){
        if(n==0)
        {
            return 1;
        }

        if(n%2==0)
        {

            int pow=power(x,n/2);
            int res=pow*pow;
            return res;

        }
        else {
            int pow=power(x,n/2);
            int res=pow*pow*x;
            return res;
        }
    }

}
