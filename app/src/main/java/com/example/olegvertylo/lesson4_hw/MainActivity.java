package com.example.olegvertylo.lesson4_hw;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCall;
    Button btn;
    Button btnSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnCall = (Button) findViewById(R.id.btnCall);
        btn = (Button) findViewById(R.id.btn);
        btnSms = (Button) findViewById(R.id.btnSms);

        btnCall.setOnClickListener(this);
        btn.setOnClickListener(this);
        btnSms.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            case R.id.btnCall:
                String number = "0931111111";
                Uri call = Uri.parse("tel:" + number);
                Intent call_number = new Intent(Intent.ACTION_DIAL, call);
                startActivity(call_number);
                break;
            case R.id.btnSms:
                Intent sms = new Intent(Intent.ACTION_VIEW);
                sms.setType("vnd.android-dir/mms-sms");
                sms.putExtra("sms_body", "TEXT SMS");
                startActivity(sms);
                break;


        }

    }


}
