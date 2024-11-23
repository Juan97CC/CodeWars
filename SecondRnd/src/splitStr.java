import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class splitStr {

    public void theSplit(String text)
    {
        List<String> parts = new ArrayList<>();
        int len = text.length();

        if( len % 2 == 0){

        }
    }


    public void  solution(String str)
    {

        for (int i = 0; i < 4 ; i++) {

        }

    }


    public String[] sol(String x)
    {
        int start = 0;
        int end = 2;
        int len = x.length();


        if(len % 2 == 0){
            String [] fin = new String[(len /2)];
            for (int i = 0; i  < (len / 2 ); i++) {

                fin[i] = x.substring(start, end);
                start += 2;
                end += 2;
            }
            return fin;
        }

        else {
            String newStr = x + "_";
            int n = newStr.length() ;
            String [] fin = new String[(n /2)];


            for (int i = 0; i <(n /2)  ; i++) {

                fin[i] = newStr.substring(start, end);
                start += 2;
                end += 2;

            }
            System.out.println(Arrays.toString(fin));



        }
    }

    public static void main(String[] args) {
         splitStr j = new splitStr();

        j.sol("abcdfd");








    }
}
