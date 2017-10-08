package com.drone.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        //to get extra information
        Bundle applesData = getIntent().getExtras();


        if(applesData == null){
            return;
        }

        final TextView baconText = (TextView) findViewById(R.id.baconText);
        String appleMessage = applesData.getString("appleMessage");
        baconText.setText(appleMessage);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Apples.class);


        startActivity(i);
    }
}
