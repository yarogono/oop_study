// 쥐 클래스의 논리적 설계
// 쥐 | 성명, 나이, 꼬리수 | 울다()

// 쥐 클래스의 물리적 설계
// Mouse | name: String, age: int, countOfTail: int | sing(): void

// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 90 ~ 101p
package abstract01;

public class Mouse {
    public String name;
    public int age;
    public int countOfTail;

    public void sing() {
        System.out.println(name + " 찍찍!!!");
    }
}
