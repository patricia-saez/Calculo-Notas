package com.droiddevelop.calculonotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoActivity extends AppCompatActivity {

    private TextView promedionotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        Button btn_Consultar = (Button)findViewById(R.id.Consultar);
        Button btn_Salir = (Button)findViewById(R.id.salir);

        EditText nombre = (EditText)findViewById(R.id.nombre);

        promedionotas = (TextView) findViewById(R.id.notas);

        final EditText notauno = (EditText) findViewById(R.id.nota1);

        final EditText notados = (EditText) findViewById(R.id.nota4);

        final EditText notatres = (EditText) findViewById(R.id.nota3);

        final EditText notacuatro = (EditText) findViewById(R.id.nota4);

        //Especificacion del click del boton consultar
        btn_Consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double Promedio = (Double.parseDouble(notauno.getText().toString()) + Double.parseDouble(notados.getText().toString()) + Double.parseDouble(notatres.getText().toString())
                        + Double.parseDouble(notacuatro.getText().toString()))/4;

                promedionotas.setText(Double.toString(Promedio));

            }
        });

        //Especificacion del click del boton salir
        btn_Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Principal = new Intent(CalculoActivity.this,MainActivity.class);
                //estamos llamando a la principal pasandole un valor de true porque queremos cerrar
                Principal.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                Principal.putExtra("cerrar",true);
                startActivity(Principal);
            }
        });


    }
}
