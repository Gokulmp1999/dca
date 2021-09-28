import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class reversString {
    reversString() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String a = s.nextLine();
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(a);
        String t = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                t = temp[i] + t;
            else {
                t = " "+ temp[i] + t;
            }


        }
        System.out.println(t);

    }


    public static void main(String[] args) {
        new reversString();
    }
}
