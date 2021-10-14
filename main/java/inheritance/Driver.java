// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 110 ~ 117p

// 클래스명은 분류스럽게
// 객체 참조 변수명은 유일무이한 사물처럼 작명해야 한다.

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

        // 상위 클래스에서만 showMe()를 구현했지만 모든 하위 클래스의 객체에서 showMe() 메서드를 사용 할 수 있다.
        // 상속한다는 것이 이렇게 상위 클래스의 특성을 상속한다는 의미이지 부모-자식 관계는 아니다.
        animal.showMe();
        mammalia.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();

        Animal[] animals = new Animal[7];

        animals[0] = new Animal();
        animals[1] = new Mammalia();
        animals[2] = new Birds();
        animals[3] = new Whale();
        animals[4] = new Bat();
        animals[5] = new Sparrow();
        animals[6] = new Penguin();

        for (int index = 0; index < animals.length; index++) {
            animals[index].showMe();
        }

        // 상속의 더 명확한 영어 표헌은 is kind of 관계다.
        // 펭귄 is a kind of 동물 -> 펭귄은 동물의 한 분류다.
        // 고래 is a kind of 동물 -> 고래는 동물의 한 분류다.
        // 조류 is a kind of 동물 -> 조류는 동물의 한 분류다.

        // - 객체 지향의 상속은 상위클래스의 특성을 재사용하는 것이다.
        // - 객체 지향의 상속은 상위 클래스의 특성을 확장하는 것이다.
        // - 객체 지향의 상속은 is a kind of 관계를 만족해야 한다.
    }
}
