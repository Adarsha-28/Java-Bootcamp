import java.io.*;
import java.util.Scanner;

public class Count{
    public static void main(String [] args){
        int line_count=0,word_count=0,char_count=0;
        File file = new File("Sample.txt");
        try{
            Scanner sc = new Scanner(file); 
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                line_count++;
                String [] words = str.split(" ");
                word_count += words.length; //gives length of the array , it is not a method ->literal 
                for(String w: words){
                    char_count += w.length(); // For String .length() is a method
                }
            }
            System.out.println("Line count: "+line_count);
            System.out.println("Word count: "+word_count);
            System.out.println("Character count: "+char_count);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}