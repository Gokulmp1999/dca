import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class stock {
    stock(){
        int one=1;
        Scanner s=new Scanner(System.in);
        System.out.println("lenght");
      int  length=s.nextInt();
        System.out.println("VALUE");
      int[] array=new int[length];
        for (int i=0;i<length;i++){
            array[i]=s.nextInt();
        }

//
//        int array[] = {100,60,70,65,80,85};
//        int i=0;
        int[] ans=new int[length];
////
        for(int i=0;i<ans.length;i++){
            for (i=0;i<array.length;i++){
                ans[i]=1;
            }
//
        }
        for (int i = 1; i <array.length ; i++) {
            int j=i-1;
            while (array[j]<array[i]){
                ans[i]+=1;
                j=j-1;

        }
            System.out.println(ans[i]);





        }





    }

    public static void main(String[] args) {
        new stock();
    }
}
