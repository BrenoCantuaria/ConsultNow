package com.dispmoveis.breno.consultnow;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterCadastrarConsulta extends RecyclerView.Adapter<AdapterCadastrarConsulta.TheViewHolder>
{
    private List<CadastroConsulta> presenceList;

    public static class TheViewHolder extends RecyclerView.ViewHolder
    {
        public TextView tipoConsulta, dispMedica, dataHora;

        public TheViewHolder(View view)
        {
            super(view);
            tipoConsulta = view.findViewById(R.id.textoTipo);
            dispMedica = view.findViewById(R.id.textoDispoMedica);
            dataHora = view.findViewById(R.id.textoDataHora);
        }

       /* public AdapterCadastrarConsulta(List<CadastroConsulta> presenceList)
        {
           this.presenceList = presenceList;
        }*/
    }

    @Override
    public TheViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_layout_principal_filho, parent, false);

        return new TheViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TheViewHolder holder, int position)
    {
        CadastroConsulta cc = presenceList.get(position);

        holder.tipoConsulta.setText(cc.tipoConsulta);
        holder.dispMedica.setText(cc.medico);
        holder.dataHora.setText(cc.horario);
    }

    @Override
    public int getItemCount()
    {
        return presenceList.size();
    }
}
