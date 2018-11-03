package com.example.sandeepafernando.my_recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Desserts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void watalappan(View view){
        Intent intent = new Intent(this,watalappan.class);
        startActivity(intent);
    }

    public void mocha(View view){
        Intent intent = new Intent(this,MochaSnow.class);
        startActivity(intent);
    }

    public void eggless(View view){
        Intent intent = new Intent(this,EgglessMarble.class);
        startActivity(intent);
    }

    public void pineapple(View view){
        Intent intent = new Intent(this,Pineapple.class);
        startActivity(intent);
    }
}
