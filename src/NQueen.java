import java.util.Scanner;
public class NQueen {
    public static void printNQuen(int arr[][],int row,String asf)
    {
        if(row==arr.length)
        {
            System.out.println(asf);
            return;
        }
        for(int col=0;col<arr.length;col++)
        {
            if(isSafePlaceForTheQueen(arr,row,col)==true) {
                arr[row][col] = 1;
                printNQuen(arr, row + 1, asf + row + "-" + col + ", ");
                arr[row][col] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[][]=new int[n][n];
        printNQuen(arr,0,"");

    }
    public static boolean isSafePlaceForTheQueen(int arr[][],int row,int col)
    {
        // vertical check
        for (int i = row-1,j=col; i>=0; i--) {
            if(arr[i][j]==1)
            {
                return false;
            }
        }
        // diagonal check left
        for (int i = row-1,j=col-1; i>=0&&j>=0; i--,j--) {
            if(arr[i][j]==1)
            {
                return false;
            }
        }
        // diagonal check right
        for (int i = row-1,j=col+1; i>=0&&j<arr.length; i--,j++) {
            if(arr[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }
}
