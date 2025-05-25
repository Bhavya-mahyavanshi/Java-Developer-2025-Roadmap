import java.util.Scanner;
import java.util.Array;

class test{
    /*public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }*/
    /*public static int multi(int a,int b){
        int c = a*b;
        System.out.println("The answer is: ");
        System.out.println(c);
        return c;
    }*/

    public static void printFact(int n){
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
        int fact =1;
        for (int i=n;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();

        PrintMyName(name);*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value: ");
        int a = sc.nextInt();
        System.out.println("enter the second value: ");
        int b = sc.nextInt();

        multi(a, b);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numer: ");
        int n = sc.nextInt();

        printFact(n);




        
    }
}