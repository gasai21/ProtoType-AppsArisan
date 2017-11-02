package com.example.pangling.appsarisan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PesanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
    }

    public void goToInbox(View v) {
        Intent intent = new Intent(PesanActivity.this, ReceiveSMSActivity.class);
        startActivity(intent);
    }

    public void goToCompose(View v) {
        Intent intent = new Intent(PesanActivity.this, SendSMSActivity.class);
        startActivity(intent);
    }
}
