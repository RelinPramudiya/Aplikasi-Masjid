package com.if4b.aplikasi_mesjid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.GridViewHolder> {
    private ArrayList<ModelMasjid> dataMasjid;

    public AdapterGrid(ArrayList<ModelMasjid> dataMasjid) {
        this.dataMasjid = dataMasjid;
    }

    public interface OnItemClickCallBack {
        void onItemClicked(ModelMasjid data);
    }

    private OnItemClickCallBack callBack;

    public void setOnItemClickCallBack(OnItemClickCallBack callBack) {
        this.callBack = callBack;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item_masjid, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        ModelMasjid masjid = dataMasjid.get(position);


        Glide
                .with(holder.itemView.getContext())
                .load(masjid.getFoto())
                .into(holder.ivGridMasjid);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.onItemClicked(dataMasjid.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataMasjid.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView ivGridMasjid;


        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            ivGridMasjid = itemView.findViewById(R.id.iv_grid_masjid);

        }
    }
}
