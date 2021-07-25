package template.game;

public class AdvancedLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프 합니다.");

    }

    @Override
    public void turn() {
        System.out.println("턴 불가능");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****숙련자 레벨입니다.****");
    }
}
