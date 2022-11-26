package com.sigo.login_lau.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sigo.login_lau.CatalogoActivity;
import com.sigo.login_lau.Modelos.ProductosMasVendidos;
import com.sigo.login_lau.R;

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

        View view = LayoutInflater.from(context).inflate(R.layout.productos_items, parent, false);
        return new ProductoMasVendidoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoMasVendidoViewHolder holder, int position) {

        holder.productoImageView.setImageResource(productosMasVendidosList.get(position).getProducto());
    }

    @Override
    public int getItemCount() {
        return productosMasVendidosList.size();
    }

    public static  class ProductoMasVendidoViewHolder extends RecyclerView.ViewHolder{

        ImageView productoImageView;

        public ProductoMasVendidoViewHolder(@NonNull View itemView) {
            super(itemView);

            productoImageView = itemView.findViewById(R.id.imgProducto1);
        }
    }
}
