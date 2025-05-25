import java.util.Scanner;
import java.util.Array;

class test{

    public static void main(String[] args){
        //String Declaration
       
        /*String name = "Bhavya";
        String fullname = "Bhavya Mahyavanshi";
        String sentence = "my name is Bhavya";*/

        /*Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is: " +name);*/

        //Concatenation 

        /*String firstname = "Bhavya";
        String Lastname = "Mahyavanshi";
        String Fullname = firstname + " " + Lastname;
        System.out.println(Fullname);*/

        //Length of string

        /*System.out.println(Fullname.length());*/

        //charAt

        /*for(int i = 0; i < Fullname.length(); i++){
            System.out.println(Fullname.charAt(i));
        }*/

        //Compare

        String name1 = "tony";
        String name2 = "tony";

        //1 S1 > S2 : +ve value 
        //2 S2 == S2 : 0
        //3 S1 < S2 : -ve value

        /*if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }*/

        /*if(name1 == name2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }*/

        //Error, why not to use " == "

        /*if(new String("tony") == new String("tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }*/

        //taking out a word from the string

        String sentence = "My name is tony";
        //substring(beg index, end index);
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        //Strings are immutable 
        //measn once a string is created you cannot change or modify the string.
        //to make changes in the string you need to create new string.

           
    }
}