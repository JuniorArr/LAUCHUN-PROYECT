package com.sigo.login_lau;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sigo.login_lau.Modelos.ProductosEnCategoria;
import com.sigo.login_lau.databinding.ActivityDetalleProductosBinding;

public class DetalleProductosActivity extends AppCompatActivity {

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
        }
    }
}