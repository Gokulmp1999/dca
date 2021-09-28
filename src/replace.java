import java.util.Scanner;

public class replace {
    int sum=0;
    int ab,a;
    public replace() {

        System.out.println("limit");
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        System.out.println("t");
        int[] array = new int[limit];
        for (int i = 0; i < limit; i++) {
            array[i] = s.nextInt();
        }
        for(int i=0;i<limit;i++){
            sum=sum+array[i];
        }
        for(int i=0;i<limit-1;i++){
            sum=sum-array[i];
            System.out.println(sum);
        }



    }

    public static void main(String[] args) {
        new replace();
    }
}
