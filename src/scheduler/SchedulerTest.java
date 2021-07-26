package scheduler;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {

        // R, L, P
        System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");

        int ch = System.in.read();

        Scheduler scheduler = null;      //일단 인스텁스 생성하지 않고 타입만 정하기

        switch (ch) {                    //여기서 인스턴스 각각 생성
            case 'R':
            case 'r':
                scheduler = new RoundRobin();   //이런식으로 다형성을 이용한다.
                break;
            case 'L':
            case 'l':
                scheduler = new LeastJob();
                break;
            case 'P':
            case 'p':
                scheduler = new PriorityAllocation();
                break;
            default:
                System.out.println("잘못 입력.");
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();

    }
}
