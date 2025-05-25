import java.util.Array;
import java.util.Scanner;

class test{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        //For Input
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the value: ");
             marks[i]= sc.nextInt();
        }

        int x = sc.nextInt();

        /*int[] Marks = new int[3];
        Marks[0]= 97;
        Marks[1]=98;
        Marks[2]=95;*/

        //System.out.println(Marks[0]);
        //System.out.println(Marks[1]);
        //System.out.println(Marks[2]);

        //For output
        for(int i=0;i<size;i++){
            if(marks[i]== x){
                System.out.println("Fount at index: " +i);
            }
        }
    }
}