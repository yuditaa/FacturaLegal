package com.example.yudyalarcon.facturalegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Inscripcion extends AppCompatActivity {

    EditText nombre,cedula,nit,digitoVerificacion,email;
    CheckBox granContribuyente,autoretenedor;
    RadioGroup TipoContribuyente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscipcion);

        nombre = (EditText)findViewById(R.id.nombre_editText);
        cedula=(EditText)findViewById(R.id.cedula_editText);
        nit=(EditText)findViewById(R.id.nit_editText);
        digitoVerificacion=(EditText)findViewById(R.id.digitoVerificacion_editText);
        email=(EditText)findViewById(R.id.email_editText);
        granContribuyente=(CheckBox)findViewById(R.id.granContribuyente_checkBox);
        autoretenedor=(CheckBox)findViewById(R.id.autoretenedor_checkBox);
        TipoContribuyente=(RadioGroup)findViewById(R.id.TipoContribuyente_radioGroup);
    }

    public void pasarAv3(View v){

        //Resolver tipo contribuyente
        String tipoContribuyente="No reporta tipo de contribuyente";

        if(TipoContribuyente.getCheckedRadioButtonId()==R.id.personaNatural_radioButton){

            tipoContribuyente="Persona Natural";

        }else if (TipoContribuyente.getCheckedRadioButtonId()==R.id.personaJuridica_radioButton){

            tipoContribuyente="Persona Juridica";

        }

        //Resolver Si es gran contribuyente
        String siGranContribuyente="";
        if (granContribuyente.isChecked()){

            siGranContribuyente="Es GranContribuyente";
        }else{
            siGranContribuyente="No es Grancontribuyente";
        }

        //Resolver si es autoretenedor
        String siAutoretenedor="";
        if(autoretenedor.isChecked()){

            siAutoretenedor="Es Autoretenedor";

        }else {
            siAutoretenedor="No es Autoretenedor";
        }


        //1
        Intent intent2 = new Intent(Inscripcion.this,AceptacionInscripcion.class);

        //2
        Bundle bundle = new Bundle();
        bundle.putString("Nombre",nombre.getText().toString());
        bundle.putString("Cedula",cedula.getText().toString());
        bundle.putString("Nit",nit.getText().toString());
        bundle.putString("DigitoVerificacion",digitoVerificacion.getText().toString());
        bundle.putString("Email",email.getText().toString());
        bundle.putString("Grancontribuyente",siGranContribuyente);
        bundle.putString("Autoretenedor",siAutoretenedor);
        bundle.putString("TipoContribuyente",tipoContribuyente);


        //3
        intent2.putExtras(bundle);

        //4
        startActivity(intent2);

    }
}
