package kayci.lolfind;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kayci.lolfind.RiotAPI.GetSummonerID;

public class Loading extends AppCompatActivity implements AsyncResponse {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        GetSummonerID.resp = this;
        GetSummonerID.getUserInfoSync();

    }

    @Override
    protected  void onResume() {
        super.onResume();

    }

    @Override
    public void whenFinish() {
        Intent i = new Intent(Loading.this, DisplaySummonerInfo.class);
        Loading.this.startActivity(i);
        Loading.this.finish();
    }

    @Override
    public void whenBroken() {
        Intent i = new Intent(Loading.this, UserNull.class);
        Loading.this.startActivity(i);
        Loading.this.finish();
    }

    @Override
    public void whenNoInternet() {
        Intent i = new Intent(Loading.this, NoInternet.class);
        Loading.this.startActivity(i);
        Loading.this.finish();
    }
}
