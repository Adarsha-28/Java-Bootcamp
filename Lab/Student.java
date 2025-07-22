public class Student implements Comparable<Student>{ //For comparing only
    Integer roll_no;
    String name;
    Integer mark1;
    Integer mark2;
    Integer mark3;
    Integer total;
    Student(Integer roll_no,String name,Integer mark1,Integer mark2,Integer mark3){
        this.roll_no=roll_no;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.total = mark1+mark2+mark3;
    }
    @Override
    public String toString(){
        return roll_no +" "+name;
    }

    public int compareTo(Student s){ //compare returns only integer
        return this.total.compareTo(s.total);
    }
}