// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 123 ~ 128p

package inheritance03;

public class Driver {
    public static void main(String[] args) {

        // Penguin 클래스의 인스턴스만 힙 영역에 생긴 게 아니라 Animal 클래스의 인스턴스도 함께 힙 영역에 생긴다.
        // -> 하위 클래스의 인스턴스가 생성될 때 상위 클래스의 인스턴스도 함께 생성된다.
        // * Animal 인스턴스 외에 최상의 클래스인 object 클래스의 인스턴스도 함께 생성된다.
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showHabitat();

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        // pingu.habitat = "EBS";

        pingu.showName();
        // pingu.showHabitat();

        // Penguin happyfeet = new Animal();
    }
}
