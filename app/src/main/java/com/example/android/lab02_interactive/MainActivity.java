package com.example.android.lab02_interactive;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        display(1);
    }
    public void add(View view) {
        display(2);
    }
    private void display(int number) {
        TextView quantityYextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityYextView.setText(String.valueOf(number));

        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        int price = 5;
        int total = price * number;
        String myString = NumberFormat.getCurrencyInstance().format(total);
        priceTextView.setText(myString);
    }


}
