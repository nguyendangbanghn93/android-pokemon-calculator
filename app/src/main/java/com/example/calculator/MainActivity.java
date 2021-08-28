package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView textViewResult;
    String result = "123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        textViewResult.setText(result);
    }

    public void clickHandler(View view) {
        if (view.getId() == R.id.screenPokemon) {
            Intent nextScreen = new Intent(getApplicationContext(), Pokemon.class);
            startActivity(nextScreen);
        }
    }


    public void calculatorClickHandler(View view) {

    }
}