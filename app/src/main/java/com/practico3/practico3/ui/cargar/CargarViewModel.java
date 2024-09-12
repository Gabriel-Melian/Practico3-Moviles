package com.practico3.practico3.ui.cargar;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.practico3.practico3.databinding.FragmentCargarBinding;

public class CargarViewModel extends AndroidViewModel {

    //private FragmentCargarBinding binding;
    //private CargarViewModel mv;

    public CargarViewModel(@NonNull Application application) {
        super(application);
    }
    //public void
    public boolean cargarNota(String notaTexto) {//(String notaTexto, View v)
        if (notaTexto.isEmpty()) {
            //Por si esta vacio
            Toast.makeText(getApplication(), "La nota no puede estar vacía", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            //Si no esta vacia, crea un Bundle y la pasa al ListarFragment
            //Bundle bundle = new Bundle();
            //bundle.putString("nuevaNota", notaTexto);

            //Navega al Fragment de Listar y pasa el Bundle
            //Navigation.findNavController(view).navigate(R.id.action_nav_cargar_to_nav_listar, bundle);

            Toast.makeText(getApplication(), "Nota agregada", Toast.LENGTH_SHORT).show();
            return true;
        }
    }

}
