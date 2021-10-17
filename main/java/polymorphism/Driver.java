// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 128 ~ 133p

package polymorphism;

public class Driver {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showName("펭수");
        pororo.showHabitat();

         Animal pingu = new Penguin();

         pingu.name = "핑구";
        // 아래 코드를 수행하면?
        // Animal 객체에 정의된 showName() 메서드가 아닌 Penguin 객체에 의해 재정의된 showName() 메서드가 실행된다.
         pingu.showName();

         // 상위 클래스 타입의 객체 참조 변수를 사용하더라도 하위 클래스에서 오버라이딩(재정의)한 메서드가 호출된다.
    }
}
