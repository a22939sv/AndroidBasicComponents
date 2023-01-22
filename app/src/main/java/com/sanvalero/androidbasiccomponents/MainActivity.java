package com.sanvalero.androidbasiccomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    Button btnIngresar;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this, "Hola este es un Toast", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "Hola este es un Toast", Toast.LENGTH_LONG).show();


        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde el onClick del ingresar", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnIngresar:
                Toast.makeText(getApplicationContext(), "Desde el onClick del ingresar", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnCancelar:
                Toast.makeText(getApplicationContext(), "Desde el onClick del cancelar", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}