package inheritance;

public class Driver {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammalia mammalia = new Mammalia();
        Birds bird = new Birds();
        Whale whale = new Whale();
        Bat bat = new Bat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        animal.showMe();
        mammalia.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();

    }
}
