import java.util.Scanner;
import java.util.Array;

class test{

    public static void main(String[] args){
        //Get bit
        
        /*int n = 5; //0101 (in bianry)
        int pos = 2;
        int bitmask = 1<<pos;
        
        if((bitmask&n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }*/

        //SET - BIT 
        
        /*int n = 5; 
        int pos = 2;
        int bitmask = 1<<pos;

        if((bitmask|n)==0){
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is one");
        }*/

        //Clear bit 

        /*int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        int not = ~(bitmask);
        int deci=not&n; //deci= decimal value

        if((not & n)==0){
            System.out.println("bit is zero");
            System.out.println(deci);
        }else {
            System.out.println("bit is one");
            System.out.println(deci);
        }*/

        //Update bit

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper = 1: set oper=0: clear 
        int n =5;// for oper =1 0101 --> 0111 --> dec 7
        int pos = 1;
        int bitmask = 1<<pos;
        
        if(oper==1){
            //set oper
            //for 0 ---> 1

            int newnumber= bitmask|n;
            System.out.println(newnumber);
        }else{
            //clear oper
            //for 1 ---> 0

            int notbitmask = ~(bitmask);
            int newnumber = (notbitmask&n);
            System.out.println(newnumber);

        }
    }
}