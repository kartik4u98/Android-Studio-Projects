package com.example.smartbuthon.smartbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static String msg ="WHUT? ";
    static int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button)findViewById(R.id.myButton);
        Button resetButton = (Button)findViewById(R.id.resetButton);

        myButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView myText = (TextView) findViewById(R.id.myText);

                        if (count >= 7)
                            myText.setText("Enough! Press Reset.");
                        else {
                            myText.setText(msg);
                            count++;
                            msg += "WHUT? ";
                        }
                    }
                }
        );

        myButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView myText = (TextView)findViewById(R.id.myText);
                        myText.setText("Holy Crap, that was a long one :/");

                        return true;
                    }
                }
        );

        resetButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView myText = (TextView)findViewById(R.id.myText);
                        myText.setText("WHUT?");
                        msg = "WHUT? ";
                        count = 0;
                    }
                }
        );
    }
}
