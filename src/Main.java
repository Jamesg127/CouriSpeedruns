import java.util.Scanner;

void main() throws IOException {
    Scanner scan = new Scanner(System.in);
    CouriSpeedrunsUtility.loadFromFile();
    System.out.println("Hello there, and welcome to Couriway Speedruns!");
    System.out.println("Which run would you like to look at? ");
    int run = scan.nextInt();
    System.out.println("What stat would you like to look at for run " + run);
    System.out.println("Seed (1), Real Time (2), In Game Time (3), Pause Time (4), Blaze Drop Ratio (5), Deaths (6), Nether Entry Time (7), End Entry Time (8)");
    int stat = scan.nextInt();
    if(stat == 1){
        System.out.println(CouriSpeedrunsUtility.getSeed(run));
    }
    else if(stat == 2){
        System.out.println(CouriSpeedrunsUtility.getRealTime(run));
    }
    else if(stat == 3){
        System.out.println(CouriSpeedrunsUtility.getInGameTime(run));
    }
    else if(stat == 4){
        System.out.println(CouriSpeedrunsUtility.getPauseTime(run));
    }
    else if(stat == 5){
        System.out.println(CouriSpeedrunsUtility.getBlazeDropRatio(run));
    }
    else if(stat == 6){
        System.out.println(CouriSpeedrunsUtility.getBlazeDropRatio(run));
    }
    else if(stat == 7){
        System.out.println(CouriSpeedrunsUtility.getEndTime(run));
    }
    else if(stat == 8){
        System.out.println(CouriSpeedrunsUtility.getNetherTime(run));
    }
}
