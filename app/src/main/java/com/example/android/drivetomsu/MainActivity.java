package com.example.android.drivetomsu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//code to create implicit intent to open google maps app
    public void startImplicitIntent(View view) {

        Intent newIntent = new Intent(Intent.ACTION_VIEW);
        newIntent.setData(Uri.parse("geo:0,0?q=Montclair+State+University\n" + "    +New Jersey+USA"));
        startActivity(newIntent);

    }

}