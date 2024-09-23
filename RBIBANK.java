import java.util.Scanner;
public class  RBIBANK {
    private static Long Accountno;
    private static double Balance;
    private static String Accountholder;

    public static Long get_Accountno() {

        return Accountno;
    }

    public static double get_Balance() {

        return Balance;
    }

    public static String get_Accountholder() {

        return Accountholder;
    }

    RBIBANK(long Accountno, double Balance, String Account_holder) {
        this.Accountno = Accountno;
        this.Balance = Balance;
        this.Accountholder= Account_holder;
    }

    void set_deposite() {
        System.out.println("How much Amount do you want deposite");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        RBIBANK.Balance= RBIBANK.Balance + a;
        System.out.println("Total Balance:" + RBIBANK.Balance);
    }
    void set_withdraw() {
        System.out.println("How much Amount do you want withdraw");
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        if (b <= Balance) {
            RBIBANK.Balance = RBIBANK.Balance - b;
            System.out.println("Total Balance;" + RBIBANK.Balance);
        } else {
            System.out.println("Insufficient Balance in Your Account");
        }
    }
    void display() {
        System.out.println("Accountholder:" + get_Accountholder());
        System.out.println("Balance:" + get_Balance());
        System.out.println("Accountno:" + get_Accountno());
    }
}

class RBIATM{
    public static void main(String[] args) {
        System.out.println("WLCOME TO THE RBIATM");
        System.out.println("Please Inster Your Card");
        System.out.println("-----------------------------");
        System.out.println("Enter your Pin Number");
        Scanner bb= new Scanner(System.in);
        int b=bb.nextInt();
        switch (b){
            case 1:
                System.out.println("");
                if(b==1011){
                    System.out.println("");
                } else{
                    System.out.println("Invalid Pin");
                    break;
                }
        }
        Bank obj=new Bank(233464787797L,50000.0,"SHAIK NAWAZ");
        obj.display();
        System.out.println("Please wait Your Transaction is Processing");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposite");
        System.out.println("what you want(withdraw or deposite)?");
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        if("withdraw".equals(ss))
        {
            obj.set_withdraw();
            if(obj.get_balance()!=0){
                System.out.println("Do you want withdraw again yes/no?");
                Scanner sc1=new Scanner(System.in);
                String nn=sc1.nextLine();
                if("yes".equals(nn))
                {
                    obj.set_withdraw();
                    if(obj.get_balance()==0){
                        System.out.println("your account is Zero Balance");
                        System.out.println("Thanks for using RBIATM && Visit again");
                    }
                    else{
                        System.out.println("Thanks for using RBIATM && Visit again");
                    }
                }
                else{
                    System.out.println("Thanks for using RBIATM && Visit again");
                }
            }else{
                System.out.println("your account is Zero Balance");
                System.out.println("Thanks for using ATM && Visit again");
            }
        }
        else if("deposite".equals(ss))
        {
            obj.set_deposite();
            System.out.println("Do you want withdraw yes/no");
            Scanner sc2=new Scanner(System.in);
            String s=sc2.nextLine();
            if("yes".equals(s))
            {
                obj.set_withdraw();
                if(obj.balance!=0)
                {
                    System.out.println("Do you want withdraw again yes/no?");
                    Scanner sc3=new Scanner(System.in);
                    String sss = sc3.nextLine();
                    if ("yes".equals(sss))
                    {
                        obj.set_withdraw();
                        if(obj.balance==0){
                            System.out.println("your account is Zero Balance");
                            System.out.println("Thanks for using ATM && Visit again");
                        }else{
                            System.out.println("Thanks for using ATM && Visit again");
                        }
                    }
                    else
                    {
                        System.out.println("Total Balance:"+obj.balance);
                        System.out.println("Thanks for using ATM && Visit again");
                    }
                }
                else{
                    System.out.println("thanks for using ATM && Visit again");
                }
            }
            else{
                System.out.println("Thanks for using ATM && Visit again");
            }
        }
        else{
            System.out.println("Invalid Transaction ");
        }

    }

}
