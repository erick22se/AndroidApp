package com.example.soldaplication.Activities;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.soldaplication.R;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText email;
    TextInputEditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = (Button)findViewById(R.id.enter_Button);
        TextView register = (TextView)findViewById(R.id.register_TextView);
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(view.getContext(),RegisterStepOneActivity.class));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = (TextInputEditText)findViewById(R.id.emailTextInputEdit);
                password = (TextInputEditText)findViewById(R.id.passwordTextInputEdit);
                if(email.getText().length() == 0 && password.getText().length() == 0)
                   startActivity(new Intent(view.getContext(),MainActivity.class));
                else
                    Snackbar.make(view, "Your email or password are wrong", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();


            }
        });
    }
}