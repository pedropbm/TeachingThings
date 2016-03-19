package com.example.pbm.projetofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


/** Pedro Bandeira Milfont
 *   Esse aplicativo ajuda as crianças a desenvolver e praticar algumas coisas basicas como por exemplo:
 *      O mes de um ano em numeral.
 *      Qual nome de determinada forma geometrica.
 *      Responder uma Soma.
 *      Responder uma Divisão.
 *      Responder uma Mutiplicação.
 *      Responder uma Subtração.

 *      A criança pratica brincando, sendo assim não é chato ou cansativo aprender e relembrar algumas coisas.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**  O metodo chamarL chama o novo layout de Forma */
    public void chamarL (View view){
        Intent intent = new Intent(MainActivity.this, Forma.class);
        startActivity(intent);

    }
    /** O metodo ChamarM chama o novo layout de Mes*/
    public void chamarM (View view){
        Intent intent = new Intent(MainActivity.this, Mes.class);
        startActivity(intent);

    }
    /** O metodo chamarS chama o novo layout de Somar*/
    public void chamarS (View view){
        Intent intent = new Intent(MainActivity.this, Somar.class);
        startActivity(intent);

    }
    /** O metodo chamarMu chama o novo layout de Mutiplicar*/
    public void chamarMu (View view){
        Intent intent = new Intent(MainActivity.this, Mutiplicar.class);
        startActivity(intent);

    }
    /** O metodo ChamarD chama o layout de Dividir*/
    public void chamarD (View view){
        Intent intent = new Intent(MainActivity.this, Dividir.class);
        startActivity(intent);

    }
    /** O metodo chamarDi chama o layout de Diminuir*/
    public void chamarDi (View view){
        Intent intent = new Intent(MainActivity.this, Diminuir.class);
        startActivity(intent);
    }
    /** o metodo fechar fecha o programa*/
    public void fechar(){
        finish();
    }
}
