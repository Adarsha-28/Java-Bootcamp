public class Student{
    Integer id;
    String name;
    static String collegeName; //Instance variables refers to class
    //college name is same for all students so separate mem is not req which will req more space, to reduce that use static which will have same value for all the objects
    
    public Student(){

    }

    public Student(Integer id,String name){ //Local variable / Parameter
        this.id=id;
        this.name=name;
        //this.collegeName=collegeName; not required
    }

    public void display(){
        System.out.println("Student Details");
        System.out.println("ID "+this.id);
        System.out.println("Name "+this.name);
        System.out.println("College Name "+collegeName);
    }
}