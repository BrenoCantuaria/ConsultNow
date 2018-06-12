package com.dispmoveis.breno.consultnow;

import android.widget.LinearLayout;
import android.content.Context;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {

    private List<Consulta> dataset;
    public LinearLayout ll;
    WeakReference<Context> mContextWeakReference;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tipoConsulta, dispMedica, dataHora;

        public MyViewHolder(View view, final Context context) {
            super(view);
            tipoConsulta = view.findViewById(R.id.id_dispMedica);
            dispMedica = view.findViewById(R.id.id_tipoConsulta);
            dataHora = view.findViewById(R.id.id_dataHora);
            //ll = (LinearLayout) itemView.findViewById(R.id.ll_layout);
        }
    }


    public Adaptador(List<Consulta> devedorsList, Context context) {
        this.dataset = devedorsList;
        this.mContextWeakReference = new WeakReference<Context>(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = mContextWeakReference.get();

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_layout_auxiliar, parent, false);

        return new MyViewHolder(itemView, context);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Context context = mContextWeakReference.get();

        if (context == null) {
            return;
        }

        Consulta itemConsulta = dataset.get(position);
        holder.tipoConsulta.setText(itemConsulta.getDispMedica());
        holder.dispMedica.setText(itemConsulta.getTipoConsulta());
        holder.dataHora.setText(itemConsulta.getDataHora());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}