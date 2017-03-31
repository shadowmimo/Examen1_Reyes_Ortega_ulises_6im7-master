package com.example.cecyt9.examen1_app_apm_ulises_reyes_ortega_6im7;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText cantidad;
    Button Boton;
    Double dolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidad= (EditText) findViewById(R.id.cantidad);
        Boton = (Button) findViewById(R.id.boton);
        Boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch( v.getId()){
            case R.id.boton:
                Intent envia = new Intent(this, Convertir.class);
                Bundle datos = new Bundle();
                dolar= (Double.parseDouble(cantidad.getText().toString()))/15;
                datos.putDouble("dinero", dolar);
                envia.putExtras(datos);
                finish();
                startActivity(envia);

                break;
        }

    }
}
