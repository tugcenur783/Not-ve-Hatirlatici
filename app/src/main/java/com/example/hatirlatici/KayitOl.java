package com.example.hatirlatici;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KayitOl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_ol);

        EditText Isim_Soyisim = (EditText)findViewById(R.id.isimSoyisim);
        EditText Kullanici_Adi = (EditText)findViewById(R.id.kullanici_adi);
        EditText E_Mail = (EditText)findViewById(R.id.e_Mail);
        EditText Sifre = (EditText)findViewById(R.id.sifre_kayit);
        EditText Sifre_Tekrar = (EditText)findViewById(R.id.sifreTekrar);
        Button Kayit_Ol = (Button)findViewById(R.id.kaydol);

        Kayit_Ol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Isim_Soyisim.length() == 0)
                {
                    Isim_Soyisim.requestFocus();
                    Isim_Soyisim.setError("İsim Soyisim alanı boş bırakılmaz.");
                }
                else if (Kullanici_Adi.length() == 0)
                {
                    Kullanici_Adi.requestFocus();
                    Kullanici_Adi.setError("Kullanıcı adı alanı boş bırakılmaz.");
                }
                else if (E_Mail.length() == 0)
                {
                    E_Mail.requestFocus();
                    E_Mail.setError("E-mail alanı boş bırakılmaz.");
                }
                else if (Sifre.length() == 0)
                {
                    Sifre.requestFocus();
                    Sifre.setError("Şifre alanı boş bırakılmaz.");
                }
                else if(Sifre_Tekrar.length() == 0)
                {
                    Sifre_Tekrar.requestFocus();
                    Sifre_Tekrar.setError("Şifre tekrar alanı boş bırakılmaz.");
                }
                else
                    {
                    Intent intent = new Intent(KayitOl.this, AnaMenu.class);
                    startActivity(intent);
                }
            }
        });
    }
}