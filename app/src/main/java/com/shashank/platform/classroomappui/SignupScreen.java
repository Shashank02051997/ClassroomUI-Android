package com.shashank.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupScreen extends AppCompatActivity implements View.OnClickListener {

    TextView signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
        signIn = findViewById(R.id.sign_in);
        signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.sign_in){
            finish();
        }
    }
}
