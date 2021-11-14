package DesignPattern.TemplateCallback;

public class Soldier {
    void runContext(String weaponSound) {
        System.out.println("전투 시작");
        executeWeapone(weaponSound).runStrategy();
        System.out.println("전투 종료");
    }

    private Strategy executeWeapone(final String weaponSound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
