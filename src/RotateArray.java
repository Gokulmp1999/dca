import java.util.Scanner;

class RotateArray {
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++){
            leftRotatebyOne(arr, n);}
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }

    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        RotateArray rotate = new RotateArray();
        Scanner s=new Scanner(System.in);
        System.out.println("limit");
        int n=s.nextInt();
        System.out.println("eleme");
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i] =s.nextInt();
        }
        System.out.println("d");
        int d=s.nextInt();
        rotate.leftRotate(arr, d, n);
        rotate.printArray(arr, n);
    }
}
 