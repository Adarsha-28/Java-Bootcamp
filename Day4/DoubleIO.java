import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleIO{
    public static void main(String args[]) throws IOException{  //if we write like this throws ioexception means jvm will handle the ioexception
        double a;
        Double b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(br.readLine()); //br.readLine() gives or rreturns a string value , Integer.parseInt() coverts to an integer value
        b = Double.parseDouble(br.readLine());
        System.out.println(a+" "+b); // " " this makes the entire expression as strings so it will work as concatenate operator 
    }
}