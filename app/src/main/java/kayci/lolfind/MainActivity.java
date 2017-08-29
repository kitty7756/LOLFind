package kayci.lolfind;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kayci.lolfind.RiotAPI.GetSummonerID;
import kayci.lolfind.RiotAPI.Summoner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText text = (EditText)findViewById(R.id.editText2);
        String value = text.getText().toString();
        if (value.equals("")) {
            Context context = getApplicationContext();
            CharSequence tex = "Field cannot be empty!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, tex, duration);
            toast.show();
          } else {
            Summoner.getInstance().setSummonerName(value);
            Intent i = new Intent(this, Loading.class);
            startActivity(i);
          }
    }
}
