package com.alfonso.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE_PARAMETER = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();
        TextView textView = findViewById(R.id.txv_showing_joke);
        if(intent.hasExtra(JOKE_PARAMETER)) {
            textView.setText(intent.getStringExtra(JOKE_PARAMETER));
        } else  {
            textView.setText(getString(R.string.empty_joke));
        }

    }
}