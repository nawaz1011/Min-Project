import java.lang.reflect.Method;
Reverse Number by using while loop;
import java.util.Scanner;
public class number_programs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int reverse = 0;
        while(n!= 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n= n/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
==============================================================================================
Reverse Number by using for loop;
import java.util.Scanner;
public class number_programs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int reverse = 0;
        for( ;n != 0; n=n/10)
        {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
================================================================================================
Reverse a number using recursion;
import java.util.Scanner;
public class number_programs {
    public static void main(String args[]) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print("The reverse of the given number is: ");
        reverseNumber(n);
    }
    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }
}
=================================================================================
ARRAY TOPIC IN JAVA
Basic program;
class number_programs{
    public static void main(String args[]){
        int a[]=new int[5];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
//traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);
    }
}
====================================================================================
class number_programs{
    public static void main(String[] args) {
        int a[]={13,77,34,67,34,49};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
========================================================================================
Array using Method;
class number_programs{
    public static void main(String args[]) {
        int a[] = {33, 3, 4, 5};
        min(a);
    }
    static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];
        System.out.println(min);
    }

}
================================================================================================
Array for print number;
import java.util.Scanner;
class number_programs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
========================================================================================================
Reverse order of number;
import java.util.Scanner;
class number_programs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
=================================================================================================================
Sum of array program;
import java.util.Scanner;
class number_programs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        } System.out.print(sum);
    }
}
=====================================================================================================================
Even Number by using Array;
import java.util.Scanner;
class number_programs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
=====================================================================================================================
Odd Number by using Array;
import java.util.Scanner;
class number_programs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
=======================================================================================================================
Range of number 5 to 10 program;
import java.util.Scanner;
class number_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            for (int i = 0; i < n; i++) {
                if(arr[i]>5 && arr[i]<10){
                    System.out.print(arr[i]+" ");
                }
            }
    }
}
================================================================================================================
Frist even number program;
import java.util.Scanner;
class number_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]==2){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
==================================================================================================================
Multidimensional Java Array Program;
class number_programs{
    public static void main(String args[]){
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
=====================================================================================================================
Copying an Array in Java;
class number_programs {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[9];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(String.valueOf(copyTo));
    }
}
=====================================================================================================================
Frequency Program;
public class number_programs{
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }
}
