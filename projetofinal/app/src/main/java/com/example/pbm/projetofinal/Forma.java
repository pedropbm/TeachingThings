package com.example.pbm.projetofinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Forma extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma);

        imageView = (ImageView) findViewById(R.id.image);

    }
    /** O metodo errado chama a imagem de errado para mostrar que a resposta dada pelo usuario é errada*/
    public void errado(View view){
        imageView.setImageResource(R.drawable.errado);

    }
    /** O metodo certo chama a imagem de correto para mostrar que o usuario acertou a resposta*/
    public void certo(View view){
        imageView.setImageResource(R.drawable.correto);

    }

    /** O metodo voltar volta, fecha o layout aberto.*/
    public void voltar(View view){
        finish();

    }

}
