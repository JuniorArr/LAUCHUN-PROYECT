package com.sigo.login_lau.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sigo.login_lau.CategoriaListaActivity;
import com.sigo.login_lau.Modelos.TodasCategorias;
import com.sigo.login_lau.R;
import com.sigo.login_lau.databinding.CategoriasItemsBinding;

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

        return new CategoriaViewHolder(CategoriasItemsBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriaViewHolder holder, int position) {

        holder.binding.imgCateUtiles.setImageResource(todasCategoriasList.get(position).getCategoria());
        holder.binding.contenedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcategoria = new Intent(context, CategoriaListaActivity.class);
                context.startActivity(intentcategoria);
            }
        });
    }

    @Override
    public int getItemCount() {
        return todasCategoriasList.size();
    }

    public static class CategoriaViewHolder extends RecyclerView.ViewHolder{

        CategoriasItemsBinding binding;

        public CategoriaViewHolder(CategoriasItemsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
