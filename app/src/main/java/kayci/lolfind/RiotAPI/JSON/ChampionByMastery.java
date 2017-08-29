package kayci.lolfind.RiotAPI.JSON;

/**
 * Created by lenovo on 2017/8/16.
 */
public class ChampionByMastery {
    private String id;

    private String botMmEnabled;

    private String rankedPlayEnabled;

    private String active;

    private String botEnabled;

    private String freeToPlay;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getBotMmEnabled ()
    {
        return botMmEnabled;
    }

    public void setBotMmEnabled (String botMmEnabled)
    {
        this.botMmEnabled = botMmEnabled;
    }

    public String getRankedPlayEnabled ()
    {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled (String rankedPlayEnabled)
    {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    public String getActive ()
    {
        return active;
    }

    public void setActive (String active)
    {
        this.active = active;
    }

    public String getBotEnabled ()
    {
        return botEnabled;
    }

    public void setBotEnabled (String botEnabled)
    {
        this.botEnabled = botEnabled;
    }

    public String getFreeToPlay ()
    {
        return freeToPlay;
    }

    public void setFreeToPlay (String freeToPlay)
    {
        this.freeToPlay = freeToPlay;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", botMmEnabled = "+botMmEnabled+", rankedPlayEnabled = "+rankedPlayEnabled+", active = "+active+", botEnabled = "+botEnabled+", freeToPlay = "+freeToPlay+"]";
    }
}
