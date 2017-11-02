package com.example.pangling.appsarisan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.txtUsernameLogin);
        password = (EditText) findViewById(R.id.txtPasswordLogin);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String us = username.getText().toString();
                String pss = password.getText().toString();
                if(us.equals("Gagah") && pss.equals("123")){
                    Toast.makeText(getApplicationContext(),"Login Berhasil",Toast.LENGTH_SHORT).show();
                    Intent i = null;
                    i = new Intent(MainActivity.this,MenuActivity.class);
                    finish();
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Gagal Login",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
