package com.example.soldaplication.Activity.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.soldaplication.Activity.Models.User;
import com.example.soldaplication.R;

public class ProfileActivity extends AppCompatActivity {

    TextInputEditText name,lastName,email, password,address,cellphone, cardNumber, secureCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        name = (TextInputEditText)findViewById(R.id.nameTextInputEdit);
        lastName = (TextInputEditText)findViewById(R.id.lastNameTextInputEdit);
        email = (TextInputEditText)findViewById(R.id.emailTextInputEdit);
        password = (TextInputEditText)findViewById(R.id.passwordTextInputEdit);
        address = (TextInputEditText)findViewById(R.id.addressTextInputEdit);
        cellphone = (TextInputEditText)findViewById(R.id.cellphoneTextInputEdit);
        cardNumber = (TextInputEditText)findViewById(R.id.cardNumberTextInputEdit);
        secureCode = (TextInputEditText)findViewById(R.id.secureCodeTextInputEdit);


        User user = User.fromBundle(getIntent().getExtras());

        name.setHint(user.getName());
        lastName.setHint(user.getLastName());
        email.setHint(user.getEmail());
        password.setHint(user.getPassword());
        address.setHint(user.getAddress());
        cellphone.setHint(Integer.toString(user.getCellphone()));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Are you sure to keep the changes?", Snackbar.LENGTH_LONG)
                        .setAction("Save", onClickListenerForAction()).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private View.OnClickListener onClickListenerForAction() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };
    }

}
