package com.practico3.practico3.ui.listar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.practico3.practico3.Entidades.Nota;
import com.practico3.practico3.MainActivity;
import com.practico3.practico3.databinding.FragmentListarBinding;

import java.util.Collections;
import java.util.List;

public class ListarFragment extends Fragment {

    private FragmentListarBinding binding;
    //private ListarViewModel mv;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentListarBinding.inflate(inflater, container, false);
        //mv = new ListarViewModel(getActivity().getApplication());
        //Obtengo el RecyclerView con su respectivo ID usando el Binding.
        //RecyclerView recy = binding.idLista;
        //El Grid es la forma en la que yo quiero mostrar los elementos.
        //GridLayoutManager glm = new GridLayoutManager(requireContext(), 1, GridLayoutManager.HORIZONTAL, false);
        /*mv.getListaNotas().observe(getViewLifecycleOwner(), new Observer<List<Nota>>() {
                    @Override
                    public void onChanged(List<Nota> notas) {
                        //Le seteo la lista al adapter
                        NotasAdapter notasAdapter = new NotasAdapter(notas, getContext());
                        recy.setAdapter(notasAdapter);
                        recy.setLayoutManager(glm);
                    }
        });*/

        View root = binding.getRoot();

        //Configurar el RecyclerView
        binding.idLista.setLayoutManager(new LinearLayoutManager(getContext()));

        //Crear el adaptador y pasar la lista estatic de MainActivity
        NotasAdapter notasAdapter = new NotasAdapter(MainActivity.listaNotas, getContext());
        binding.idLista.setAdapter(notasAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
