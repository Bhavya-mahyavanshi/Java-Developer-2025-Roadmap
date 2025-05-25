
//Base class
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

//Single inheritance:
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//Multilevel Inheritance:
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

//Hierarchical inheritance:
class Circle extends Shape {
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class OOPsInheritance {
    public static void main(String[] args) {
        
        
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(10, 5);
    }
}
