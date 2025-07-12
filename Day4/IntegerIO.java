import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerIO{
    public static void main(String args[]) throws IOException{  //if we write like this throws ioexception means jvm will handle the ioexception
        int a;
        Integer b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine()); //br.readLine() gives or rreturns a string value , Integer.parseInt() coverts to an integer value
        b = Integer.parseInt(br.readLine());
        System.out.println(a+" "+b); // " " this makes the entire expression as strings so it will work as concatenate operator 
    }
}