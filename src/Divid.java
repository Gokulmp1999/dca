import java.util.Arrays;
import java.util.Scanner;

public class Divid {
    Divid(){
        float sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n1,n2;

        int number=s.nextInt();
        float value=number;
        while (number>0){
            n1=number%10;
            sum=sum+value/n1;
        number=number/10;}


            if(sum%2==0){
                System.out.println("yes");

            }
            else{
                System.out.println("no");

            }

//         System.out.println(sum);

    }
    public static void main(String args[]){
        new Divid();
    }
}
