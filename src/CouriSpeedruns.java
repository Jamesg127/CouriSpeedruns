public class CouriSpeedruns {
    private String realTime;
    private String nether;
    private String end;
    private String inGameTime;
    private double blazeRods;
    private double blazeKilled;
    private long seed;
    private int runNumber;
    private int deaths;
    public CouriSpeedruns(String rta, String n, String e, String igt, double br, double bk, long s, int d){
        realTime = rta;
        nether = n;
        end = e;
        inGameTime = igt;
        blazeRods = br;
        blazeKilled = bk;
        seed = s;
        deaths = d;
    }
    public String getRealTime(){
        return realTime;
    }
    public String getNether(){
        return nether;
    }
    public String getEnd(){
        return end;
    }
    public String getInGameTime(){
        return inGameTime;
    }
    public double getBlazeRods(){
        return blazeRods;
    }
    public double getBlazeKilled(){
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
