import java.util.Scanner;
import java.util.Array;

class test{

    public static void main(String[] args){
        //StringBuilder sb = new StringBuilder("Bhavya");
        //System.out.println(sb);

        //char at index 0

        /*System.out.println(sb.charAt(0));*/

        //set char at index 0

        /*sb.setCharAt(0, 's');
        System.out.println(sb);*/

        //insert 

        /*sb.insert(0, 's');
        System.out.println(sb);

        sb.insert(2,'s');
        System.out.println(sb);*/

        //delete the extra s

        /*sb.delete(2, 3);
        System.out.println(sb);*/

        //append 

        /*sb.append("_");
        sb.append("s");
        sb.append("a");
        sb.append("i");
        sb.append("y");
        sb.append("a");
        sb.append("m");
        System.out.println(sb.length());*/

        // Q: reverse a string

        StringBuilder name = new StringBuilder("hello");

        for(int i=0; i<name.length()/2; i++){
            int front = i;
            int back = name.length() - 1 - i; //6-1-0 = 5

            char frontchar = name.charAt(front);
            char backchar = name.charAt(back);

            name.setCharAt(front, backchar);
            name.setCharAt(backchar, frontchar);

        }

        System.out.println(name);

    
    }
}