package com.sigo.login_lau.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sigo.login_lau.CatalogoActivity;
import com.sigo.login_lau.CategoriaListaActivity;
import com.sigo.login_lau.Modelos.ProductosMasVendidos;
import com.sigo.login_lau.R;
import com.sigo.login_lau.databinding.CategoriasItemsBinding;
import com.sigo.login_lau.databinding.ProductosItemsBinding;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorProductosMasVendidos extends RecyclerView.Adapter<AdaptadorProductosMasVendidos.ProductoMasVendidoViewHolder> {

    Context context;
    List<ProductosMasVendidos> productosMasVendidosList;

    public AdaptadorProductosMasVendidos(Context context, List<ProductosMasVendidos> productosMasVendidosList){
        this.context = context;
        this.productosMasVendidosList = productosMasVendidosList;
    }

    @NonNull
    @Override
    public ProductoMasVendidoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new AdaptadorProductosMasVendidos.ProductoMasVendidoViewHolder(ProductosItemsBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoMasVendidoViewHolder holder, int position) {

        holder.binding.imgProducto1.setImageResource(productosMasVendidosList.get(position).getProducto());
        holder.binding.contenedorOfertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOfertas = new Intent(context, CategoriaListaActivity.class);
                context.startActivity(intentOfertas);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productosMasVendidosList.size();
    }

    public static  class ProductoMasVendidoViewHolder extends RecyclerView.ViewHolder{

        ProductosItemsBinding binding;

        public ProductoMasVendidoViewHolder(ProductosItemsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }
    }
}
