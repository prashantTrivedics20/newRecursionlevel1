//1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
//2. The following list is the key to characters map :
//    0 -> .;
//    1 -> abc
//    2 -> def
//    3 -> ghi
//    4 -> jkl
//    5 -> mno
//    6 -> pqrs
//    7 -> tu
//    8 -> vwx
//    9 -> yz
//3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
//Use sample input and output to take idea about output.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GetKeyWordCombination {
    public static List<String> getKeyPc(String str)
    {
        if(str.length()==0)
        {
            List<String>rres=new ArrayList<>();
            rres.add("");
            return rres;
        }
        String code[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        char ch=str.charAt(0);
        List<String> rstr=getKeyPc(str.substring(1));// this is my faith....
        List<String>result= new ArrayList<String>();
        String codeforch=code[ch-'0'];
        for(int i=0;i<codeforch.length();i++)
        {
            char expectation=codeforch.charAt(i);
            for(String val:rstr)
            {
                result.add(expectation+val);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();

        List<String> res=getKeyPc(str);
        System.out.println(res);




    }
}
