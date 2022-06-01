package com.if4b.aplikasi_mesjid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder>{
    private ArrayList<ModelMasjid> dataMasjid;

    public AdapterCard(ArrayList<ModelMasjid> dataMasjid) {
        this.dataMasjid = dataMasjid;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_masjid, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataMasjid.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView ivMasjid;
        TextView tvNamaMasjid, tvTentangMasjid;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMasjid = itemView.findViewById(R.id.iv_masjid);
            tvNamaMasjid = itemView.findViewById(R.id.tv_nama_masjid);
            tvTentangMasjid = itemView.findViewById(R.id.tv_tentang_masjid);
        }
    }

}
