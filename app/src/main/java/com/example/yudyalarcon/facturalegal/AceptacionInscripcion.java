package com.example.yudyalarcon.facturalegal;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AceptacionInscripcion extends AppCompatActivity {

    TextView nombre,cedula,nit,digitoVerificacion,email,granContribuyente,autoretenedor,tipoContribuyente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptacion_inscripcion);

        //
        nombre=(TextView)findViewById(R.id.nombre_textView);
        cedula=(TextView)findViewById(R.id.cedula_textView);
        nit=(TextView)findViewById(R.id.nit_textView);
        email=(TextView)findViewById(R.id.email_textView);
        granContribuyente=(TextView)findViewById(R.id.granContribuyente_textView);
        autoretenedor=(TextView)findViewById(R.id.autoretenedor_textView);
        tipoContribuyente=(TextView)findViewById(R.id.tipoContribuyente_textView);


        //
        Bundle bundle2 = this.getIntent().getExtras();

        //
        nombre.setText("" + bundle2.get("Nombre"));
        cedula.setText(""+bundle2.get("Cedula"));
        nit.setText(""+bundle2.get("Nit")+bundle2.get("DigitoVerificacion"));
        email.setText(""+bundle2.get("Email"));
        granContribuyente.setText(""+bundle2.get("Grancontribuyente"));
        autoretenedor.setText("" + bundle2.get("Autoretenedor"));
        tipoContribuyente.setText(""+bundle2.get("TipoContribuyente"));

    }


    //
    public void salir(View v){

        startActivity(new Intent(getBaseContext(),Presentacion.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
        finish();
    }

}
