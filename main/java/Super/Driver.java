// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 170 ~ 171p

// super : 바로 위 상위 클래스의 인스턴스를 지칭하는 키워드
package Super;

class 동물 {

    void method() {
        System.out.println("동물");
    }
}

class 조류 extends 동물 {

    void method() {
        super.method();
        System.out.println("조류");
    }
}


class 펭귄 extends 조류 {

    void method() {
        super.method();
        System.out.println("펭귄");

        // Syntax error on token "super", Identifier expected
        // super.super.method();

        // 책에서는 super 키워드로 바로 위 상위 클래스 인스턴스를 접근 할 수 있고,
        // super.super 형태로 상위의 상위 클래스의 인스턴스는 접근하지 못한다고 한다.
        // 하지만 실행을 해보면 문제없이 돌아간다.
    }
}

public class Driver {
    public static void main(String[] args) {
        펭귄 뽀로로 = new 펭귄();
        뽀로로.method();
    }
}
