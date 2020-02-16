package com.tpm.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnHasil, btnCount,btnReset, btnPindah;
    private TextView tvHasil, tvCount;
    private EditText etPanjang, etLebar, etTinggi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnHasil = findViewById(R.id.btn_hasil);
    btnCount = findViewById(R.id.btn_count);
    btnReset = findViewById(R.id.btn_reset);

    tvHasil = findViewById(R.id.tv_hasil);
    etLebar = findViewById(R.id.et_lebar);
    etPanjang = findViewById(R.id.et_panjang);
    etTinggi = findViewById(R.id.et_tinggi);
    tvCount = findViewById(R.id.tv_count);



    btnHasil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String sPanjang = etPanjang.getText().toString();
            String sLebar = etLebar.getText().toString();
            String sTinggi = etTinggi.getText().toString();

            double panjang = Double.parseDouble(sPanjang);
            double lebar = Double.parseDouble(sLebar);
            double tinggi = Double.parseDouble(sTinggi);

            double hasil = panjang+lebar+tinggi;

            String sHasil = String.valueOf(hasil);
            tvHasil.setText(sHasil);
            Intent moveIntent = new Intent(MainActivity.this, halaman2.class);
            moveIntent.putExtra("hasil",sHasil);
            startActivity(moveIntent);
        }
    });
    btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sAmbil = tvCount.getText().toString();
                double Ambil =Double.parseDouble(sAmbil);

                double count = Ambil+1;
                String sCount = String.valueOf(count);
                tvCount.setText(sCount);

            }
        });
    btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double nol = 0;
                double count = nol;
                String sCount = String.valueOf(count);
                tvCount.setText(sCount);

            }
        });
    btnPindah.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent moveIntent = new Intent(MainActivity.this, halaman2.class);
            startActivity(moveIntent);

        }
    });


    }



}
