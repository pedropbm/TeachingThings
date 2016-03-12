package com.example.pbm.projetofinal;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    public void errado(View view){
        imageView.setImageResource(R.drawable.errado);

    }
    public void certo(View view){
        imageView.setImageResource(R.drawable.correto);

    }


    public void voltar(View view){
        finish();

    }

}
