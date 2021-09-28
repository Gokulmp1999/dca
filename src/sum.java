import java.util.Scanner;

public class sum {
    sum(){
        int sum=0;
        System.out.println("LIMIT");
        Scanner s=new Scanner(System.in);
        int limit=s.nextInt();
        int[] array=new int[limit];
        for (int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }

        for (int i=0;i<array.length;i++){
            sum=sum+array[i];

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        new sum();
    }
}
