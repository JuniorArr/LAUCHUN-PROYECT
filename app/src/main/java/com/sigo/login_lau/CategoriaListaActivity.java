package com.sigo.login_lau;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.sigo.login_lau.Adaptadores.AdaptadorProductosEnCategoria;
import com.sigo.login_lau.Modelos.ProductosEnCategoria;
import com.sigo.login_lau.databinding.ActivityCategoriaListaBinding;

import java.util.ArrayList;

public class CategoriaListaActivity extends AppCompatActivity {

    private ActivityCategoriaListaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoriaListaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<ProductosEnCategoria> lista = new ArrayList<>();

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_1,
                "LIMPIATIPOS - STICKY TAC","Colores surtidos, removible y fácil de manipular.", "ARTESCO", "2.00"));

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_2,
                "TIZA DE COLORES CAJA X50","Tizas organicas, multiples colores, no deja residuos y de borrado facil.", "ARTESCO", "8.20"));

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_3,
                "BORRADOR/TAJADOR RALLY X1","Borrador/Tajador, gran capacidad de borrado, mínimos residuos, no tóxico.", "ARTESCO", "3.80"));

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_4,
                "MASKING 3X40 YDS PEGAFAN","Cinta masking tape multiuso, para multiples superficies, no deja residuos.", "PEGAFAN", "13.90"));

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_5,
                "MASKING 2X20 48MM YDS VERDE","Cinta masking tape multiuso de color verde, no deja residuos.", "PEGAFAN", "5.40"));

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_6,
                "CINTA SCOTCH 550 TRANSPARENTE","Cinta de uso general, no ensucia, no se seca, ni se torna amarillenta.", "3M", "17.50"));

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_7,
                "COMPAS STUDY PORTA-MINAS CAJA","Cabeza ergonómica y patas de metal, estuche con regla integrada.", "MAPED", "5.70"));

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_8,
                "MASKING 3/4 X11 YDS SHURT NEON","Cinta Masking multiuso de 3/4 x11 YDS Shurt, 5 colores neón, sin residuos.", "SHURTAPE", "9.90"));

        lista.add(new ProductosEnCategoria(lista.size()+1, R.drawable.utiles_imagen_9,
                "RESALTADOR 48 ROSADO PASTEL","Punta biselada ideal para papel convencional, cobertura uniforme.", "FABER CASTELL", "3.20"));

        binding.rvAndroid.setLayoutManager(new LinearLayoutManager(CategoriaListaActivity.this));

        AdaptadorProductosEnCategoria adapter = new AdaptadorProductosEnCategoria(lista, CategoriaListaActivity.this);

        binding.rvAndroid.setAdapter(adapter);
    }
}