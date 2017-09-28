package com.example.soldaplication.Activity.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.soldaplication.Activity.Models.User;
import com.example.soldaplication.R;

public class RegisterStepTwoActivity extends AppCompatActivity {

    TextInputEditText cardNumber,secureCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step_two);
        Button saveButton = (Button)findViewById(R.id.saveButton);
        cardNumber = (TextInputEditText)findViewById(R.id.cardNumberTextInputEdit);
        secureCode = (TextInputEditText)findViewById(R.id.secureCodeTextInputEdit);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox confirmation = (CheckBox)findViewById(R.id.conditionCheckBox);
                if(confirmation.isChecked())
                {
                    try {
                        int card = Integer.parseInt(cardNumber.getText().toString());
                        int code = Integer.parseInt(secureCode.getText().toString());
                        User user = User.fromBundle(getIntent().getExtras());
                        user.setCardNumber(card).setSecureCode(code);
                        Intent intent = new Intent(view.getContext(),MainActivity.class);
                        intent.putExtras(user.toBundle());
                        startActivity(intent);
                    }catch (Exception e)
                    {
                        Toast.makeText( RegisterStepTwoActivity.this,
                                "Complete all the spaces",
                                Toast.LENGTH_SHORT).show();
                    }
                }
                else
                    Snackbar.make(view, "Confirm our terms and conditions", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

            }
        });
    }
}
