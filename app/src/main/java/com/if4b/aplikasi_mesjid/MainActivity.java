package com.if4b.aplikasi_mesjid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMasjid;
    private ArrayList<ModelMasjid> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMasjid = findViewById(R.id.rv_Masjid);
        rvMasjid.setHasFixedSize(true);

        data.addAll(DataMasjid.ambilDataMasjid());
        tampilDataCard();
    }

    private void tampilDataCard(){
        rvMasjid.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard colokanCard = new AdapterCard(data);
        rvMasjid.setAdapter(colokanCard);
    }
}