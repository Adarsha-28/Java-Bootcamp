import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatIO{
    public static void main(String args[]) throws IOException{  //if we write like this throws ioexception means jvm will handle the ioexception
        float a;
        Float b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Float.parseFloat(br.readLine()); //br.readLine() gives or rreturns a string value , Integer.parseInt() coverts to an integer value
        b = Float.parseFloat(br.readLine());
        System.out.println(a+" "+b); // " " this makes the entire expression as strings so it will work as concatenate operator 
        System.out.printf("%4f %2f\n",a,b); //also we can do this with formaateed class
        System.out.printf("%.2f %.2f\n",a,b); //this will give you 2 decimals after decimal
        System.out.printf("%-4.2f %-4.2f\n",a,b);
    }
}