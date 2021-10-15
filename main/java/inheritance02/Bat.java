package inheritance02;

public class Bat extends Mammalia implements Flyable{
    public Bat() {
        myClass = "박쥐";

    }

    @Override
    public void fly() {
        System.out.println(myClass + " 날고 있삼.. 슈웅!!! 슈웅!!!");
    }
}
