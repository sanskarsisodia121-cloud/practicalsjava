class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area = 78.5");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle area = 24");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}

