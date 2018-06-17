package com.example.olearyrm.ohiko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       Intent myIntent = new Intent(this, LoginActivity.class);
       startActivity(myIntent);

    }
}
