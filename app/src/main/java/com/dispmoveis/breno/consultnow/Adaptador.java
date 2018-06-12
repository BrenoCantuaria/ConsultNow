package com.dispmoveis.breno.consultnow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder>
{
    private List <Consulta> dataset; // conjunto de dados
    private Context context;

    Adaptador(List<Consulta> dataset)
    {
        this.dataset = dataset;
    }

    @NonNull
    public Adaptador.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_tela_principal, parent, false);
        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(@NonNull Adaptador.MyViewHolder holder, int position)
    {
        Consulta itemConsulta = dataset.get(position);

        holder.tipoConsulta.setText(itemConsulta.getTipoConsulta());
        holder.dispMedica.setText(itemConsulta.getDispMedica());
        holder.dataHora.setText(itemConsulta.getDataHora());

        /*holder.itemView.setOnClickListener(

                Context context = v.getContext();

                Bundle bundle = new Bundle();
                bundle.putString("Consulta", itemConsulta.getTipoConsulta());
                bundle.putString("Nome Médico", itemConsulta.getDispMedica());
                bundle.putString("Data/Hora", itemConsulta.getDataHora());

                Intent intent = new Intent(context, AuxiliarActivity.class);
                intent.putExtra(bundle);
                context.startActivity(intent);
        );*/
    }

    public int getItemCount()
    {
        return dataset.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView tipoConsulta, dispMedica, dataHora;

        public MyViewHolder(View view)
        {
            super(view);

            tipoConsulta = view.findViewById(R.id.textoTipo);
            dispMedica = view.findViewById(R.id.textoDispoMedica);
            dataHora = view.findViewById(R.id.textoDataHora);
        }
    }
}
