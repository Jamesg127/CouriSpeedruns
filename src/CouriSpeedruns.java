public class CouriSpeedruns {
    private int realTime;
    private int nether;
    private int end;
    private int inGameTime;
    private int blazeRods;
    private int blazeKilled;
    private long seed;
    private int runNumber;
    private int deaths;

    public CouriSpeedruns(int rta, int n, int e, int igt, int br, int bk, long s, int rn, int d){
        realTime = rta;
        nether = n;
        end = e;
        inGameTime = igt;
        blazeRods = br;
        blazeKilled = bk;
        seed = s;
        runNumber = rn;
        deaths = d;
    }
    public int getRealTime(){
        return realTime;
    }
    public int getNether(){
        return nether;
    }
    public int getEnd(){
        return end;
    }
    public int getInGameTime(){
        return inGameTime;
    }public int getBlazeRods(){
        return blazeRods;
    }
    public int getBlazeKilled(){
        return blazeKilled;
    }
    public long getSeed(){
        return seed;
    }
    public int getRunNumber(){
        return runNumber;
    }
    public int getDeaths(){
        return deaths;
    }




}
