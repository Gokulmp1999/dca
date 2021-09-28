import java.util.Arrays;
import java.util.Scanner;

public class rotatefin {
     void rotate(int arr[],int d,int n){
        for (int i=0;i<d;i++){
            leftt(arr,n);


        }
        System.out.println(Arrays.toString(arr));

    }
    void leftt(int arr[],int n){
        int temp,i;
        temp=arr[0];
        for (i=0;i<n-1;i++){
            arr[i]=arr[i + 1];}
        arr[n-1]=temp;

    }
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("LIMIT");
        int n= S.nextInt();
        int[] arr=new int[n];
        System.out.println("ELEM");
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        System.out.println("D");
        int d= S.nextInt();
        rotatefin r=new rotatefin();
        r.rotate(arr,d,n);

    }
}
