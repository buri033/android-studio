package com.example.intenciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button botonir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonir= (Button)findViewById(R.id.button);
        botonir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intencion = new Intent(this,MainActivity2.class);
        startActivity(intencion);
    }
}