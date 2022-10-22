import java.util.Scanner;
public class power_linear {
        public static void main(String[] args) throws Exception {
            Scanner readme=new Scanner(System.in);

            int n=readme.nextInt();

            int x=readme.nextInt();

            int result=power(x,n);
            System.out.println(result);
            // write your code here
        }
        public static int power(int x,int n){
            if(n==0)
            {
                return 1;
            }
            int xnm1=power(x,n-1);
            int pow=x*xnm1;
            return pow;


        }


}
