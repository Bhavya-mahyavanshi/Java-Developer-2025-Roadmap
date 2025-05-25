import java.util.Scanner;
import java.util.Array;

class test{

    /*public static void printnum(int n){
        For printing 5-1
        if(n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }*/

    /*public static void printno(int n){
        // for printing 1 - 5
        if(n>5){
            return;
        }
        System.out.println(n);
        printno(n+1);
    }*/

    /*public static void add(int n, int a, int sum){
        if(a==n){
            sum += a;
            System.out.println(sum);
           return;yt
        }
        sum += a;
        add(n, a+1, sum);
    }*/

    /*public static void fact(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum = sum *n;
        fact(n-1, sum);
    }*/

    /*public static void fibo(int a, int b, int c, int n, int count){
        if(count==n){
            return;
        }
        c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        fibo(a, b, c, n, count+1);
    }*/

    /*public static void power(int n, int x, int sum, int count){
          if(count==n){
            System.out.println(sum);
             return;
          }
          sum = sum*x;
          power(n, x, sum , count+1);
    }*/

    public static int power2(int n, int x, int sum, int count){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int p = power2(n/2, x, sum, count);
        sum = sum *p;
        count ++;
        
        if(n%2==0 && count == n){
            return sum;
        } else{
            sum = sum *x;
            return sum;
        }
    }

  

    public static void main(String args []){
  
       //Print Number from 5 to 1
       
       //int n=5;
       //printnum(n);
       
       //Print number from 1 to 5

       //int n=1;
       //printno(n);

       //Print Sum of first n numbers

       /*Scanner sc = new Scanner(System.in);
       System.out.print("Enetr the value of n term: ");
       int n = sc.nextInt();
       int a = 1;
       int sum =0;
       
       add(n, a, sum);*/

       //Print factorial of a number n.
    
       /*Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = sc.nextInt();
       int sum = 1;

       fact(n, sum);*/

       //Print the fibonacci series till nth term 

       /*Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n:");
       int n = sc.nextInt();
       int b = 1;
       int a = 0;
       int c = 0;
       int count = 2;

       System.out.println(a);
       System.out.println(b);

       fibo(a, b, c, n, count);*/

       //Print x^n (Stack Height = n)

       /*Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = sc.nextInt();
       System.out.print("Enter the value of x: ");
       int x = sc.nextInt();
       int sum =1;
       int count=0;

       power(n, x, sum, count);*/

       
       
       //Print x^n (Stack height = log(n))

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = sc.nextInt();
       System.out.print("Enter the value of x: ");
       int x = sc.nextInt();
       int sum =1;
       int count=0;

       int total =power2(n, x, sum, count);
       System.out.println(total);

    }
}