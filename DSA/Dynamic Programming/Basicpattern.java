import java.util.Scanner;
import java.util.Array;

public class bhavya {
    public static void main(String[] args) 
    {
      /*for(int i=1;i<=4;i++){
        System.out.print("\n");
           for(int j=1;j<=10;j++){
            System.out.print("*");
           }
      }*/

      //hollow rectangle:
      /*int n=4;
      int m=5;
      for (int i =1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if (i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
      }*/

      // half pyramid
      int n=4;
      for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
          System.out.print("*");
        }
        System.out.println();
      }

      //mirror half pyramid
      /*int n=4;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
         System.out.println();
      }*/

      //half pyramid of number;
      /*int n=5;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j+" ");
        }
        System.out.println();
      }*/
       //number printing 
      /*int n=5;
      int a=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print(a+" ");
          a++;
        }
        System.out.println();
      }*/
    }
}

