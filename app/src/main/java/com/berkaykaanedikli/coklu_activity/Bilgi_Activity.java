package com.berkaykaanedikli.coklu_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.berkaykaanedikli.coklu_activity.databinding.ActivityBilgiBinding;
import com.berkaykaanedikli.coklu_activity.databinding.ActivityMainBinding;

public class Bilgi_Activity extends AppCompatActivity {
    private ActivityBilgiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBilgiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        String bilAdSoyad = intent.getStringExtra("adiSoyadiKey");
        String bilOgrNumara = intent.getStringExtra("ogrenciNumarasıKey");
        binding.adTextView.setText(bilAdSoyad);
        binding.numTextView.setText(bilOgrNumara);

    }
}