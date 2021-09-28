import java.util.*;

public class Teacher {
    Teacher(){
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int count=0;
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=s.nextInt();
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1]&&arr[i]<arr[i+1]){
                count++;

            }
            }
        System.out.println(count);
        }

    public static void main(String args[]){
        new Teacher();
    }
}
