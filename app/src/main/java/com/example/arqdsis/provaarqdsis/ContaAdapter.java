package com.example.arqdsis.provaarqdsis;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @autor: Victor Branco RA:201516938
 */

public class ContaAdapter extends BaseAdapter{

    ArrayList<String> contas;
    Activity context;
    /**
     * @autor: Victor Branco RA:201516938
     */
    public ContaAdapter(Activity context, int de, int ate){
        this.context = context;
        contas = new ArrayList<String>();

        for(int i = 1; i <= ate; i ++){
            contas.add(de + " X " + i + " = " + (de*i));
        }
    }
    /**
     * @autor: Victor Branco RA:201516938
     */
    public int getCount() {
        return contas.size();
    }
    /**
     * @autor: Victor Branco RA:201516938
     */
    @Override
    public Object getItem(int i) {
        return contas.get(i);
    }
    /**
     * @autor: Victor Branco RA:201516938
     */
    @Override
    public long getItemId(int i) {
        return 0;
    }
    /**
     * @autor: Victor Branco RA:201516938
     */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.linha_conta, viewGroup, false);
            TextView nomeCliente = (TextView)view.findViewById(R.id.linha_texto);
            nomeCliente.setText(contas.get(i));
        }
        return view;
    }
}
