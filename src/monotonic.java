import java.util.Scanner;

public class monotonic {
    monotonic(){
        int ftr1=0,ftr2=0,ft3=0,ft4=0;
        Scanner s=new Scanner(System.in);
        System.out.println("limit");
        int l=s.nextInt();
        int[] arr=new int[l];
        for (int i=0;i<l;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<l;i++){
            if(arr[i]<=arr[i+1]&& arr[l-2]<=arr[l-1]){
                ftr1=1;

                break;
//                System.out.println("INCRESING");
            }else if(arr[i]>=arr[i+1]&& arr[l-2]>=arr[l-1]){
                ftr2=1;
                break;
//                System.out.println("DECRESING");
            }else if(arr[i]<=arr[i+1]&& arr[l-2]>=arr[l-1]){
                ft3=1;
                break;
//                System.out.println("INCREASING AND DECRESING");
            }else {
                ft4=1;
                break;
//                System.out.println("DECREASING AND INCREASING");
            }
        }
        if(ftr1==1){

            System.out.println("INCRESING");
        }else if(ftr2==1){
            System.out.println("DECRESING");
        }else if(ft3==1){
            System.out.println("INCREASING AND DECRESING");
        }else {
            System.out.println("DECREASING AND INCREASING");
        }

    }

    public static void main(String[] args) {
        new monotonic();
    }
}
