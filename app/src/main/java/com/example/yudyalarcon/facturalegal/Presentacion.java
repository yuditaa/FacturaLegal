package com.example.yudyalarcon.facturalegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Presentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
    }

    public void pasarAv2(View v){

        Intent intent = new Intent(Presentacion.this,Inscripcion.class);
        startActivity(intent);

    }

}
