package com.sigo.login_lau.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sigo.login_lau.Modelos.TodasCategorias;
import com.sigo.login_lau.R;

import java.util.List;

public class AdaptadorTodasCategorias extends RecyclerView.Adapter<AdaptadorTodasCategorias.CategoriaViewHolder> {

    Context context;
    List<TodasCategorias> todasCategoriasList;

    public AdaptadorTodasCategorias(Context context, List<TodasCategorias> todasCategoriasList) {
        this.context = context;
        this.todasCategoriasList = todasCategoriasList;
    }

    @NonNull
    @Override
    public CategoriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.categorias_items, parent, false);
        return new CategoriaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriaViewHolder holder, int position) {

        holder.categoriaImagenView.setImageResource(todasCategoriasList.get(position).getCategoria());
    }

    @Override
    public int getItemCount() {
        return todasCategoriasList.size();
    }

    public static class CategoriaViewHolder extends RecyclerView.ViewHolder{

        ImageView categoriaImagenView;

        public CategoriaViewHolder(@NonNull View itemView) {
            super(itemView);

            categoriaImagenView = itemView.findViewById(R.id.imgCateUtiles);
        }
    }
}
