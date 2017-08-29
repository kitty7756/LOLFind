package kayci.lolfind;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import kayci.lolfind.RiotAPI.GetSummonerID;
import kayci.lolfind.RiotAPI.GetTopChampion;
import kayci.lolfind.RiotAPI.Summoner;

/**
 * Created by lenovo on 2017/8/17.
 */

public class DisplaySummonerInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_summoner);
        TextView name = (TextView) findViewById(R.id.textView5);
        TextView id = (TextView) findViewById(R.id.textView6);
        TextView level = (TextView) findViewById(R.id.textView7);
        name.setText(Summoner.getInstance().getSummonerName());
        id.setText(Summoner.getInstance().getSummonerID());
        level.setText(Summoner.getInstance().getSummonerLevel());
    }

}
