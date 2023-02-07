package com.example.intenciones;

import androidx.appcompat.app.AppCompatActivity ;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
Button botonir2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        botonir2 =(Button)findViewById(R.id.button2);
        botonir2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intencion2 = new Intent(this,MainActivity.class);
        startActivity(intencion2);
    }
}