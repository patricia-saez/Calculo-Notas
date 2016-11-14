package com.droiddevelop.calculonotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmacion_datosActivity extends AppCompatActivity {

    private TextView dato_nombre;
    private TextView dato_documento;
    private TextView dato_email;
    private TextView dato_pregrado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);

        //ahora asignar a esas variables los controles


        dato_nombre = (TextView)findViewById(R.id.nombre_confirm);
        dato_documento = (TextView)findViewById(R.id.doc_confirm);
        dato_email = (TextView)findViewById(R.id.email_confirm);
        dato_pregrado = (TextView)findViewById(R.id.pregrado_confirm);
        Button btn_confirmar = (Button)findViewById(R.id.boton_confirm);


        String nombreregistrado;
        String documentoregistrado;
        String emailregistrado;
        Boolean pregradoregistrado;

        //Asignar los valores que se enviaron como parametro a las variables
        nombreregistrado = (String)getIntent().getExtras().getSerializable("nombre");
        documentoregistrado = (String)getIntent().getExtras().getSerializable("documento");
        emailregistrado = (String)getIntent().getExtras().getSerializable("email");
        pregradoregistrado = (Boolean) getIntent().getExtras().getSerializable("pregrado");

        //ahora asignamos esos valores a los controles eso lo hacemos con SetText


        dato_nombre.setText(nombreregistrado);
        dato_documento.setText(documentoregistrado);
        dato_email.setText(emailregistrado);

        //el cuarto debemos evaluar como se contesto

        if(pregradoregistrado) //osea si es verdadero
        {
            dato_pregrado.setText("Si");
        }
        else{

            dato_pregrado.setText("No");
        }


        btn_confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Llamado a otra actividad
                Intent calculoPromedio = new Intent(Confirmacion_datosActivity.this,CalculoActivity.class);
                startActivity(calculoPromedio);
            }
        });


    }
}
