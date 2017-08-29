package kayci.lolfind.RiotAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kayci.lolfind.RiotAPI.JSON.TopChamps;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/16.
 */

public class GetTopChampion {

    private static OkHttpClient client = new OkHttpClient();

    public static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static void getChamps(){
        String json = null;
        try {
            String url = "https://na1.api.riotgames.com/lol/champion-mastery/v3/champion-masteries/by-summoner/"
                    + Summoner.getInstance().getSummonerID() + "?api_key=" + Summoner.getInstance().getApiKey();
            json = getJSON(url);
        } catch (Exception e){
            e.printStackTrace();
        }

        Gson gson = new Gson();
        Type listType = new TypeToken<List<TopChamps>>(){}.getType();
        List<TopChamps> top = (List<TopChamps>) gson.fromJson(json, listType);


        for (TopChamps tp : top) {
            System.out.println("ChampionID: " + tp.getChampionId());
        }
    }

}
