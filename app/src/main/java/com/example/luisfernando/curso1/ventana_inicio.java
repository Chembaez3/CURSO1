package com.example.luisfernando.curso1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ventana_inicio extends AppCompatActivity   {
    Spinner spinner_modelo;
    TextView precio;
    public static float precioAccesorios;
    public static TextView texto_accesorios;
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
    public static void  cambiarAccesorios(String listaAccesorios,float precioAccesorios){
        texto_accesorios.setText(listaAccesorios);
        ventana_inicio.precioAccesorios= precioAccesorios;

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_inicio);
        spinner_modelo = (Spinner) findViewById(R.id.spinner_modelo);
        precio = (TextView) findViewById(R.id.precio);
        texto_accesorios = (TextView) findViewById(R.id.texto_accesorios);


        List<String> categories = new ArrayList<String>();
        categories.add("Sense");
        categories.add("Advanced");
        categories.add("Navi");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_modelo.setAdapter(dataAdapter);




    }
       /* Button BOTONAZUL= (Button) findViewById(R.id.BOTONAZUL);
        Button BOTONROJO= (Button) findViewById(R.id.BOTONROJO);
        Button BOTONVERDE= (Button) findViewById(R.id.BOTONVERDE);*/
        // esto nos sirve para mandar a llamar el codigo de la ventana con el codigo fuente con el findviewbiyd, aqui solo
        //declaramos los objetos de los botones con la clase button,


 public void Cotizar (View vista){

        int seleccion= spinner_modelo.getSelectedItemPosition();
        float moneda= 0.0f;

        switch(seleccion){
            case 0:
                moneda= 159800.0f;
                break;
            case 1:
                moneda= 177200.0f;
                break;
            case 2:
                moneda= 209500.0f;
                break;

            default:
                break;
        }

     moneda= moneda+precioAccesorios;
        precio.setText(currency.format(moneda));

    }


    public void cambiarColorAzul  (View vista){
        ImageView march= (ImageView) findViewById(R.id.MARCHCOLOR);
        march.setImageResource(R.drawable.march_azul);

    }

    public void cambiarColorRojo  (View vista){
        ImageView march= (ImageView) findViewById(R.id.MARCHCOLOR);
        march.setImageResource(R.drawable.march_rojo);

    }

    public void cambiarColorVerde  (View vista){
        ImageView march= (ImageView) findViewById(R.id.MARCHCOLOR);
        march.setImageResource(R.drawable.march_verde);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ventana_inicio, menu);
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

    public void iconoAccesorios (View Vista){
        Intent intent =new Intent (this, ventana_accesorios.class);
        startActivity (intent);




    }



}
