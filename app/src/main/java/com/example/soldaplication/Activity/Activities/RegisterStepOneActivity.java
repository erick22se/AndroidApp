package com.example.soldaplication.Activity.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.soldaplication.Activity.Models.User;
import com.example.soldaplication.R;

public class RegisterStepOneActivity extends AppCompatActivity {

    TextInputEditText name,lastName,email, password,address,cellphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step_one);
        Button nextButton = (Button)findViewById(R.id.nextButton);
        name = (TextInputEditText)findViewById(R.id.nameTextInputEdit);
        lastName = (TextInputEditText)findViewById(R.id.lastNameTextInputEdit);
        email = (TextInputEditText)findViewById(R.id.emailTextInputEdit);
        password = (TextInputEditText)findViewById(R.id.passwordTextInputEdit);
        address = (TextInputEditText)findViewById(R.id.addressTextInputEdit);
        cellphone = (TextInputEditText)findViewById(R.id.cellphoneTextInputEdit);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int phone = Integer.parseInt(cellphone.getText().toString());


                    User newUser = new User().setUserId(1)
                            .setName(name.getText().toString())
                            .setLastName(lastName.getText().toString())
                            .setEmail(email.getText().toString())
                            .setPassword(password.getText().toString())
                            .setAddress(address.getText().toString())
                            .setCellphone(phone);
                    Intent intent= new Intent(view.getContext(),RegisterStepTwoActivity.class);
                    intent.putExtras(newUser.toBundle());
                    startActivity(intent);
                }catch (Exception e)
                {
                    Toast.makeText( RegisterStepOneActivity.this,
                            "Complete all the spaces",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
