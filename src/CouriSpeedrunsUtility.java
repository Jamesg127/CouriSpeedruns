import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class CouriSpeedrunsUtility {
    private static ArrayList<CouriSpeedruns> speedruns = new ArrayList<>();

    public static void loadFromFile() throws IOException {
        File file = new File("100K Tracker - Raw Data.csv");
        Scanner scan = new Scanner(file);
        ArrayList<CouriSpeedruns> arr = new ArrayList<>();
        String[] r = new String[9];
        while (scan.hasNextLine()) {
            r = scan.nextLine().split(",");
            arr.add(new CouriSpeedruns(r[0], r[1], r[2], r[3], Double.parseDouble(r[4]), Double.parseDouble(r[5]), Long.parseLong(r[6]), Integer.parseInt(r[7]), Integer.parseInt(r[8])));
        }
        speedruns = arr;
    }

    public static long getSeed(int run) {
        return speedruns.get(run).getSeed();
    }

    public static String getRealTime(int run) {
        return speedruns.get(run).getRealTime();
    }

    public static String getInGameTime(int run) {
        return speedruns.get(run).getInGameTime();
    }

    public static String getPauseTime(int run) {
        String minutesGame = speedruns.get(run).getInGameTime().substring(2, 4);
        String minutesReal = speedruns.get(run).getInGameTime().substring(2, 4);
        String secondsGame = speedruns.get(run).getInGameTime().substring(5);
        String secondsReal = speedruns.get(run).getInGameTime().substring(5);
        int minutes = Integer.parseInt(minutesReal) - Integer.parseInt(minutesGame);
        int seconds = Integer.parseInt(secondsReal) - Integer.parseInt(secondsGame);
        return minutes + ":" + seconds;
    }

    public static double getBlazeDropRatio(int run) {
        return (speedruns.get(run).getBlazeRods() / speedruns.get(run).getBlazeKilled());
    }

    public static int getDeaths(int run) {
        return speedruns.get(run).getDeaths();
    }

    public static String getNetherTime(int run) {
        return speedruns.get(run).getNether();
    }

    public static String getEndTime(int run) {
        return speedruns.get(run).getEnd();
    }
}