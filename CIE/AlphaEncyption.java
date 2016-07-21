//@author roman.bond
package javadistanceapplication;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.io.*;

public class AlphaEncyption {

    public static void main (String[] args){
        AlphaEncyption obj = new AlphaEncyption();
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        //convertAlpha(n);
        System.out.println("Just a test -- " + convertAlpha(s));
    };

    private static final String[] alphaNames = {
        ""," Alpha "," Bravo "," Charlie "," Delta ",
        " Echo "," Foxtrot "," Golf "," Hotel ",
        " India "," Juliet "," Kilo "," Lima "," Mike ",
        " November "," Oscar "," Papa "," Quebec ",
        " Romeo "," Sierra "," Tango "," Uniform ",
        " Victor "," X-ray "," Yankee "," Zulu "
    };
    /*
    private String convertLetter(String letter) {
    };*/

    public static String convertAlpha(String alpha) {
        String current;
        String Str1 = new String(alpha);
        Str1.length();
        if(Str1.length()>5){
            current = "UP";
        }else{
            current = "DOWN";
        }
        return current;
    };
}
