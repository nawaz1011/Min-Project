import java.util.Scanner;
public class Bank {
    private static long ACNO;
    static double balance;
    private static String ACNOHoldername;

    public static long get_ACNO() {
        return ACNO;
    }

    public static double get_balance() {
        return balance;
    }

    public static String get_ACNOHoldername() {
        return ACNOHoldername;
    }

    void set_deposite() {
        System.out.println("how much money do you want deposite");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        Bank.balance = Bank.balance+a;
        System.out.println("Total Blance:"+Bank.balance);

    }

    void set_withdraw() {
        System.out.println("how much money do you want to withdraw");
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n<=balance){
            Bank.balance=Bank.balance-n;
            System.out.println("Total Blance:"+Bank.balance);

        }else{
            System.out.println("insufficiant bank balance in our account");}
    }

    Bank(long ACNO, double balance, String ACNOHoldername) {
        this.ACNO = ACNO;
        this.balance = balance;
        this.ACNOHoldername = ACNOHoldername;
    }
    static void display(){
        System.out.println("ACNOHoldername:"+get_ACNOHoldername());
        System.out.println("balance:"+get_balance());
        System.out.println("ACNO:"+get_ACNO());
    }

}




class ATM{
    public static void main(String[] args) {
        Bank obj=new Bank(40246124304L,3000.0,"SarvepalliHarendra");
        obj.display();
        System.out.println("WLCOME TO THE ATM");
        System.out.println("what do you want like withdraw or deposite?");
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        if("withdraw".equals(ss))
        {
            obj.set_withdraw();
            if(obj.get_balance()!=0){
                System.out.println("do you want withdraw again yes/no?");
                String s=sc.nextLine();
                if("yes".equals(s))
                {
                    obj.set_withdraw();
                    if(obj.get_balance()==0){
                        System.out.println("your account is empty");
                        System.out.println("Thanks for using ATM");
                    }
                    else{
                        System.out.println("Thanks for using ATM");
                    }
                }
                else{
                    System.out.println("Thanks for using ATM");
                }
            }else{
                System.out.println("your account is empty");
                System.out.println("Thanks for using ATM");
            }
        }
        else if("deposite".equals(ss))
        {
            obj.set_deposite();
            System.out.println("do you want withdraw yes/no");
            String s=sc.nextLine();
            if("yes".equals(s))
            {
                obj.set_withdraw();
                if(obj.balance!=0)
                {
                    System.out.println("do you want withdraw again yes/no?");
                    String sss = sc.nextLine();
                    if ("yes".equals(sss))
                    {
                        obj.set_withdraw();
                        if(obj.balance==0){
                            System.out.println("your account is empty");
                            System.out.println("Thanks for using ATM");
                        }else{
                            System.out.println("Thanks for using ATM");
                        }
                    }
                    else
                    {
                        System.out.println("Total Balance:"+obj.balance);
                        System.out.println("Thanks for using ATM");
                    }
                }
                else{
                    System.out.println("thanks for using ATM");
                }
            }
            else{
                System.out.println("Thanks for using ATM");
            }
        }
        else{
            System.out.println("Invalid input");
        }

    }

}

