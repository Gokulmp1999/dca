import java.util.Arrays;
import java.util.Scanner;

public class multiple {
    multiple(){

        Scanner s=new Scanner(System.in);
        System.out.println("limit");
        int l=s.nextInt();
        int[] arr=new int[l];
        for (int i=0;i<l;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("n");
        int n=s.nextInt();
        int mull=1;
        for(int i=0;i<arr.length;i++){
            mull=mull * arr[i];


        }
        int total=mull%n;
        System.out.println(total);

    }

    public static void main(String[] args) {
        new multiple();
    }
}
