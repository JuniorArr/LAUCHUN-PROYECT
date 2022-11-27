package com.sigo.login_lau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sigo.login_lau.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIngresarL.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
    ircatalogoActivity();
    }

    private void ircatalogoActivity(){
        Intent intentcatalogo = new Intent(this, CatalogoActivity.class);
        startActivity(intentcatalogo);
    }
}