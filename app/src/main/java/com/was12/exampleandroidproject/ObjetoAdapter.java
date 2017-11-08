package com.was12.exampleandroidproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by was12 on 08/11/2017.
 */

public class ObjetoAdapter extends RecyclerView.Adapter<ObjetoAdapter.TeamViewHolder> {
    ArrayList<Objeto> objetos;
    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_example,parent,false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        Objeto objeto= objetos.get(position);
        holder.foto.setImageResource(objeto.getFoto());
        holder.nombre.setText(objeto.getNombre());
    }

    public ObjetoAdapter(MainActivity mainActivity,ArrayList<Objeto> teams) {
        this.objetos = teams;

    }

    @Override
    public int getItemCount() {
        return objetos.size();
    }

    public class TeamViewHolder extends RecyclerView.ViewHolder {
        private ImageView foto;
        private TextView nombre;
        private final Context context;
        public TeamViewHolder(final View itemView) {
            super(itemView);
            foto=(ImageView) itemView.findViewById(R.id.escudo);
            context=itemView.getContext();
            nombre=(TextView) itemView.findViewById(R.id.textNameTeam);
            Button button=(Button) itemView.findViewById(R.id.buttonMore);
        }
    }
}
