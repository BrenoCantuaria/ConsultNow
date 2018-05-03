package com.dispmoveis.breno.consultnow;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.List;

public class AdapterCadastrarConsulta extends RecyclerView.Adapter<AdapterCadastrarConsulta.ItensViewHolder>
{
    private List<CadastroConsulta> listaConsulta;
    WeakReference<Context> mContextWeakReference;

    @Override
    public ItensViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Context contexto = mContextWeakReference.get();

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_tela_principal, parent, false);

        return new ItensViewHolder(itemView, contexto);
    }

    @Override
    public void onBindViewHolder(ItensViewHolder holder, int position)
    {
        Context context = mContextWeakReference.get();

        if(context == null)
        {
            return;
        }

        CadastroConsulta cadastro = listaConsulta.get(position);
        holder.nomeConsulta.setText(cadastro.getNome());
    }

    @Override
    public int getItemCount()
    {
        return listaConsulta.size();
    }

    public class ItensViewHolder extends RecyclerView.ViewHolder
    {
        public TextView nomeConsulta;

        public ItensViewHolder(View view, Context contexto)
        {
            super(view);

            nomeConsulta = (TextView) view.findViewById(R.id.recyclerView);
        }
    }

    public AdapterCadastrarConsulta(List<CadastroConsulta> listaConsulta, Context contexto)
    {
        this.listaConsulta = listaConsulta;
        this.mContextWeakReference = new WeakReference<Context>(contexto);
    }
}
