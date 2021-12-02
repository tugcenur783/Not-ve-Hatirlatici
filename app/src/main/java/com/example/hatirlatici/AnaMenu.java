package com.example.hatirlatici;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_menu);

        Button NotDefteri = (Button)findViewById(R.id.notdefteri);
        Button A_Takvim = (Button)findViewById(R.id.takvim);

        NotDefteri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnaMenu.this,Not_Defteri.class);
                startActivity(intent);
            }
        });

        A_Takvim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnaMenu.this, Takvim2.class);
                startActivity(intent);
            }
        });
    }
}