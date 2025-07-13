public class Student{
    Integer id;
    String name;
    public Student(){

    }
    public Student(Integer id, String name){
        this.id = id;
        this.name=name; 
    }

    // public Integer getId(){
    //     return id;
    // }

    // public void setID(Integer id){
    //     this.id=id;
    // }

    // public String getName(){
    //     return name;
    // }

    // public void setName(String Name){
    //     this.name = name;
    // }

    @Override
    public String toString(){
        return "String [id="+id+" , Name="+name+"]";
    }
}