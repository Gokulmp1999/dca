import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
    Rotate(){
        Scanner s=new Scanner(System.in);
        System.out.println("LIMIT");
        int n=s.nextInt();
        int[] arr=new int[n];
        int[] tempp=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("D");

        int d=s.nextInt();
        for(int i=0;i<d;i++) {
            int temp;
            temp=arr[0];
            for (int j=0;j<n-1;j++){
                arr[j]=arr[j + 1];}
            arr[n-1]=temp;


//            int  temp;
//            temp = arr[0];
//            for (i = 0; i < n - 1; i++)
//                arr[i] = arr[i + 1];
//            arr[n-1] = temp;

      }
      System.out.println(Arrays.toString(arr));

        }




    public static void main(String[] args) {
        new Rotate();
    }
}
