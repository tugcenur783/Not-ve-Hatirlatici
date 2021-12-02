package com.example.hatirlatici;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class Takvim2 extends AppCompatActivity {
    private EditText BaslangicTarih, BaslangicSaat, BitisTarih, BitisSaat,EtkinlikIsim;
    private Button buttonOnay, buttonRed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takvim2);

        EtkinlikIsim = findViewById(R.id.EtkinlikIsim);
        BaslangicTarih = findViewById(R.id.BaslangicTarih);
        BaslangicSaat = findViewById(R.id.BaslangicSaat);
        BitisTarih = findViewById(R.id.BitisTarih);
        BitisSaat = findViewById(R.id.BitisSaat);
        buttonOnay = findViewById(R.id.buttonOnay);
        buttonRed = findViewById(R.id.buttonRed);

        BaslangicTarih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                int yil = calendar.get(Calendar.YEAR);
                int ay = calendar.get(Calendar.MONTH);
                int gun = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePicker;
                datePicker = new DatePickerDialog(Takvim2.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        BaslangicTarih.setText(dayOfMonth+ "/" +month+ "/" +year);
                    }
                },yil,ay,gun);

                datePicker.setTitle("Başlangıç Tarihi Seçiniz");
                datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",datePicker);
                datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",datePicker);
                datePicker.show();
            }
        });

        BaslangicSaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                int saat = calendar.get(Calendar.HOUR_OF_DAY);
                int dakika = calendar.get(Calendar.MINUTE);

                TimePickerDialog timePicker;
                timePicker = new TimePickerDialog(Takvim2.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        BaslangicSaat.setText(hourOfDay+ ":" +minute);
                    }
                },saat,dakika,true);

                timePicker.setTitle("Başlangıç Saati Seçiniz");
                timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",timePicker);
                timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",timePicker);
                timePicker.show();
            }
        });

        BitisTarih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                int yil = calendar.get(Calendar.YEAR);
                int ay = calendar.get(Calendar.MONTH);
                int gun = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePicker;
                datePicker = new DatePickerDialog(Takvim2.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        BitisTarih.setText(dayOfMonth+ "/" +month+ "/" +year);
                    }
                },yil,ay,gun);

                datePicker.setTitle("Bitiş Tarihi Seçiniz");
                datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",datePicker);
                datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",datePicker);
                datePicker.show();
            }
        });

        BitisSaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                int saat = calendar.get(Calendar.HOUR_OF_DAY);
                int dakika = calendar.get(Calendar.MINUTE);

                TimePickerDialog timePicker;
                timePicker = new TimePickerDialog(Takvim2.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        BitisSaat.setText(hourOfDay+ ":" +minute);
                    }
                },saat,dakika,true);

                timePicker.setTitle("Bitiş Saati Seçiniz");
                timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",timePicker);
                timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",timePicker);
                timePicker.show();
            }
        });

        buttonOnay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EtkinlikIsim.length() == 0)
                {
                    EtkinlikIsim.requestFocus();
                    EtkinlikIsim.setError("Etkinlik İsmi alanı boş bırakılmaz.");
                }
                else if (BaslangicTarih.length() == 0)
                {
                    BaslangicTarih.requestFocus();
                    BaslangicTarih.setError("Başlangıç Tarih alanı boş bırakılmaz.");
                }
                else if (BaslangicSaat.length() == 0)
                {
                    BaslangicSaat.requestFocus();
                    BaslangicSaat.setError("Başlangıç Saat alanı boş bırakılmaz.");
                }

                /*
                else if (BitisTarih.length() == 0)
                {
                    BitisTarih.requestFocus();
                    BitisTarih.setError("Bitiş Tarih boş bırakılmaz.");
                }
                else if(BitisSaat.length() == 0)
                {
                    BitisSaat.requestFocus();
                    BitisSaat.setError("Bitiş Saat alanı boş bırakılmaz.");
                }
                */

                else
                {
                    finish();
                    //Intent intent = new Intent(takvim2.this,AnaMenu.class);
                    //startActivity(intent);
                }
            }
        });

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(takvim2.this,AnaMenu.class);
                finish();
                //startActivity(intent);
            }
        });
    }
}