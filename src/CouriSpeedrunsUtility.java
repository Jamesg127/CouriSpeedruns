import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class CouriSpeedrunsUtility{
    private ArrayList<CouriSpeedruns> speedruns = new ArrayList<>();
    public void loadFromFile() throws IOException{
        File file = new File("100K Tracker - Raw Data.csv");
        Scanner scan = new Scanner(file);
        ArrayList<CouriSpeedruns> arr = new ArrayList<>();
        String[] r = new String[9];
        while(scan.hasNextLine()){
            r = scan.nextLine().split(",");
            arr.add(new CouriSpeedruns(Integer.parseInt(r[0]), Integer.parseInt(r[1]), Integer.parseInt(r[2]), Integer.parseInt(r[3]), Integer.parseInt(r[4]), Integer.parseInt(r[5]), Long.parseLong(r[6]), Integer.parseInt(r[7]), Integer.parseInt(r[8])));
        }
        speedruns = arr;
    }
}
