package com.example.sandeepafernando.my_recipe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent openIntent = new Intent(MainActivity.this, Register.class);
                startActivity(openIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
    /*public void ButtonClick(View view){

        EditText et1 = (EditText) findViewById(R.id.username);
        EditText et2 = (EditText) findViewById(R.id.password);

        String email = et1.getText().toString();
        String pass = et2.getText().toString();

        String oemail = "admin";
        String opass = "admin123";



        if(email.equals(oemail) && pass.equals(opass) )
        {
            Intent intent = new Intent(this,Recipe_List.class);
            startActivity(intent);
        }

        else
        {

            Toast toast = Toast.makeText(this, "Invalid Email or Password",Toast.LENGTH_LONG);
            toast.show();
        } */

}


