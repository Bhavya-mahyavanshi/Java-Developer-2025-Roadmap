import java.util.Array;
import java.util.Scanner;

class test{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number ofo cols: ");
        int cols = sc.nextInt();

        int[][] numbers = new int [rows][cols];
        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print("Enter the number for ("+i+","+j+"): ");
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0 ; i < rows ; i++){
            for(int j = 0; j < cols; j++){
                if (numbers[i][j]==x){
                    System.out.println("Number found at ("+i+" , " +j+") ");
                }
            }
        }


    }
}