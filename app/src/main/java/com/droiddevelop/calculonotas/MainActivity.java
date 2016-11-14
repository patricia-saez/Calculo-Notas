package com.droiddevelop.calculonotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_ingresar = (Button)findViewById(R.id.boton_001);





        //Especificacion del click del boton ingresar
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamado a otra actividad
                Intent formRegistro = new Intent(MainActivity.this,FormularioActivity.class);
                startActivity(formRegistro);
            }
        });

        //Evaluar lo que viene del intent, para saber si se cierra

        if (getIntent().getBooleanExtra("cerrar",false)){
            finish();
        }

    }
}
