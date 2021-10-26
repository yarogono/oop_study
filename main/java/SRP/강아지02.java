// SRP => "어떤 클래스를 변갱해야 하는 이유는 오직 하나뿐이어야 한다" - 로버트 C.마틴
// 클래스를 역할과 책임에 따라 분리해서 각각 하나의 역할과 책임만 갖게 한다.

// - 하나의 속성이 여러 의미를 갖느 경우도 단일 책임 원칙을 지키지 못하는 경우다.
// - 데이터베이스 테이블을 설계할 때도 단일 책임 원칙을 고려해야 한다.
//   데이터베이스 테이블을 설계할 때는 정규화라고 하는 과정을 거치게 되는데,
//   정규화 과정을 조금 더 확장해서 생각해 보면 테이블과 필드에 대한 단일 책임 원칙의 적용이라고 할 수 있다.
// - 단일 책임 원칙과 가장 관계가 깊은 것은 바로 모델링 과정을 담당하는 추상화이다.


package SRP;

// 아래 코드는 SRP(단일 책임 원칙)을 적용한 코드
// 강아지가 소변을 보는 것은 공통적인 것이기 때문에 추상 클래스에 메소드로 추가
abstract class 강아지02 {
    abstract void 소변보다();
}

class 수컷강아지 extends 강아지02 {

    @Override
    void 소변보다() {
        //한쪽 다리를 들고 소변을 본다.
    }
}

class 암컷강아지 extends 강아지02 {

    @Override
    void 소변보다() {
        //뒷다리 두 개로 앉은 자세로 소변을 본다.
    }
}
