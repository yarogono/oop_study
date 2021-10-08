package oop_example;

public class People {
    private String name;
    private int age;
    private int x, y;
    private int speed;


    public People(String name, int age, int speed, int x, int y) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public People(String name, int age, int speed) {
        this(name, age, speed, 0, 0);
    }

    public String getLocation() {
        return "(" + x + ", " + y + ")";
    }

    protected void printWhoAmI() {
        System.out.println("My name is " + name + ", " + age + "aged.");
    }

    public void Walk(int x, int y) {
        System.out.println("Walk speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walked to " + getLocation());
    }

    public void Run(int x, int y) {
        System.out.println("Run speed: " + speed + 2);
        this.x = x;
        this.y = y;
        System.out.println("Run to " + getLocation());
    }

    public void Swim(int x, int y) {
        System.out.println("Swim speed: " + speed + 1);
        this.x = x;
        this.y = y;
        System.out.println("Swim to " + getLocation());
    }
}
