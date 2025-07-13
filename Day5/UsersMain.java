import java.util.Scanner;

public class UsersMain{
    public static void main(String args[]){
        String id,name,addr,mobno;
        Users u;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        Users [] uarr = new Users[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the User "+(i+1)+" details:");
            System.out.println("ID:");
            id = sc.nextLine();
            System.out.println("Name:");
            name = sc.nextLine();
            System.out.println("Address:");
            addr = sc.nextLine();
            System.out.println("Mobile No:");
            mobno = sc.nextLine();
            u = new Users(id,name,addr,mobno);
            uarr[i] = u;
        }
        for(Users u1: uarr){
            System.out.print(u1);
        }
    }
}