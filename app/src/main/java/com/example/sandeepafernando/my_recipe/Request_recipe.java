package com.example.sandeepafernando.my_recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Request_recipe extends AppCompatActivity {
    private String mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_recipe);


        mEditTextTo = "sandeepapriyashan@gmail.com";
        mEditTextSubject = (EditText) findViewById(R.id.editText3);
        mEditTextMessage = (EditText) findViewById(R.id.editText8);

        Button buttonSend = (Button) findViewById(R.id.button4);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }

    private void sendMail() {
        String recipientList = mEditTextTo;
        String[] recipients = recipientList.split(",");

        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();

        if (subject.equals("") || message.equals("")) {
            Toast.makeText(getApplicationContext(), "Fieldes are empty!", Toast.LENGTH_SHORT).show();
        } else {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, recipients);
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, message);

            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Choose an email client"));
        }
    }
}
