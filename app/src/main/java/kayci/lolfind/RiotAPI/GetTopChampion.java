package kayci.lolfind.RiotAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kayci.lolfind.AsyncResponse;
import kayci.lolfind.RiotAPI.JSON.SummID;
import kayci.lolfind.RiotAPI.JSON.TopChamps;
import okhttp3.Call;
import okhttp3.Callback;
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

    public static AsyncResponse resp = null;
    private static OkHttpClient client = new OkHttpClient();

    //Asynchronous

    public static Call getJSON(String url, Callback callback) {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);
        return call;
    }

    public static void getTopFiveChampions() {
        final String url = "https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-name/" + Summoner.getInstance().getSummonerID()
                + "?api_key=" + Summoner.getInstance().getApiKey();
        getJSON(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                resp.whenNoInternet();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String r = response.body().string();

                    Gson gson = new Gson();
                    SummID summID = gson.fromJson(r, SummID.class);

                    Summoner.getInstance().setSummonerName(summID.getName());
                    Summoner.getInstance().setSummonerID(summID.getId());
                    Summoner.getInstance().setSummonerLevel(summID.getSummonerLevel());
                    resp.whenFinish();

                } else {
                    resp.whenBroken();
                }
            }
        });
    }
}
