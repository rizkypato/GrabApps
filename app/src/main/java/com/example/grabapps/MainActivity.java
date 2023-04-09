package com.example.grabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public ImageView aktivitas, bayar, orang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aktivitas = findViewById(R.id.aktivitas);
        bayar = findViewById(R.id.bayar);
        orang = findViewById(R.id.orang);

        aktivitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), MasukActivity.class);
                startActivity(itn);
            }
        });

        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),PembayaranActivity.class);
                startActivity(itn);
            }
        });

        orang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),AktivitasActivity.class);
                startActivity(itn);
            }
        });
    }
}