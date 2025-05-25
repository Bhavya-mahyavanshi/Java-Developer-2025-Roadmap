//Abstract Class Example

/*abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("you created a horse");
    }
   public void walk(){
    System.out.println("Walk on 4 legs");
   }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}*/

//Interfaces(Pure abstraction)

interface Animal {
    int eyes = 2;
    public void walk();
    public void eat();
}

interface Herbivore{

}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

//Static keyword:

class Student {
    String name;
    static String school; //value that is common for all objects

    public static void changeSchool(){
        school = "newSchool";
    }
}
class OOPs{
    
    public static void main(String[] args) {
        Student.school = "Seneca";
        Student student1 = new Student();
        student1.name = "Bhavya";
        System.out.println(student1.school);
    }
}