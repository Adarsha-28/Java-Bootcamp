import java.util.Scanner;

public class ScannerIO{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        char b;
        float c;
        char d;
        a = sc.nextInt();
        sc.nextLine(); //1. scan the nextline \n character
        b = sc.nextLine().charAt(0);
        c = Float.parseFloat(sc.nextLine()); // 2.get as string and change it to float
        d = sc.nextLine().charAt(0);
        System.out.println(a+ " "+b+" "+ c + " "+d);
    }
}