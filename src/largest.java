import java.util.Arrays;
import java.util.Scanner;

public class largest {
    largest(){int max;
        System.out.println("LIMIT");
        Scanner s=new Scanner(System.in);
        int limit=s.nextInt();
        int[] array=new int[limit];
        for (int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        max = array[0];
        for(int i = 0; i < limit; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }

        System.out.println("Maximum value:"+max);




    }

    public static void main(String[] args) {
        new largest();
    }
}
