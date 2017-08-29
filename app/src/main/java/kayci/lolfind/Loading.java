package kayci.lolfind;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kayci.lolfind.RiotAPI.GetSummonerID;
import kayci.lolfind.RiotAPI.JSON.SummID;
import kayci.lolfind.RiotAPI.Summoner;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                GetSummonerID.getUserInfoSync();
                Intent i = new Intent(Loading.this, DisplaySummonerInfo.class);
                Loading.this.startActivity(i);
                Loading.this.finish();
            }
        }, 3000);
    }
}
