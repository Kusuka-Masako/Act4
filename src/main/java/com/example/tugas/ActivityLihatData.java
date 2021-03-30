package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelpon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Ana":
                tvnama.setText("ANA A");
                tvnomor.setText("082222222221");
                break;
            case "Ani":
                tvnama.setText("ANI I");
                tvnomor.setText("082222222222");
                break;
            case "Anu":
                tvnama.setText("ANU U");
                tvnomor.setText("082222222223");
                break;
            case "Ane":
                tvnama.setText("ANE E");
                tvnomor.setText("082222222224");
                break;
            case "Ano":
                tvnama.setText("ANO O");
                tvnomor.setText("082222222225");
                break;
        }
    }
}