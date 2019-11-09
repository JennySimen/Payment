package com.example.cressence.payment;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class PaymentActivity extends AppCompatActivity {
    private Button mRegisterButton;
    private TextView mLOGIN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        mRegisterButton = findViewById(R.id.register_button);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent1);

                mLOGIN = findViewById(R.id.login);
                mLOGIN.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent3 = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(intent3);
                    }
                });



            }
        });

    }

    }


