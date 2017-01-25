package edu.washington.jz39.lifecounter;

import android.app.Activity;
import android.app.IntentService;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.p1min).setOnClickListener(new MyListerner(-1, R.id.p1heal, R.id.p1));
        findViewById(R.id.p1minFive).setOnClickListener(new MyListerner(-5, R.id.p1heal, R.id.p1));
        findViewById(R.id.p1add).setOnClickListener(new MyListerner(1, R.id.p1heal, R.id.p1));
        findViewById(R.id.p1addFive).setOnClickListener(new MyListerner(5, R.id.p1heal, R.id.p1));


        findViewById(R.id.p2min).setOnClickListener(new MyListerner(-1, R.id.p2heal, R.id.p2));
        findViewById(R.id.p2minFive).setOnClickListener(new MyListerner(-5, R.id.p2heal, R.id.p2));
        findViewById(R.id.p2add).setOnClickListener(new MyListerner(1, R.id.p2heal, R.id.p2));
        findViewById(R.id.p2addFive).setOnClickListener(new MyListerner(5, R.id.p2heal, R.id.p2));

        findViewById(R.id.p3min).setOnClickListener(new MyListerner(-1, R.id.p3heal, R.id.p3));
        findViewById(R.id.p3minFive).setOnClickListener(new MyListerner(-5, R.id.p3heal, R.id.p3));
        findViewById(R.id.p3add).setOnClickListener(new MyListerner(1, R.id.p3heal, R.id.p3));
        findViewById(R.id.p3addFive).setOnClickListener(new MyListerner(5, R.id.p3heal, R.id.p3));

        findViewById(R.id.p4min).setOnClickListener(new MyListerner(-1, R.id.p4heal, R.id.p4));
        findViewById(R.id.p4minFive).setOnClickListener(new MyListerner(-5, R.id.p4heal, R.id.p4));
        findViewById(R.id.p4add).setOnClickListener(new MyListerner(1, R.id.p4heal, R.id.p4));
        findViewById(R.id.p4addFive).setOnClickListener(new MyListerner(5, R.id.p4heal, R.id.p4));

    }

    public class MyListerner implements View.OnClickListener{
        int operand = 0;
        int healId;
        int playerID;

        public MyListerner(int operand, int healId, int playerID){
            this.operand = operand;
            this.healId = healId;
            this.playerID = playerID;
        }

        @Override
        public void onClick(View view){

            TextView healText = (TextView) findViewById(healId);
            TextView player = (TextView) findViewById(playerID);
            TextView loser = (TextView) findViewById(R.id.loser);

            int heal = Integer.parseInt(healText.getText().toString());
            heal += operand;
            healText.setText(heal + "");
            if(heal <= 0){
                loser.setText(player.getText().toString() + " Loses!");
            }
        }
    }
}
