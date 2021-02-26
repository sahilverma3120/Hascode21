package hashcode;

import java.awt.*;

private static Point currentTL;
private static Point targetTL;

public class Car {
    void Car(Point target, Point current){

    }

    void driveStr(Street s){
        while (Point == false)
        {
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
            }
        }
        this.wait(s.time);
        while(!s.queue.get(0).equals(this)){
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
            }
        }
        currentTL = s.goesTo;
        goesOn();
    }

    boolean goesOn(){
        if(currentTL == targetTL){
            return false;
        }
        else {
            return true;
        }
    }
}
