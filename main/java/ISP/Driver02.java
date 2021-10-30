package ISP;

import java.util.Date;

// ! 빈약한 상위 클래스를 이용한 경우 여기저기 형변환이 발생하면서 상속의 혜택을 제대로 누리지 못하게 된다.

class 사람02 {
    String 이름;
    Date 생일;
    String 주민등록번호;

    public 사람02(String 이름, Date 생일, String 주민등록번호) {
        this.이름 = 이름;
        this.생일 = 생일;
        this.주민등록번호 = 주민등록번호;
    }

    public void 먹다() {
    }

    public void 자다() {
    }

    public void 소개하다() {

    }
}

class 학생02 extends 사람02 {
    String 학생번호;

    public 학생02(String 이름, Date 생일, String 주민등록번호, String 학생번호) {
        super(이름, 생일, 주민등록번호);
        this.학생번호 = 학생번호;
    }

    public void 공부하다() {
    }
}

class 군인02 extends 사람02 {
    String 군번;

    public 군인02(String 이름, Date 생일, String 주민등록번호, String 군번) {
        super(이름, 생일, 주민등록번호);
        this.군번 = 군번;
    }

    public void 훈련하다() {
    }
}

public class Driver02 {
    public static void main(String[] args) {
        사람02 김학생 = new 학생02("김학생", new Date(2000, 01, 01), "20000101-1234567", "20190001");
        사람02 이군인 = new 군인02("이군인", new Date(1998, 12, 31), "19981231-1234567", "19-12345678");

        System.out.println(김학생.이름);
        System.out.println(이군인.이름);


        System.out.println(김학생.생일);
        System.out.println(이군인.생일);

        System.out.println(김학생.주민등록번호);
        System.out.println(이군인.주민등록번호);

        김학생.먹다();
        이군인.먹다();

        김학생.자다(); // 사용불가
        이군인.자다(); // 사용불가


        김학생.소개하다(); // 사용불가
        이군인.소개하다(); // 사용불가


        ((학생02) 김학생).공부하다(); // 캐스팅 필요
        ((군인02) 이군인).훈련하다(); // 캐스팅 필요

    }
}
