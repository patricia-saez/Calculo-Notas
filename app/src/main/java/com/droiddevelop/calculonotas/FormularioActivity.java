package com.droiddevelop.calculonotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class FormularioActivity extends AppCompatActivity {
// crear variables
    private String dato_nombre;
    private String dato_documento;
    private String dato_email;
    private Boolean dato_pregrado;

    private EditText nombre;
    private EditText documento;
    private EditText email;
    private CheckBox pregrado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

// crear objetos
        Button btn_Registrarse = (Button)findViewById(R.id.boton_registro);

        nombre = (EditText)findViewById(R.id.nombre);
        documento = (EditText)findViewById(R.id.documento);
        email = (EditText)findViewById(R.id.email);
        pregrado = (CheckBox) findViewById(R.id.selector);



        //Especificacion del click del boton consultar
        btn_Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dato_nombre = nombre.getText().toString();
                dato_documento = documento.getText().toString();
                dato_email = email.getText().toString();

                if(pregrado.isChecked()){

                    dato_pregrado = true;
                }
                else{

                    dato_pregrado = false;
                }

                //Llamado a otra actividad
                //
                Intent Confirmacion = new Intent(FormularioActivity.this,Confirmacion_datosActivity.class);

                Confirmacion.putExtra("nombre",dato_nombre);
                Confirmacion.putExtra("documento",dato_documento);
                Confirmacion.putExtra("email",dato_email);
                Confirmacion.putExtra("pregrado",dato_pregrado);

                startActivity(Confirmacion);
               }
        });

    }
}

