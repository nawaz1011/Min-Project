//TASK ON ABSTRACTION;
public abstract class Boss {
    public abstract void bonus();
    public abstract void hiring_salary();
}
class Senior extends Boss {
    public void bonus() {
        System.out.println("Two Months Salary bonus");
        System.out.println("Salary + Bonus");
    }
    public void hiring_salary() {
        System.out.println("Hiring salary");
        System.out.println("Thank you for hiring my salary");
    }
    public static void Lunch() {
        System.out.println("Lunch is free for all Employees");
        System.out.println("Thank you for  Providing Lunch to all Employees");
    }
}
class Junior extends Senior {
    public static void main(String[] args) {
        Boss obj = new Senior();
        obj.bonus();
        obj.hiring_salary();
        Lunch();
    }
}
