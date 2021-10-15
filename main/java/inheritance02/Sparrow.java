package inheritance02;

public class Sparrow extends Bird implements Flyable {

    public Sparrow() {
        myClass = "참새";
    }

    @Override
    public void fly() {
        System.out.println(myClass + " 날고 있삼... 허우적!!! 허우적!!!");
    }
}
