package com.example.pangling.appsarisan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArisanActivity extends AppCompatActivity {

    EditText namaPemain;
    Button add,mulai;
    ListView lvDaftar;
    List<String> daftar = new ArrayList<>();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arisan);

        namaPemain = (EditText) findViewById(R.id.txtNamaArisan);
        add = (Button) findViewById(R.id.btnAddArisan);
        mulai = (Button) findViewById(R.id.btnArisanMulaiArisan);
        lvDaftar = (ListView) findViewById(R.id.lvArisan);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daftar.add(namaPemain.getText().toString());

                adapter = new ArrayAdapter(ArisanActivity.this,android.R.layout.simple_list_item_1,daftar);
                lvDaftar.setAdapter(adapter);
            }
        });

        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                String random = daftar.get(rand.nextInt(daftar.size()));

                Toast.makeText(getApplicationContext(),random,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
