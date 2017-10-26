package com.example.arqdsis.provaarqdsis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/**
 * @autor: Victor Branco RA:201516938
 */
public class MainActivity extends Activity {
    /**
     * @autor: Victor Branco RA:201516938
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * @autor: Victor Branco RA:201516938
     */
    public void calcular(View view){
        Intent intent = new Intent(this, ListaActivity.class);

        EditText de_text = findViewById(R.id.de_text);
        EditText ate_text = findViewById(R.id.ate_text);

        String de = de_text.getText().toString();
        String ate = ate_text.getText().toString();
        intent.putExtra("DE", de);
        intent.putExtra("ATE", ate);
        startActivity(intent);
    }
}
