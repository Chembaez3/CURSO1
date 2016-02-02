package com.example.luisfernando.curso1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class ventana_accesorios extends AppCompatActivity {
 CheckBox bici;
    CheckBox antifaz;
    CheckBox techo;
    CheckBox estereo;
    CheckBox escape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_accesorios);

    techo= (CheckBox) findViewById (R.id.techo);
        bici= (CheckBox) findViewById (R.id.bici);
         antifaz= (CheckBox) findViewById (R.id.antifaz);
        escape= (CheckBox) findViewById (R.id.escape);
        estereo= (CheckBox) findViewById (R.id.estereo);


    }

    public void actualizadorLista  (View Vista) {
        String lista = "";
        float suma =0.0f;


        if (bici.isChecked()) {
            lista = lista+"-Rack de Bicicleta";
            suma=suma + 3858;

        }
        if (antifaz.isChecked()){
            lista= lista + "-Antifaz";
            suma=suma + 1178;

        }

        if (techo.isChecked()){
            lista= lista + "-Barras en Toldo";
            suma=suma + 5065;

        }
        if (estereo.isChecked()){
            lista= lista + "-Sistema de audio";
            suma=suma + 4264;

        }
        if (escape.isChecked()){
            lista= lista +"-Escape Cromado";
            suma=suma + 436;


        }

        ventana_inicio.cambiarAccesorios(lista,suma);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ventana_accesorios, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
