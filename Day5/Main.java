import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Int Array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        Integer [] arr1 = new Integer[size];
        int[] arr2 = new int[size];
        System.out.println("Array created at "+arr); // if addr comes then array is created at some memory
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Values in Int Array:");
        for (int a:arr){
            System.out.println(a);
        }
        
        //arr1 = Arrays.copyOf(arr,size); cannot covert int[] to Integer[] -->want to use generic datatype <T> or use lambda functions
        arr2 = Arrays.copyOf(arr,size);
    }
}