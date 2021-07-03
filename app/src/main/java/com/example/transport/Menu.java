package com.example.transport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void cambiar_ruta(View view){
        Intent obj = new Intent(this,Rutas.class);
        this.startActivity(obj);
    }

    public void cambiar_tarifa(View view){
        Intent obj = new Intent(this,tarifa.class);
        this.startActivity(obj);
    }

    public void cambiar_horario(View view){
        Intent obj = new Intent(this,Horarios.class);
        this.startActivity(obj);
    }

    public void cambiar_paradas(View view){
        Intent obj = new Intent(this,Horarios.class);
        this.startActivity(obj);
    }
}