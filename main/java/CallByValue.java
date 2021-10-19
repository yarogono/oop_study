// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 140p

// 기본 자료형 변수를 복사하는 경우 Call By Value(값에 의한 호출)에 의해
// 그 값이 복사되며 두 개의 변수는 서로에게 영향을 주지 않는다.
public class CallByValue {
    public static void main(String[] args) {
        // 변수 a에 10을 대입한 후
        int a = 10;
        // 변수 b에 변수 a가 가진 값을 복사하고,
        int b = a;
        // 다시 변수 b에 20을 할당
        b = 20;

        System.out.println(a);  // 10
        System.out.println(b);  // 20
        // 이때 a가 가진 값이 단순히 b에 복사된 것이고 a와 b 변수는 아무런 관계도 없는 것을 알 수 있다.
    }
}