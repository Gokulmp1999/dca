import java.util.Arrays;
import java.util.Scanner;

public class stringremove {
    stringremove(){
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();
        String str1="";
        System.out.println("r1");
        String s1=s.next();


        String s2=s.nextLine();
        String s3=s.nextLine();
        char[] arr=str.toCharArray();

        for (int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                i=i+1;
            }else if(arr[i]=='5'){
                i=i+1;
            }
            else if(arr[i]=='6'){
                i=i+1;}
            else
            {
                str1=str1+arr[i];
            }

        }
System.out.println(str1);
    }
    public static void main(String args[]){
        new  stringremove();
    }
}
