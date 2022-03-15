package com.example.ugb;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    int veces=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Uno=findViewById(R.id.txtUno);
        TextView Dos=findViewById(R.id.txtDos);
        TextView Tres=findViewById(R.id.txtTres);

        Button bot=findViewById(R.id.btnboton);
        Button bot2=findViewById(R.id.btnboton2);



        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veces += 1;

                if (veces <= 4) {
                    int num1 = getNumeroRandom(1, 9);
                    String numero1 = String.valueOf(num1);


                    int num2 = getNumeroRandom(1, 9);
                    String numero2 = String.valueOf(num2);

                    int num3 = getNumeroRandom(1, 9);
                    String numero3 = String.valueOf(num3);

                    Uno.setText(numero1);
                    Dos.setText(numero2);
                    Tres.setText(numero3);

                }else{

                    bot.setEnabled(false);
                }
            }
        });


        bot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                veces=0;
                bot.setEnabled(true);
            }
        });




    }


    private int getNumeroRandom(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max);
    }



}