package com.example.pangling.appsarisan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button arisan,pesan,logout;
    Intent i=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        arisan = (Button) findViewById(R.id.btnArisanMenu);
        pesan = (Button) findViewById(R.id.btnPesanMenu);
        logout = (Button) findViewById(R.id.btnLogoutMenu);

        arisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MenuActivity.this,ArisanActivity.class);
                startActivity(i);
            }
        });

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MenuActivity.this,PesanActivity.class);
                startActivity(i);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MenuActivity.this,MainActivity.class);
                finish();
                startActivity(i);
            }
        });
    }
}
