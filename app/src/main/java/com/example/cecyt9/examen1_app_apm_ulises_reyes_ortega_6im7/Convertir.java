package com.example.cecyt9.examen1_app_apm_ulises_reyes_ortega_6im7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
/**
 * Created by CECyT9 on 30/03/2017.
 */

public class Convertir extends AppCompatActivity implements OnClickListener{
    TextView muestraDatos;
    Double recibido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muestrainfo);

        muestraDatos = (TextView) findViewById(R.id.resultado);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        recibido = recibe.getDouble("dinero");
        muestraDatos.setText("Ulises Axel Reyes Ortega, Resultado:\n" + recibido);
        envia = (Button) findViewById(R.id.envia);
        envia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch( v.getId()){
            case R.id.envia:

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen Primer Parcial");
                intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo:" + recibido);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
                startActivity(intent);
                break;

        }
    }
}
