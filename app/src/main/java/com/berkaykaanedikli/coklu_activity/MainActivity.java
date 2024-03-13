package com.berkaykaanedikli.coklu_activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.berkaykaanedikli.coklu_activity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void digerActivity(View view) {
        String adSoyad = binding.eTxtAd.getText().toString();
        String ogrNumara = binding.eTxtNumara.getText().toString();
        Intent intent = new Intent(MainActivity.this, Bilgi_Activity.class);
        intent.putExtra("adiSoyadiKey", adSoyad);
        intent.putExtra("ogrenciNumarasıKey", ogrNumara);
        startActivity(intent);
    }
}