package com.example.pangling.appsarisan;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class PesanActivity extends AppCompatActivity {

    EditText nomor,pesan;
    Button kirim;
    ProgressBar loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        nomor = (EditText) findViewById(R.id.txtNomorKirim);
        pesan = (EditText) findViewById(R.id.txtPesanKirim);
        kirim = (Button) findViewById(R.id.btnKirimPesan);
        loading = (ProgressBar) findViewById(R.id.pgKirim);

        nomor.setText("151");
        pesan.setText("Transaferpulsa[spasi]Nomor Indosat Tujuan[spasi]Jumlah Pulsa");
        loading.setVisibility(View.INVISIBLE);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loading.setVisibility(View.VISIBLE);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loading.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(),"Pesan Terkirim",Toast.LENGTH_SHORT).show();
                    }
                },3000L);

            }
        });
    }


}
