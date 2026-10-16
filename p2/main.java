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

class Person {
    void showName() {
        System.out.println("Person: Rahul");
    }
}

class Employee extends Person {
    void showJob() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    void showRole() {
        System.out.println("Manager");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showName();
        m.showJob();
        m.showRole();
    }
}



class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
    }
}


