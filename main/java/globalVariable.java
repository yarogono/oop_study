
// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 64 ~ 69p
public class globalVariable {
    // share 변수는 T 메모리 스태틱 영역에 변수 공간이 할당된다.

    // globalVariable 클래스가 T 메모리 스태틱 영역에 배치될 때
    // 그 안에 share 변수가 클래스의 멤버로 공간을 만들어 저장된다.

    static int share;

    public static void main(String[] args) {
        share = 55;

        int k = fun(5, 7);

        System.out.println(share);
    }


    // fun() 함수는 메서드 스택 프레임에 생성된다.
    private static int fun(int m, int p) {

        // 전역변수 share 는 func static 메서드가 소멸되어도 값이 남아있다.
        share = m + p;


        return m - p;
    }
}

// 스택 프레임에 종속적인 지역 변수
// 스택 프레임에 독립적인 전역 변수

// 젼역 변수를 쓰지 말라고 하는 이유
// 프로젝트 규모에 따라 코드가 커지면서 여러 메서드에서 전역 변수의 값을 변경하기 시작하면 T 메모리로 추적하지 않는 이상
// 전역 변수에 저장돼 있는 값을 파악하기 쉽지 않기 때문이다.
// => 전역 변수를 읽기 전용 혹은 상수로 쓰면 문제 해결
