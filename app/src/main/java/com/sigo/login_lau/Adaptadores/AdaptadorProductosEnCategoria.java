package com.sigo.login_lau.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sigo.login_lau.DetalleProductosActivity;
import com.sigo.login_lau.Modelos.ProductosEnCategoria;
import com.sigo.login_lau.databinding.ProductosencategoriaItemsBinding;

import java.util.List;

public class AdaptadorProductosEnCategoria extends RecyclerView.Adapter<AdaptadorProductosEnCategoria.ViewHolder> {
    
    private List<ProductosEnCategoria> lista;
    private Context context;

    public AdaptadorProductosEnCategoria(List<ProductosEnCategoria> lista, Context context){
        this.lista = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(ProductosencategoriaItemsBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final ProductosEnCategoria itemAndroid = lista.get(position);

        holder.binding.imgGota.setImageResource(itemAndroid.getImagen());
        holder.binding.txtMarca.setText(itemAndroid.getMarca());
        holder.binding.txtNombre.setText(itemAndroid.getNombre());
        holder.binding.txtPrecio.setText(itemAndroid.getPrecio());

        holder.binding.cvContenedor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentAndroidDetalle = new Intent(context, DetalleProductosActivity.class);

                intentAndroidDetalle.putExtra("android", itemAndroid);
                context.startActivity(intentAndroidDetalle);

            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ProductosencategoriaItemsBinding binding;
        public ViewHolder(ProductosencategoriaItemsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
