//Interfaces with multiple inhertance program;
public interface institute {
    public abstract void course();
    public abstract void fee();
    public abstract void Time_Duration();
    public abstract void placement();
}
abstract class student{
    int id;
    String name;
    int age;
    public abstract void display();
}
class employee extends student{
    int empid;
    public  void working(){
        System.out.println("working");
    }
    public void course(){
        System.out.println("course");
    }
    public void fee(){
        System.out.println("fee");
    }
    public void Time_Duration(){
        System.out.println("Time Duration");
    }
    public void placement(){
        System.out.println("placement");
    }
    public void project() {
        System.out.println("Company project");
    }
    public void company(){
        System.out.println("company=IT Company");
        System.out.println("no.of employees=12568");
        System.out.println("Salary=4,53,42,35,670");
    }

    public void display(){
        System.out.println("id=1256");
        System.out.println("name= NAWAZ");
        System.out.println("age= 22");
    }
}
interface office{
    void project();
    void company();
}
abstract class life extends employee implements institute, office{
    public static void main(String[] args){
        employee obj=new employee();
        obj.course();
        obj.fee();
        obj.Time_Duration();
        obj.placement();
        obj.project();
        obj.company();
        obj.display();
    }
}

