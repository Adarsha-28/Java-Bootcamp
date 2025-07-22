import java.util.*;
public class StudentMain{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        Student sarr[] = new Student[size];
        Integer roll_no,mark1,mark2,mark3;
        String name;
        for(int i=0;i<size;i++){
            String[] ip = sc.nextLine().split(" ");
            Student s = new Student(
                Integer.parseInt(ip[0]),
                ip[1],
                Integer.parseInt(ip[2]),
                Integer.parseInt(ip[3]),
                Integer.parseInt(ip[4])
            );
            sarr[i] = s;
        }
        Arrays.sort(sarr); //sarr is array og objects, also Arrays.sort is to sort the array
        int rank=1;
        for(int i=size-1;i>=0;i--){
            System.out.println(sarr[i]+ " " + rank++);
        }
    }
}