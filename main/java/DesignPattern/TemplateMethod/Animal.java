package DesignPattern.TemplateMethod;

// 상위 클래스를 포함하는 Animal.java

//추상(abstract) 메서드가 클래스 안에 있으면 클래스에도 'abstract' 를 붙여줘야 한다.
public abstract class Animal {
    // 템플릿 메서드
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온...");
        play();
        runSomething();
        System.out.println("잘했어");
    }

    // 추상 메서드
    abstract void play();

    // Hook(갈고리) 메서드
    void runSomething() {
        System.out.println("꼬리 살랑 살랑~");
    }
}
