package com.sigo.login_lau;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.sigo.login_lau.Modelos.ProductosEnCategoria;
import com.sigo.login_lau.databinding.ActivityDetalleProductosBinding;

public class DetalleProductosActivity extends AppCompatActivity implements View.OnClickListener{

    ActivityDetalleProductosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleProductosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getIntent().hasExtra("android")){
            ProductosEnCategoria objAndroid = getIntent().getParcelableExtra("android");

            binding.imgDetalle.setImageResource(objAndroid.getImagen());
            binding.txrMarcaDetalle.setText(objAndroid.getMarca());
            binding.txtNombreDetalle.setText(objAndroid.getNombre());
            binding.txtDescripcionDetalle.setText(objAndroid.getDescripcion());
            binding.txtPrecioDetalle.setText(objAndroid.getPrecio());
            binding.imgback.setOnClickListener(this);

        }
    }

    @Override
    public void onClick(View view) {
        Intent intentdetalle = new Intent(this, CategoriaListaActivity.class);
        startActivity(intentdetalle);
    }
}