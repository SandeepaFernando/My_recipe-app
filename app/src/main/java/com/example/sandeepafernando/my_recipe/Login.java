package com.example.sandeepafernando.my_recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DatabaseHelper(this);
        e1 = (EditText)findViewById(R.id.email);
        e2 = (EditText)findViewById(R.id.password2);
        b1 = (Button) findViewById(R.id.Login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = e1.getText().toString();
                String password = e2.getText().toString();
                Boolean Chkemailpass = db.emailpassword(email,password);
                if(Chkemailpass==true) {

                    Intent intent = new Intent(Login.this,Left_menu.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Wrong Email or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
