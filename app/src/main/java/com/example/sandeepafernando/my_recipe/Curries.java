package com.example.sandeepafernando.my_recipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Curries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curries);
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

    public void chicken(View view){
        Intent intent=new Intent(this,chicken.class);
        startActivity(intent);
    }
    public  void beef(View view){
        Intent intent=new Intent(this,beef.class);
        startActivity(intent);
    }
    public  void pork(View view){
        Intent intent=new Intent(this,pork.class);
        startActivity(intent);
    }
    public  void vegitarian(View view){
        Intent intent=new Intent(this,vegiterian.class);
        startActivity(intent);
    }

}
