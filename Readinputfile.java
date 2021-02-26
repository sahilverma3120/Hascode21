package hashcode;

public class ReadInputFile extends cityPlan{

    ReadInputFile(int pT, int pNumberIntersection, int pNumberStreets, int pNumberCars, int pScoreForReachingEnd) {
        super(pT, pNumberIntersection, pNumberStreets, pNumberCars, pScoreForReachingEnd);
    }

    public static void getInputFromFile(final String fileName){
        String output = FileManager.readFile(fileName);
        String lines[] = output.split("\n");
        T = Integer.parseInt(lines[0].split(" ")[0]);
        numberIntersection = Integer.parseInt(lines[0].split(" ")[1]);
        numberStreets = Integer.parseInt(lines[0].split(" ")[2]);
        numberOfCars = Integer.parseInt(lines[0].split(" ")[3]);
        scoreForReachingEnd = Integer.parseInt(lines[0].split(" ")[4]);
        System.out.println(T); // duration of simulation
        System.out.println(numberIntersection);
        System.out.println(numberOfCars);
        System.out.println(scoreForReachingEnd);
        getStreets(lines,numberStreets);
        getCars(lines, numberOfCars , 1 + numberStreets);
    }

    public static void getStreets(final String lines[], final int streets) {
        for(int i = 1; i <= streets; i++) {
            startIntersection = Integer.parseInt(lines[i].split(" ")[0]);
            endIntersection = Integer.parseInt(lines[i].split(" ")[1]);
            streetName = lines[i].split(" ")[2];
            L = Integer.parseInt(lines[i].split(" ")[3]);
            System.out.println(startIntersection);
            System.out.println(endIntersection);
            System.out.println(streetName);
            System.out.println(L +"\n");
        }
    }

    public static void getCars(final String lines[], final int cars, final int currentLine) {
        for(int i = currentLine; i < currentLine + cars; i++) {
            String[] path = lines[i].split(" ");
            int numberOfStreets = Integer.parseInt(path[0]);
            String[] streetsToPass = new String[numberOfStreets];
            for(int j = 1; j <= numberOfStreets; j++) {
                streetsToPass[j-1] = path[j];
            }
            System.out.println(numberOfStreets);
            for(String street : streetsToPass) {
                System.out.println(street);
            }
        }
    }
}
