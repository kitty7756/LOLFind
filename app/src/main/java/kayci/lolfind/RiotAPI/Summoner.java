package kayci.lolfind.RiotAPI;

/**
 * Created by lenovo on 2017/8/17.
 */
public class Summoner {

    private static String apiKey = "RGAPI-4ece51eb-1742-46fd-9741-1c4a168beced";
    private static String summonerName = null;
    private static String summonerID = null;
    private static String summonerLevel = null;

    private static final Summoner instance = new Summoner();

    //private constructor to avoid client applications to use constructor
    private Summoner(){
    }

    public static Summoner getInstance(){
        return instance;
    }

    public static void setSummonerName(String name) {
        summonerName = name;
    }

    public static String getSummonerName() {
        return summonerName;
    }

    public static void setSummonerID(String id) {
        summonerID = id;
    }

    public static String getSummonerID(){
        return summonerID;
    }

    public static String getApiKey() {
        return apiKey;
    }

    public static void setSummonerLevel(String level) {
        summonerLevel = level;
    }

    public static String getSummonerLevel(){
        return summonerLevel;
    }


}
