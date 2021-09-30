package com.company;

//Problem 1:
class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }


}

//Problem 2:
class cellphone {
    public void vibrate() {
        System.out.println("The phone is vibrating.....");
    }

    public void ring() {
        System.out.println("The phone is ringing....");
    }

    public void calling() {
        System.out.println("Making a phone call to Ravi");
    }
}

//Problem 3:
class square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 2 * (side + side);
    }
}

//Problem 4:
class rectangle {
    float a;
    float b;

    public float area() {
        return a * b;
    }

    public float perimeter() {
        return 2 * (a + b);
    }
}

//Problem 5:
class TommyVecetti {
    public void hitting() {
        System.out.println("Hitting .....");
    }

    public void firing() {
        System.out.println("Firing....");
    }

    public void running() {
        System.out.println("Running....");
    }
}

class circle {
    float r;

    public float area() {
        return 3.14f * r * r;
    }

    public float cicumference() {
        return 2 * 3.14f * r;
    }
}

public class Chapter8_PracticeSet {
    public static void main(String[] args) {
        Employee1 ravi = new Employee1();
        ravi.setName("Ravi Gupta");
        ravi.salary = 532656;
        System.out.println(ravi.getName());
        System.out.println(ravi.getSalary());

        cellphone asus = new cellphone();
        asus.calling();
        asus.vibrate();
        asus.ring();


        square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        rectangle rect = new rectangle();
        rect.a = 3.5682f;
        rect.b = 4.2458f;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());

        TommyVecetti rock = new TommyVecetti();
        rock.firing();
        rock.hitting();
        rock.running();

        circle c = new circle();
        c.r = 1;
        System.out.println("The area of the circle is " + c.area());
        System.out.println("The circumference of the circle is " + c.cicumference());

    }
}
