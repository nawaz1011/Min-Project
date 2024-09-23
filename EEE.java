public class EEE {
    private static int age=20;
    private static int id=114;
    private static Long number=235708746649L;
    public  void set_ph(Long number){
        this.number=number;
    }
    public static int get_id(){
        return id;
    }
    public static Long get_phone(){
        return number;
    }
    public static int get_age(){
        return age;
    }
}
class nawaz{
    public static void main(String[] args){
        System.out.println(EEE.get_id());
        System.out.println(EEE.get_age());
        EEE obj=new EEE();
        obj.set_ph(65667777800000L);
        System.out.println(EEE.get_phone());
    }
}
