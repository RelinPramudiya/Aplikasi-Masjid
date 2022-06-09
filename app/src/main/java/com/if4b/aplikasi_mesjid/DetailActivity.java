package com.if4b.aplikasi_mesjid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private TextView tvNama,tvTentang;
    private ImageView ivFoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFoto = findViewById(R.id.iv_foto);
        tvNama = findViewById(R.id.tv_nama_masjid);
        tvTentang = findViewById(R.id.tv_tentang_masjid);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yTentang = terima.getStringExtra("xTentang");
        String yFoto = terima.getStringExtra("xFoto");

        getSupportActionBar().setTitle(yNama);

        tvNama.setText(yNama);
        tvTentang.setText(yTentang);
        Glide.with(DetailActivity.this)
                .load(yFoto)
                .into(ivFoto);
    }

}