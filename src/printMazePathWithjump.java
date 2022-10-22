import java.util.Scanner;

public class printMazePathWithjump {
    public static void main(String[] args) throws Exception {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int m=readme.nextInt();
        printMazePaths(1,1,n,m,"");


    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(dr==sr&&dc==sc)
        {
            System.out.println(psf);
            return;
        }

            for(int i=1;i<=dc-sc;i++) {
                printMazePaths(sr, sc + 1, dr, dc, psf +"h"+i);
            }
        for(int i=1;i<=dr-sr;i++) {
            printMazePaths(sr+1, sc, dr, dc, psf +"v"+i);
        }
        for(int i=1;i<=dc-sc&&i<=dr-sr;i++) {
            printMazePaths(sr+1, sc + 1, dr, dc, psf +"d"+i);
        }




    }


}
