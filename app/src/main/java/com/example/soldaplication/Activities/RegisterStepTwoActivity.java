package com.example.soldaplication.Activities;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.soldaplication.R;

public class RegisterStepTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step_two);
        Button saveButton = (Button)findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox confirmation = (CheckBox)findViewById(R.id.conditionCheckBox);
                if(confirmation.isChecked())
                    startActivity(new Intent(view.getContext(),MainActivity.class));
                else
                    Snackbar.make(view, "Confirm our terms and conditions", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

            }
        });
    }
}
