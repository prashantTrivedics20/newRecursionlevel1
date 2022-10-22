import java.util.Scanner;

public class ZicZacConversion {
    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("pre"+n);
        print(n-1);
        System.out.println("In"+n);
        print(n-1);
        System.out.println("Post"+n);
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n= readme.nextInt();
        print(n);

    }
}
