//1. You are given a number n and a number m representing number of rows and columns in a maze.
//2. You are standing in the top-left corner and have to reach the bottom-right corner.
//3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
//4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
//Use sample input and output to take idea about output.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

import java.util.ArrayList;
import java.util.Scanner;

public class GetMajePathWithJump {
    public static void main(String[] args) throws Exception {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int m=readme.nextInt();

        ArrayList<String> res=getMazePaths(1,1,n,m);
        System.out.println(res);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(dr==sr&&dc==sc)
        {
            ArrayList<String>rres=new ArrayList<>();
            rres.add("");
            return rres;
        }

        ArrayList<String>result=new ArrayList<>();

        // horizantal moves

        for(int ms=1;ms<=dc-sc;ms++)
        {
            ArrayList<String>hpaths=getMazePaths(sr,sc+ms,dr,dc);
            for(String i:hpaths)
            {
                result.add("h"+ms+i);
            }
        }
        // vertical  moves

        for(int ms=1;ms<=dr-sr;ms++)
        {
            ArrayList<String>vpaths=getMazePaths(sr+ms,sc,dr,dc);
            for(String i:vpaths)
            {
                result.add("v"+ms+i);
            }
        }

        // diagonal  moves

        for(int ms=1;ms<=dr-sr&&ms<=dc-sc;ms++)
        {
            ArrayList<String>dpaths=getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String i:dpaths)
            {
                result.add("d"+ms+i);
            }
        }




        return result;
    }

}
