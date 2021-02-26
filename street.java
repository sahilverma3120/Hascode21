package hashcode;

import java.awt.*;
import java.util.ArrayList;


public class Street extends cityPlan{

    public static Point goesTo;
    public static int time;
    public static ArrayList<Car> queue = new ArrayList();

    Street(int pStartIntersection, int pEndIntersection, String pStreetName, int pL) {
        super(pStartIntersection, pEndIntersection, pStreetName, pL);
    }


    void Street(Point gt,int T){
        goesTo = gt;
        time = T * 1000;
    }

    public static void addCarQueue(Car c){
        queue.add(c);
    }
    public static void deleteCarQueue(){
        queue.remove(0);
    }

    public static void canDrive(int time)
    {
        boolean light = false; //Traffic Light is red
        if(time == 0)
        {
            light = true;
        }
    }

}
