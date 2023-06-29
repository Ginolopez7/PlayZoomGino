package com.gino.Playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gino.Playzoom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //private Button btnGetStarted;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetStarted.setOnClickListener(v -> {
            Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
        });
        binding.txtMoviewPhrase.setText("Mira tu pelicula\nfavorita");

    //    btnGetStarted = findViewById(R.id.btn_get_started);
    //    btnGetStarted.setOnClickListener(v -> {
    //        Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
    //    });
    }
}