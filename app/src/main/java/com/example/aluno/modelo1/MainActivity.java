package com.example.aluno.modelo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int numerodecafe = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        int price = calcularPrice();
        displayMessage("Nome = Pedro " +  numerodecafe + "\n Obrigado! " + "\n Total, $" + price + "\n Thanks ");
    }
    public int calcularPrice(){
        return numerodecafe * 10;
    }

    public void incremente(View view) {
        numerodecafe++;
        displayQuantity(numerodecafe);

    }

    public void decremento(View view) {
        if (numerodecafe >0) {
            numerodecafe--;
        }
        else {
            numerodecafe = 0;
        }
        displayQuantity(numerodecafe);

    }


    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message){
        TextView messageTextView = (TextView) findViewById(R.id.message_text_view);
        messageTextView.setText(message);
    }

}
