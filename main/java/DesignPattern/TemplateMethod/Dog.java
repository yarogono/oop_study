package DesignPattern.TemplateMethod;

public class Dog extends Animal {
    @Override
    // 추상 메서드 오버라이딩
    void play() {
        System.out.println("멍! 멍!");
    }

    @Override
    // Hook(갈고리) 메서드 오버라이딩
    void runSomething() {
        System.out.println("멍! 멍!~ 꼬리 살랑 살랑~");
    }

    // 상위 클래스를 포함하는 Animal.java의 예제
//    public void playWithOwner() {
//        System.out.println("귀염둥이 이리온...");
//        System.out.println("멍! 멍!");
//        System.out.println("꼬리 살랑 살랑~");
//        System.out.println("잘했어");
//    }
}
