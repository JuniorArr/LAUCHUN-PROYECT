package com.sigo.login_lau;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sigo.login_lau.Adaptadores.AdaptadorProductosMasVendidos;
import com.sigo.login_lau.Adaptadores.AdaptadorTodasCategorias;
import com.sigo.login_lau.Modelos.ProductosMasVendidos;
import com.sigo.login_lau.Modelos.TodasCategorias;
import com.sigo.login_lau.databinding.ActivityCatalogoBinding;
import com.sigo.login_lau.databinding.CategoriasItemsBinding;

import java.util.ArrayList;
import java.util.List;

public class CatalogoActivity extends AppCompatActivity {

    RecyclerView CategoriasRecyclerView, ProductosRecyclerView;

    AdaptadorTodasCategorias adaptadorTodasCategorias;
    List<TodasCategorias> todasCategoriasList;

    AdaptadorProductosMasVendidos adaptadorProductosMasVendidos;
    List<ProductosMasVendidos> productosMasVendidosList;

    ActivityCatalogoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCatalogoBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_catalogo);
        setContentView(binding.getRoot());


        //CategoriasRecyclerView = findViewById(R.id.rvCategorias);
        //ProductosRecyclerView = findViewById(R.id.rvProductosMV);

        //ITEMS DE CATEGORIA
        todasCategoriasList = new ArrayList<>();
        todasCategoriasList.add(new TodasCategorias(1, R.drawable.categutiles));
        todasCategoriasList.add(new TodasCategorias(2, R.drawable.categarte));
        todasCategoriasList.add(new TodasCategorias(3, R.drawable.categpapeleria));
        todasCategoriasList.add(new TodasCategorias(4, R.drawable.categaccesorios));
        todasCategoriasList.add(new TodasCategorias(5, R.drawable.categjuguetes));
        todasCategoriasList.add(new TodasCategorias(6, R.drawable.categoficina));

        //ITEMS DE PRODUCTOS
        productosMasVendidosList = new ArrayList<>();
        productosMasVendidosList.add(new ProductosMasVendidos(1, R.drawable.productomv_1));
        productosMasVendidosList.add(new ProductosMasVendidos(2, R.drawable.productomv_2));
        productosMasVendidosList.add(new ProductosMasVendidos(3, R.drawable.productomv_3));
        productosMasVendidosList.add(new ProductosMasVendidos(4, R.drawable.productomv_4));

        setTodasCategoriasRecycler(todasCategoriasList);
        setProductoMVRecycler(productosMasVendidosList);

    }

    //CATEGORIA
    private void setTodasCategoriasRecycler(List<TodasCategorias> dataListCateg) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        binding.rvCategorias.setLayoutManager(layoutManager);
        adaptadorTodasCategorias = new AdaptadorTodasCategorias(this,dataListCateg);
        binding.rvCategorias.setAdapter(adaptadorTodasCategorias);
    }

    //PRODUCTOS
    private void setProductoMVRecycler(List<ProductosMasVendidos> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvProductosMV.setLayoutManager(layoutManager);
        adaptadorProductosMasVendidos = new AdaptadorProductosMasVendidos(this,dataList);
        binding.rvProductosMV.setAdapter(adaptadorProductosMasVendidos);
    }
}