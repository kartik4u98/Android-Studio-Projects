package com.example.meme.memegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This gets called by top_fragment when user clicks button
    @Override
    public void createMeme(String top, String bottom) {
        //Reference to bottom fragment
        BottomPictureFragment bottomFragment;
        bottomFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.picture_fragment);
        bottomFragment.setMemeText(top, bottom);
    }
}
