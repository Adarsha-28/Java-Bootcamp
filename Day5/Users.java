public class Users{
    String id,name,address,mobno;
    public Users(){

    }
    public Users(String id,String name,String address,String mobno){
        this.id=id;
        this.name=name;
        this.address=address;
        this.mobno=mobno;
    }

    public void setID(){
        this.id=id;
    }
    public void setName(){
        this.name=name;
    }
    public void setAddress(){
        this.address=address;
    }
    public void setMobno(){
        this.mobno=mobno;
    }

    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }public String getAddress(){
        return address;
    }public String getMobno(){
        return mobno;
    }
    @Override
    public String toString(){
        return "String [ID: "+id+" NAME: "+name+" ADDRESS: "+address+" MOBILE NO: "+mobno+"]";
    }
}