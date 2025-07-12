import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IntFloatChar{
    public static void main(String args[]) throws IOException{
        Integer a;
        Character b,c;
        Float d;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = br.readLine().charAt(0); //(char)br.read();
        //br.readLine();
        d = Float.parseFloat(br.readLine());
        c = br.readLine().charAt(0);
        str = br.readLine();
        System.out.print(a+" "+b+" "+d+" "+c+" "+str);
        br.close();
    }
}