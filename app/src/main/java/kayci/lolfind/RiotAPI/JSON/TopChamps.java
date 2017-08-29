package kayci.lolfind.RiotAPI.JSON;

/**
 * Created by lenovo on 2017/8/14.
 */
public class TopChamps {
    private String championPoints;

    private String playerId;

    private String championPointsUntilNextLevel;

    private String chestGranted;

    private String championLevel;

    private String tokensEarned;

    private String championId;

    private String championPointsSinceLastLevel;

    private String lastPlayTime;

    public String getChampionPoints ()
    {
        return championPoints;
    }

    public void setChampionPoints (String championPoints)
    {
        this.championPoints = championPoints;
    }

    public String getPlayerId ()
    {
        return playerId;
    }

    public void setPlayerId (String playerId)
    {
        this.playerId = playerId;
    }

    public String getChampionPointsUntilNextLevel ()
    {
        return championPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel (String championPointsUntilNextLevel)
    {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public String getChestGranted ()
    {
        return chestGranted;
    }

    public void setChestGranted (String chestGranted)
    {
        this.chestGranted = chestGranted;
    }

    public String getChampionLevel ()
    {
        return championLevel;
    }

    public void setChampionLevel (String championLevel)
    {
        this.championLevel = championLevel;
    }

    public String getTokensEarned ()
    {
        return tokensEarned;
    }

    public void setTokensEarned (String tokensEarned)
    {
        this.tokensEarned = tokensEarned;
    }

    public String getChampionId ()
    {
        return championId;
    }

    public void setChampionId (String championId)
    {
        this.championId = championId;
    }

    public String getChampionPointsSinceLastLevel ()
    {
        return championPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel (String championPointsSinceLastLevel)
    {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public String getLastPlayTime ()
    {
        return lastPlayTime;
    }

    public void setLastPlayTime (String lastPlayTime)
    {
        this.lastPlayTime = lastPlayTime;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [championPoints = "+championPoints+", playerId = "+playerId+", championPointsUntilNextLevel = "+championPointsUntilNextLevel+", chestGranted = "+chestGranted+", championLevel = "+championLevel+", tokensEarned = "+tokensEarned+", championId = "+championId+", championPointsSinceLastLevel = "+championPointsSinceLastLevel+", lastPlayTime = "+lastPlayTime+"]";
    }
}
