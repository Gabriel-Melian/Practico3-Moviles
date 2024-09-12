package com.practico3.practico3.ui.listar;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.practico3.practico3.Entidades.Nota;

import java.util.ArrayList;
import java.util.List;

public class ListarViewModel extends AndroidViewModel {

    private MutableLiveData<List<Nota>> listaNotas;
    //private List<Nota>misNotas = new ArrayList<>();

    public ListarViewModel(@NonNull Application application) {
        super(application);

        // Inicializa el MutableLiveData antes de setear valores
        listaNotas = new MutableLiveData<>();

        //misNotas.add(new Nota("Nota1"));
        //misNotas.add(new Nota("Nota2"));
        //listaNotas.setValue(misNotas);
    }

    public MutableLiveData<List<Nota>> getListaNotas() {
        if(listaNotas == null) {//Inicializar el MutableLiveData
            listaNotas = new MutableLiveData<>();
        }
        return listaNotas;
    }

    public void cargarNotas(Nota nota) {
        if (nota.getTitulo().equalsIgnoreCase("")) {
            Toast.makeText(getApplication(), "No se puede dejar el campo vacio", Toast.LENGTH_SHORT).show();
        } else {
            List<Nota> notas = new ArrayList<>();
            notas.add(nota);
            listaNotas.setValue(notas);
            Toast.makeText(getApplication(), "Nota guardada", Toast.LENGTH_SHORT).show();
        }
    }
}
