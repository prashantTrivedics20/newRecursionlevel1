//1. You are given a string str of digits. (will never start with a 0)
//2. You are required to encode the str as per following rules
//    1 -> a
//    2 -> b
//    3 -> c
//    ..
//    25 -> y
//    26 -> z
//3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
//Use the input-output below to get more understanding on what is required
//123 -> abc, aw, lc
//993 -> iic
//013 -> Invalid input. A string starting with 0 will not be passed...
//103 -> jc
//303 -> No output possible. But such a string maybe passed. In this case print nothing.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

import java.util.Scanner;

public class printEncodingRecursion {
    // important question for placement point of view......
    public static void main(String[] args) throws Exception {
        Scanner readme=new Scanner(System.in);
        String  str=readme.nextLine();
        printEncodings(str,"");
    }

    public static void printEncodings(String str,String asf) {

        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        else if(str.length()==1)
        {
            char ch=str.charAt(0);
            if(ch=='0')
            {
                return;
            }
            else {
                int chval=ch-'0';
                char code=(char)('a'+chval-1);
                asf=asf+code;
                System.out.println(asf);
                return;

            }
        }

        else
        {
            char ch=str.charAt(0);
            String ros=str.substring(1);
            if(ch=='0')
            {
                return;
            }
            else {
                int chval=ch-'0';
                char code=(char)('a'+chval-1);
                printEncodings(ros,asf+code);
            }
            String ftch=str.substring(0,2);
            String rose=str.substring(2);
            int intftch=Integer.parseInt(ftch);
            if(intftch<=26)
            {
                char code=(char)('a'+intftch-1);

                printEncodings(rose,asf+code);
            }
        }
    }
}
