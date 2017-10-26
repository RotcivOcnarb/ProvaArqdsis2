package com.example.arqdsis.provaarqdsis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
/**
 * @autor: Victor Branco RA:201516938
 */
public class ListaActivity extends Activity {
    /**
     * @autor: Victor Branco RA:201516938
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        Intent intent = getIntent();
        String de = intent.getStringExtra("DE");
        String ate = intent.getStringExtra("ATE");

        ContaAdapter adapter = new ContaAdapter(this, Integer.parseInt(de), Integer.parseInt(ate));
        ListView listView = findViewById(R.id.lista_resultados);
        listView.setAdapter(adapter);
    }
}
