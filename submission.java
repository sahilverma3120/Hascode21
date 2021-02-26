package hashcode;

import java.io.File;

public class Submission {
    public static void submit(final int numberOfIntersections) {
        FileManager.createFile("Submission.txt");
        FileManager.clearFile("Submission.txt");
        FileManager.writeIntoFile("Submission.txt", String.valueOf(numberOfIntersections));

        //schedules:
        for(int i = 0; i < numberOfIntersections; i++) {
            int intersectionId = 1;
            int numberOfIncomingStreets = 2;
            int E = 3;
            FileManager.writeIntoFile("Submission.txt", String.valueOf(intersectionId));
            FileManager.writeIntoFile("Submission.txt", String.valueOf(numberOfIncomingStreets));
            for(int j = 0; j < E; j++) {
                String streetName = "Teststrabe";
                int greenLightDuration = 2;
                FileManager.writeIntoFile("Submission.txt", streetName + " " + greenLightDuration);
            }
        }
    }
}
