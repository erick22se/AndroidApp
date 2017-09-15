package com.example.soldaplication;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText emailEditText;
    TextInputEditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailEditText =(TextInputEditText)findViewById(R.id.emailTextInputEdit);
        passwordEditText =(TextInputEditText)findViewById(R.id.passwordTextInputEdit); Button button = (Button)findViewById(R.id.enter_Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(emailEditText.getText().equals("sample@hotmail.com")&&passwordEditText.getText().equals("123"))
                    //startActivity(new Intent(view.getContext(),LoginActivity.class));
                    Snackbar.make(view, "Your email or password are wrong", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                else
                    Snackbar.make(view, "Your email or password are wrong", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
            }
        });
    }
}