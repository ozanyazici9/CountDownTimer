package com.ozanyazici.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        new CountDownTimer(10000, 1000) { //oncreate te yazdığım için uygulama başlar başlamaz saymaya başlar.
            //parametreler milisaniye cinsinden (kaçtan başlanıcak, ne kadar aralıkla).
            @Override
            public void onTick(long millisUntilFinished) { //yukarıda aralığa 1 sn vermiştik burda bir sn de bir ne yapıcak onu yazıyoruz.
                textView.setText("Left: " + millisUntilFinished / 1000);


            }

            @Override
            public void onFinish() { //bitince ne yapıcak.

                Toast.makeText(getApplicationContext(), "Done!", Toast.LENGTH_LONG).show();
                textView.setText("Finished");

            }
        }.start();
    }



}