package com.example.pbm.projetofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chamarL (View view){
        Intent intent = new Intent(MainActivity.this, Forma.class);
        startActivity(intent);

    }
    public void chamarM (View view){
        Intent intent = new Intent(MainActivity.this, Mes.class);
        startActivity(intent);

    }
    public void chamarS (View view){
        Intent intent = new Intent(MainActivity.this, Somar.class);
        startActivity(intent);

    }
    public void chamarMu (View view){
        Intent intent = new Intent(MainActivity.this, Mutiplicar.class);
        startActivity(intent);

    }
    public void chamarD (View view){
        Intent intent = new Intent(MainActivity.this, Dividir.class);
        startActivity(intent);

    }
    public void chamarDi (View view){
        Intent intent = new Intent(MainActivity.this, Diminuir.class);
        startActivity(intent);
    }

    public void fechar(){
        finish();
    }
}
