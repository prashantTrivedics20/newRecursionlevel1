import java.util.Scanner;

//1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
//2. The following list is the key to characters map
//    0 -> .;
//   1 -> abc
//   2 -> def
//   3 -> ghi
//   4 -> jkl
//   5 -> mno
//   6 -> pqrs
//   7 -> tu
//   8 -> vwx
//   9 -> yz
//3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
//Use sample input and output to take idea about output.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
public class printKBCCombination {
    public static void main(String[] args) throws Exception {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        printKPC(str,"");

    }
    static String code[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }

//        String code[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        char ch=str.charAt(0);
        String roq=str.substring(1);
        String fistkey=code[ch-'0'];

        for(int i=0;i<fistkey.length();i++)
        {
            char option=fistkey.charAt(i);
            printKPC(roq,asf+option);
        }





    }
}
