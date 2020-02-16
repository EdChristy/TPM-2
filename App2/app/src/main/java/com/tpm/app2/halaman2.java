package com.tpm.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class halaman2 extends AppCompatActivity {
private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        tvHasil = findViewById(R.id.tv_hasil);
        String hasil = getIntent().getStringExtra("hasil");
        tvHasil.setText(hasil);
    }
}
