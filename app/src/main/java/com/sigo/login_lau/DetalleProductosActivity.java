package com.sigo.login_lau;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sigo.login_lau.Modelos.ProductosEnCategoria;
import com.sigo.login_lau.databinding.ActivityDetalleProductosBinding;

public class DetalleProductosActivity extends AppCompatActivity implements View.OnClickListener{
    
    private TextView txtCantidadContador;
    private ImageView imgBotonMenos, imgBotonMas;
    int CantidadContador = 1;

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
            binding.imgRegresarDetalle.setOnClickListener(this);

        }
        
        initView();
        getBundle();
    }

    private void getBundle() {
        txtCantidadContador.setText(String.valueOf(CantidadContador));

        imgBotonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CantidadContador > 0){
                    CantidadContador = CantidadContador - 1;
                }

                txtCantidadContador.setText(String.valueOf(CantidadContador));
            }
        });

        imgBotonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CantidadContador = CantidadContador + 1;
                txtCantidadContador.setText(String.valueOf(CantidadContador));
            }
        });
    }

    private void initView() {
        txtCantidadContador = findViewById(R.id.txtCantidadContador);
        imgBotonMenos = findViewById(R.id.imgBotonMenos);
        imgBotonMas = findViewById(R.id.imgBotonMas);
    }

    @Override
    public void onClick(View view) {
        Intent intentdetalle = new Intent(this, CategoriaListaActivity.class);
        startActivity(intentdetalle);
    }
}