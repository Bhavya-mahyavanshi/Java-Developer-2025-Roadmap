class Pen{

    // below variable is known as properties of object
    String colour;
    String type; //ballpoint; gel

    //This below void function is known as method
    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.colour);
        //"this" keyword defines which object is calling the method
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Non-Parameterized constructor : 
   
    /*Student() {
        System.out.println("Constructor called");
    }*/

    //Parameterize Constructor:

    /*Student(String name, int age){
        this.name = name;
        this.age = age;
    }*/

    //Copy Constructor:
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){
        
    }
}

public class OOPS {
    public static void main(String[] args) {
       
        //Example 1:
        /*Pen pen1 = new pen();
        pen1.colour = "Blue";
        pen1.type ="gel";

        Pen pen2 = new pen();
        pen2.colour = "Black";
        pen2.type ="Ballpoint";

        pen1.printColor();
        pen2.printColor();*/

        //Example 2:

        /*Student s1 = new Student();
        s1.name = "Bhavya";
        s1.age = 20;

        s1.printInfo();*/

        //Example of Parameterized Constructor:

        /*Student s1 = new Student("Bhavya", 20);
        s1.printInfo();*/

        //Example of copy constructor:

        Student s1 = new Student();
        s1.name = "Bhavya";
        s1.age = 20;

        Student s2 = new Student(s1);
        s2.printInfo();


    }
}
