import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Read1char{
    public static void main(String args[]) throws IOException{
        char a;
        Character b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /*a = (char)br.read();
        b = br.readLine().charAt(0);*/

        /*a = (char)br.read();
        b = (char)br.read();*/

        
        System.out.println(a+ " "+b);
    }
}