import java.util.Scanner;

public class printPermutation {
    public static void main(String[] args) throws Exception {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        printPermutations(str,"");

    }

    public static void printPermutations(String str, String asf) {

        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            String reques = str.substring(0,i)+str.substring(i+1);
            printPermutations(reques, asf + ch);
        }



    }
}
