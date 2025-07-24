//Using STATIC KEYWORD

//To display student name, rollno and college name here college name is same so we are using staic keyword while declaring
public class Main{
    public static void main(String[] args){
        Student.clg_name="SECE";
        Student s1 = new Student(1,"Arun");
        Student s2 = new Student(2,"Anu");
        s1.display();
        s2.display();
    }
}

// public -> here for Student cls we can give public when we create new file, if we write more classes in one file only one class should be public. but the .class files are created for all classes
class Student{
    Integer roll_no;
    String name;
    static String clg_name;
    //since clg name is same for all use static keyword to reduce memory space
    Student(Integer roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
        //this.clg_name = clg_name not required
    }
    void display(){
        System.out.println("Roll No: "+roll_no+" Name: "+name+" College: "+clg_name);
    }
}