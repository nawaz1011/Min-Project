Recursion method;
import java.util.Scanner;
public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        num(a);
        System.out.println("Finish the number");
    }
    public static void num(int a) {
        if(a>0){
            System.out.print(a+" ");
            num(a-1);
        }
        else{
            System.out.print(0+" ");
        }
    }
}
=====================================================================================
import java.util.Scanner;
public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        num(a);
        System.out.println("Finish the number");
    }
    public static void num(int a) {
        if(a>0){
            num(a-1);
            System.out.print(a+" ");

        }
        else{
            System.out.print(0+" ");
        }
    }
}
=======================================================================================
factor of function by using Recursion;
import java.util.Scanner;
public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result=num(a);
        num(a);
        System.out.println(result+" ");
    }
    public static int num(int a) {
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a*num(a-1);
        }
    }
}

