import java.util.Scanner;

public class printSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner readme=new Scanner(System.in);

        String str=readme.nextLine();

        printSS(str,"");

    }

    public static void printSS(String str, String ans) {

        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String rstr=str.substring(1);
        printSS(rstr,ans+"");
        printSS(rstr,ans+ch);


    }
}
