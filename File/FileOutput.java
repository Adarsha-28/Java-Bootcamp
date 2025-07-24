//For appending data to a file 3 things needed, printwriter can write mutiple lines to a file, filewriter has append method 

// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.io.PrintWriter;
import java.io.*;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter fw = new FileWriter("Input.txt",true);//false is not to append menas create new file named input.txt, if it is true then apprnd the data into the file
            BufferedWriter bw = new BufferedWriter(fw);//inputting only string or char or int only single value can accept
            //without buffered writer can also this prgm works coz we are not getting any char
            PrintWriter pw = new PrintWriter(bw); //Writing multiple lines
            pw.println("Welcome to Java Programming");
            pw.println("Writing to a file");
            pw.println("II CSE A - File Writer");
            pw.close();
            bw.close();
            fw.close(); //Without the close() the msg wil not written to the file
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
//Append mode - will append the contents in the file
//Write mode -  will create new file and add the contents, if the file exists the content in the file will be flushed or deleted and the new contents alone added