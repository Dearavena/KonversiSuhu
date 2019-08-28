package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text1 , text2, text3, text4;
    Button conver;
    float Hasil1, Hasil2, Hasil3, Hasil4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (EditText) findViewById(R.id.celcius);
        text2 = (EditText) findViewById(R.id.kelvin);
        text3 = (EditText) findViewById(R.id.farenheit);
        text4 = (EditText) findViewById(R.id.reamur);
        conver = (Button) findViewById(R.id.btnC);
        conver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hasil1 = Float.parseFloat(text1.getText().toString().trim());
                Hasil2 = (Hasil1*9/5)+32;
                Hasil3 = Hasil1 + 273;
                Hasil4 = (float) (0.8 * Hasil1);

                text2.setText(Hasil2+"");
                text3.setText(Hasil3+"");
                text4.setText(Hasil4+"");
            }
        });
    }
}
