package com.rdc.viewbindingcomponentechipsychipgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.rdc.viewbindingcomponentechipsychipgroup.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Avisame cuando se cambie un chip del chipgroup, (en que grupo esta esa chip, y la id del chip seleccionado)
        binding.chipGroup.setOnCheckedChangeListener((chipGround, id) ->{

            //Aqui guardamos la chip pulsada por el usuario
            Chip idSeleccionada = binding.chipGroup.findViewById(id);
            binding.chipGroup.removeView(idSeleccionada);
            CharSequence nombreChip = idSeleccionada.getText().toString();
            Toast.makeText(this, "Chip borrada: " + nombreChip, Toast.LENGTH_SHORT).show();

        });

    }
}