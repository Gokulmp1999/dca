import java.util.Objects;
import java.util.Scanner;

public class palin {
    palin(){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
       String B=reverseString(a);
if(Objects.equals(a, B)){System.out.println("palindro");

}
else{
    System.out.println("NOT AN PALIN");
}
    }
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        new palin();
    }
}
