package com.example.hatirlatici;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_panel);

        Button Giris_Yap = (Button)findViewById(R.id.girisyap);
        Button Kayit_Ol = (Button)findViewById(R.id.kayitol);
        EditText Kullanici_Adi = (EditText)findViewById(R.id.k_adi);
        EditText Sifre = (EditText) findViewById(R.id.sifre);



        Giris_Yap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPanel.this, AnaMenu.class);
                startActivity(intent);
            }
        });

        Kayit_Ol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPanel.this, KayitOl.class);
                startActivity(intent);
            }
        });
    }
}