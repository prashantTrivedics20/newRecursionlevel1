import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. You are given a number n representing number of stairs in a staircase.
//2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
//3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
//Use sample input and output to take idea about output.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
public class GetStairPath {

    public static List<String> getStairPath(int n)
    {
        if(n==0)
        {
            List<String>rres=new ArrayList<>();
            rres.add("");
            return rres;
        }
        else if(n<0)
        {
            List<String>rres=new ArrayList<>();
            return rres;
        }
        List<String>paths1=getStairPath(n-1);
        List<String>paths2=getStairPath(n-2);
        List<String>paths3=getStairPath(n-3);
        List<String>result=new ArrayList<>();
        for(String i:paths1)
        {
            result.add(1+i);
        }
        for(String i:paths2)
        {
            result.add(2+i);
        }
        for(String i:paths3)
        {
            result.add(3+i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();

        List<String>allPaths=getStairPath(n);
        System.out.println(allPaths);




    }
}
