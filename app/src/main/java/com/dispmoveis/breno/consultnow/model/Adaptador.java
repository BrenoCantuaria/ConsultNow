package com.dispmoveis.breno.consultnow.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dispmoveis.breno.consultnow.R;

import java.lang.ref.WeakReference;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    private List<Consulta> dataset;
    WeakReference<Context> mContextWeakReference;

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView nomeMedico, tipoConsulta, dispMedica, data;

        public MyViewHolder(View view, final Context context)
        {
            super(view);
            nomeMedico      = view.findViewById(R.id.id_nomeMedico);
            tipoConsulta    = view.findViewById(R.id.id_status);
            dispMedica      = view.findViewById(R.id.id_tipoConsulta);
            data            = view.findViewById(R.id.id_data);
        }
    }

    public Adaptador(List<Consulta> devedorsList, Context context)
    {
        this.dataset = devedorsList;
        this.mContextWeakReference = new WeakReference<Context>(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Context context = mContextWeakReference.get();

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_layout_auxiliar, parent, false);

        return new MyViewHolder(itemView, context);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        Context context = mContextWeakReference.get();

        if (context == null)
        {
            return;
        }

        Consulta itemConsulta = dataset.get(position);
        holder.nomeMedico.setText(itemConsulta.getNomeMedico());
        holder.tipoConsulta.setText(itemConsulta.getStatus());
        holder.dispMedica.setText(itemConsulta.getTipoConsulta());
        holder.data.setText(itemConsulta.getData());
    }

    @Override
    public int getItemCount()
    {
        return dataset.size();
    }
}