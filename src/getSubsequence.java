import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class getSubsequence {
    public static List<String> returnSubsequence(String str)
    {
        if(str.length()==0)
        {
            List<String>rres=new ArrayList<>();
            rres.add("");
            return rres;
        }
        char ch=str.charAt(0);//a
        List<String>rstr=returnSubsequence(str.substring(1));// subSequence of bc
        List<String>result=new ArrayList<>();
        for(String i:rstr)
        {
            String finres="-"+i;
            result.add(finres);
        }
        for(String i:rstr)
        {
            String finres=ch+i;
            result.add(finres);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        List<String> res=returnSubsequence(str);
        System.out.println(res);

    }


}
