import java.io.*;
import java.util.Scanner;

public class FileInput{
    public static void main(String [] args){
        File file = new File("Sample.txt");//Since sample.txt in same directory you can mention filename alone
        //Can create or declare path in 3 ways using path,File and Files
        try{
            Scanner sc = new Scanner(file); //Used only to read it cant write the data
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}