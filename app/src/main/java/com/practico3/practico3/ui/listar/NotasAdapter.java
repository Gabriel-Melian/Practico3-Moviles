package com.practico3.practico3.ui.listar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.practico3.practico3.Entidades.Nota;
import com.practico3.practico3.R;

import java.util.ArrayList;
import java.util.List;
//El ViewHolder sirve para pasarle los datos a la vista
//El RecyclerView es un componene de la vista. Ej editText
//El RecyclerView va en el fragment.xml que lo quieras mostrar (Debe ser ConstraintLayout)
//Colocar id al recyclerView (idLista)
public class NotasAdapter extends RecyclerView.Adapter<NotasAdapter.ViewHolder> {
    //List<Nota>
    private ArrayList<String> listaNotas;
    private Context contexto;
                        //List<Nota>
    public NotasAdapter(ArrayList<String> listaNotas, Context contexto) {
        this.listaNotas = listaNotas;
        this.contexto = contexto;
    }
    //List<Nota>
    public ArrayList<String> getListaNotas() {
        return listaNotas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //1)Debo crear en la carpeta layout el item_nota de tipo cardview.
        //2)En el archivo item_nota.xml en la parte de Layouts colocar el ConstraintLayout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nota, parent, false);
        return new ViewHolder(view);
    }

    @Override//Esto llena el metodo con informacion
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //El holder es como un binding pero del item
        //Nota nota = listaNotas.get(position);
        //holder.textViewNota.setText(nota.getTitulo());
        String nota = String.valueOf(listaNotas.get(position));
        holder.textViewNota.setText(nota);
    }

    @Override
    public int getItemCount() {
        return listaNotas.size();
    }

    //Clase interna para acceder a las propiedades del item. Al editText, TextView, ImageView.
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewNota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //El id del textView del item_nota
            textViewNota = itemView.findViewById(R.id.tvIdCard);
        }
    }
}
