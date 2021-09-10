package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angka_satu, angka_dua;
    Button tambah;
    TextView v_hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_satu = (EditText) findViewById(R.id.angka1);
        angka_dua = (EditText) findViewById(R.id.angka2);

        tambah = (Button) findViewById(R.id.btn_tambah);
        v_hasil = (TextView) findViewById(R.id.hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka_1 = Integer.parseInt(angka_satu.getText().toString());
                int angka_2 = Integer.parseInt(angka_dua.getText().toString());
                int hasil = angka_1 + angka_2;
                v_hasil.setText(Integer.toString(hasil));
            }
        });
    }
}