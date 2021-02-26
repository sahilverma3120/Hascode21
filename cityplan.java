package hashcode;

public class cityPlan {
    public static int T;
    public static int numberIntersection;
    public static int numberStreets;
    public static int numberOfCars;
    public static int scoreForReachingEnd;

    public static int startIntersection;
    public static int endIntersection;
    public static String streetName;
    public static int L;


    cityPlan(int pT, int pNumberIntersection, int pNumberStreets, int pNumberCars, int pScoreForReachingEnd) {
        T = pT;
        numberIntersection = pNumberIntersection;
        numberStreets = pNumberStreets;
        numberOfCars = pNumberCars;
        scoreForReachingEnd = pScoreForReachingEnd;
    }

    cityPlan(int pStartIntersection, int pEndIntersection, String pStreetName, int pL) {
        startIntersection = pStartIntersection;
        endIntersection = pEndIntersection;
        streetName = pStreetName;
        L = pL;
    }
}
