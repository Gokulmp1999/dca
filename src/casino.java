import java.util.Scanner;

public class casino{


casino(){
    int sum=0;

System.out.println("enter limit" );
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    int[] a=new int[limit];
    System.out.println("enter elements" );

    for (int i=0;i<limit;i++){
        a[i]=s.nextInt();
    }
    System.out.println("k");
//    for (int i=0;i<limit;i++){
//        System.out.println(a[i]);
//    }
for(int i=0;i<limit;i++){
//    for (int j=i+1;i<limit;j++){

       sum= a[i]+sum;


}
    System.out.println(sum);



}

    public static void main(String[] args) {
        new casino();
    }
}
