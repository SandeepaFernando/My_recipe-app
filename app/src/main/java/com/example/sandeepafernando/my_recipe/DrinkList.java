package com.example.sandeepafernando.my_recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DrinkList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_list);
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

    public void watermelon(View view){
        Intent intent=new Intent(this,Watermelon.class);
        startActivity(intent);
    }
    public void carrotJuice(View view){
        Intent intent=new Intent(this,carrotJuice.class);
        startActivity(intent);
    }
    public void PineApp(View view){
        Intent intent=new Intent(this,PineApp.class);
        startActivity(intent);
    }


    public void Gerkin(View view){
        Intent intent=new Intent(this,Gerkin.class);
        startActivity(intent);
    }
}
