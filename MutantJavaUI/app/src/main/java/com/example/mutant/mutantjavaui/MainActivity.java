package com.example.mutant.mutantjavaui;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout
        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.setBackgroundColor(Color.GREEN);

        //Button
        Button redButton = new Button(this);
        redButton.setText("Log In");
        redButton.setBackgroundColor(Color.RED);
        redButton.setId(1);

        //Username input
        EditText username = new EditText(this);
        username.setId(2);

        //center the button
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );


        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Give Rules to position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Converting dpi to pixels
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());

        username.setWidth(px);




        //Add widget to layout(button is now a child of layout)
        myLayout.addView(redButton, buttonDetails);
        myLayout.addView(username, usernameDetails);

        //Set this activities content/display to this view
        setContentView(myLayout);

    }
}
