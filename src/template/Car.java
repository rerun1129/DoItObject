package template;

import java.text.DateFormat;
import java.util.Date;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    public void washCar(){}

    public void startCar(){
        System.out.println("시동을 겁니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public final void run(){              //항상 똑같은 시나리오
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }

}
