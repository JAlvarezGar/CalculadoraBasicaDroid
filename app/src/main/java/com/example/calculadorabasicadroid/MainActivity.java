package com.example.calculadorabasicadroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity implements ImageButton.OnClickListener {
    ImageButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btIgual, btMas, btMenos, btPor, btEntre, btC;
    EditText edt1;
    String[] cifra = new String[10];
    String buffer = "";

    int sumar = 0;
    int restar = 0;
    int multiplica=0;
    int divide=0;

    boolean suma = false;
    boolean resta = false;
    boolean multiplicar = false;
    boolean dividir = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt1 = (ImageButton) findViewById(R.id.imageButton);
        bt2 = (ImageButton) findViewById(R.id.imageButton2);
        bt3 = (ImageButton) findViewById(R.id.imageButton3);
        bt4 = (ImageButton) findViewById(R.id.imageButton4);
        bt5 = (ImageButton) findViewById(R.id.imageButton5);
        bt6 = (ImageButton) findViewById(R.id.imageButton6);
        bt7 = (ImageButton) findViewById(R.id.imageButton7);
        bt8 = (ImageButton) findViewById(R.id.imageButton8);
        bt9 = (ImageButton) findViewById(R.id.imageButton9);
        bt0 = (ImageButton) findViewById(R.id.imageButton0);
        btIgual = (ImageButton) findViewById(R.id.imageButton15);
        btMas = (ImageButton) findViewById(R.id.imageButton13);
        btMenos = (ImageButton) findViewById(R.id.imageButton12);
        btPor = (ImageButton) findViewById(R.id.imageButton14);
        btEntre = (ImageButton) findViewById(R.id.imageButton11);
        btC = (ImageButton) findViewById(R.id.botonC);
        edt1 = (EditText) findViewById(R.id.display);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btIgual.setOnClickListener(this);
        btMas.setOnClickListener(this);
        btMenos.setOnClickListener(this);
        btPor.setOnClickListener(this);
        btEntre.setOnClickListener(this);
        btC.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.imageButton:
                String uno = "1";
                buffer = buffer + uno;
                break;
            case R.id.imageButton2:
                String dos = "2";
                buffer = buffer + dos;
                break;
            case R.id.imageButton3:
                String tres = "3";
                buffer = buffer + tres;
                break;
            case R.id.imageButton4:
                String cuatro = "4";
                buffer = buffer + cuatro;
                break;
            case R.id.imageButton5:
                String cinco = "5";
                buffer = buffer + cinco;
                break;
            case R.id.imageButton6:
                String seis = "6";
                buffer = buffer + seis;
                break;
            case R.id.imageButton7:
                String siete = "7";
                buffer = buffer + siete;
                break;
            case R.id.imageButton8:
                String ocho = "8";
                buffer = buffer + ocho;
                break;
            case R.id.imageButton9:
                String nueve = "9";
                buffer = buffer + nueve;
                break;
            case R.id.imageButton0:
                String cero = "0";
                buffer = buffer + cero;
                break;
            case R.id.imageButton13:// suma
                cifra[0] = buffer;
                Log.i("Primera cifra: ", cifra[0]);
                buffer = "";
                suma = true;
                break;
            case R.id.imageButton12:// resta
                cifra[0] = buffer;
                Log.i("Primera cifra: ", cifra[0]);
                buffer = "";
                resta = true;
                break;
            case R.id.imageButton14:// multiplicar
                cifra[0] = buffer;
                Log.i("Primera cifra: ", cifra[0]);
                buffer = "";
                multiplicar = true;
                break;
            case R.id.imageButton11:// dividir
                cifra[0] = buffer;
                Log.i("Primera cifra: ", cifra[0]);
                buffer="";
                dividir = true;
                break;
            case R.id.imageButton15: // igual

                if (suma) {
                    cifra[1] = buffer;
                    Log.i("Segunda cifra: ", cifra[1]);
                    sumar = Integer.parseInt(cifra[0]) + Integer.parseInt(cifra[1]);
                    edt1.setText(String.valueOf(sumar));
                    buffer = "";
                    suma = false;
                }


                if (resta) {
                    cifra[1] = buffer;
                    Log.i("Segunda cifra: ", cifra[1]);
                    restar = Integer.parseInt(cifra[0]) - Integer.parseInt(cifra[1]);
                    edt1.setText(String.valueOf(restar));
                    buffer = "";
                    resta = false;
                }

                if (multiplicar) {
                    cifra[1] = buffer;
                    Log.i("Segunda cifra: ", cifra[1]);
                    multiplica = Integer.parseInt(cifra[0]) * Integer.parseInt(cifra[1]);
                    edt1.setText(String.valueOf(multiplica));
                    buffer = "";
                    multiplicar = false;
                }

                if (dividir) {
                    cifra[1] = buffer;
                    Log.i("Segunda cifra: ", cifra[1]);
                    try {
                        divide = Integer.parseInt(cifra[0]) / Integer.parseInt(cifra[1]);
                        edt1.setText(String.valueOf(divide));
                        buffer = "";
                        dividir = false;
                    }catch (Exception e){
                        Log.e("Error numérico: ","no se puede dividir por cero");
                        edt1.setText("Not zero division");
                    }

                }

        }
    }

}
