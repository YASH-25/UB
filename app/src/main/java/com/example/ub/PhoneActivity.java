package com.example.ub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PhoneActivity extends AppCompatActivity {

    EditText enternumber;
    Button getotpbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        enternumber = findViewById(R.id.input_mobile_number);
        getotpbutton =findViewById(R.id.buttonongetotp);


        getotpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!enternumber.getText().toString().trim().isEmpty()){
                    if((enternumber.getText().toString().trim()).length() == 10){
                    Intent intent = new Intent(getApplicationContext(),verifyActivity.class);
                    intent.putExtra("mobile",enternumber.getText().toString());
                    startActivity(intent);
                }else {
                    Toast.makeText(PhoneActivity.this, "Please enter correct number", Toast.LENGTH_LONG);
                  }
                }else{
                    Toast.makeText(PhoneActivity.this,"Enter mobile number",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}