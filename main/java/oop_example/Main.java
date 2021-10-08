package oop_example;

public class Main {
    public static void main(String[] args) {

        // 하위클래스 is a kind of 상위 클래스
        // josh is kind of 사람
        People josh = new GrandParents("Josh", 75, 1);
        People smith = new Parents("Smith", 50, 3);
        People lilly = new Child("Lilly", 20, 5);

        josh.printWhoAmI();
        josh.Walk(1, 1);

        System.out.println("\n");
        smith.printWhoAmI();
        smith.Walk(1, 1);
        smith.Run(2, 2);

        System.out.println("\n");
        lilly.printWhoAmI();
        lilly.Walk(1, 1);
        lilly.Run(2, 2);
        lilly.Swim(3, -1);
    }
}
