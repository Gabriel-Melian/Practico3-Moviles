package com.practico3.practico3.ui.cargar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.practico3.practico3.MainActivity;
import com.practico3.practico3.R;
import com.practico3.practico3.databinding.FragmentCargarBinding;

public class CargarFragment extends Fragment {
    //NO PUEDE HABER LOGICA EN LOS FRAGMENTS, ES COMO UN ACTIVITY.
    //private CargarViewModel mv;
    private FragmentCargarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //mv = new ViewModelProvider(this).get(CargarViewModel.class);
        binding = FragmentCargarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnGuardar.setOnClickListener(v -> {
            //.trim() Elimina los espacios en blancores antes y despues de la cadena
            String nota = binding.etNota.getText().toString().trim();

            if (nota.isEmpty()) {
                //Si esta vacia, muestro mensaje
                binding.etNota.setError("La nota no puede estar vacía");
            } else {
                //Sino, agrego la nota a la lista del MainActivity
                MainActivity.listaNotas.add(nota);
                //Limpio el campo despues de guardar
                binding.etNota.setText("");
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
