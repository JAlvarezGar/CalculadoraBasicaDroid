package com.example.calculadorabasicadroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements ImageButton.OnClickListener {
    ImageButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btIgual, btMas, btMenos, btPor, btEntre, btC;
    EditText edt1;
    String[] cifra = new String[10];
    String buffer = "";

    int sumar = 0;
    int restar = 0;
    int multiplica = 0;
    int divide = 0;
    int contador = 0;

    boolean suma = false;
    boolean resta = false;
    boolean multiplicar = false;
    boolean dividir = false;
    private int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cifra[0] = "";
        cifra[1] = "";
        resultado = 0;


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
        btIgual = (ImageButton) findViewById(R.id.btIgual);
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
                edt1.setText(buffer);
                break;
            case R.id.imageButton2:
                String dos = "2";
                buffer = buffer + dos;
                edt1.setText(buffer);
                break;
            case R.id.imageButton3:
                String tres = "3";
                buffer = buffer + tres;
                edt1.setText(buffer);
                break;
            case R.id.imageButton4:
                String cuatro = "4";
                buffer = buffer + cuatro;
                edt1.setText(buffer);
                break;
            case R.id.imageButton5:
                String cinco = "5";
                buffer = buffer + cinco;
                edt1.setText(buffer);
                break;
            case R.id.imageButton6:
                String seis = "6";
                buffer = buffer + seis;
                edt1.setText(buffer);
                break;
            case R.id.imageButton7:
                String siete = "7";
                buffer = buffer + siete;
                edt1.setText(buffer);
                break;
            case R.id.imageButton8:
                String ocho = "8";
                buffer = buffer + ocho;
                edt1.setText(buffer);
                break;
            case R.id.imageButton9:
                String nueve = "9";
                buffer = buffer + nueve;
                edt1.setText(buffer);
                break;
            case R.id.imageButton0:
                String cero = "0";
                buffer = buffer + cero;
                edt1.setText(buffer);
                break;
            case R.id.imageButton13:// suma

                cifra[contador] = buffer;
                edt1.setText("");
                buffer = "";
                contador++;
                suma = true;
                break;
            case R.id.imageButton12:// resta
                cifra[contador] = buffer;
                edt1.setText("");
                buffer = "";
                contador++;
                resta = true;
                break;
            case R.id.imageButton14:// multiplicar
                cifra[contador] = buffer;
                edt1.setText("");
                buffer = "";
                contador++;
                multiplicar = true;
                break;
            case R.id.imageButton11:// dividir
                cifra[contador] = buffer;
                edt1.setText("");
                buffer = "";
                contador++;
                dividir = true;
                break;
            case R.id.botonC:
                buffer = "";
                sumar = 0;
                restar = 0;
                multiplica = 0;
                divide = 0;
                cifra[0] = "";
                cifra[1] = "";
                edt1.setText("");
                resultado = 0;
                contador = 0;
                break;
            case R.id.btIgual: // igual


                if (suma) {
                    cifra[contador] = buffer;
                    edt1.setText("");

                    if (resultado == 0) {
                        resultado = Integer.parseInt(cifra[contador - 1]) + Integer.parseInt(cifra[contador]);
                    } else {
                        resultado = Integer.parseInt(cifra[contador]) + resultado;
                    }

                    edt1.setText(String.valueOf(resultado));
                    suma = false;
                }


                if (resta) {
                    cifra[contador] = buffer;
                    edt1.setText("");

                    if (resultado == 0) {
                        resultado = Integer.parseInt(cifra[contador - 1]) - Integer.parseInt(cifra[contador]);
                    } else {
                        resultado = resultado - Integer.parseInt(cifra[contador]);
                    }
                    edt1.setText(String.valueOf(resultado));
                    resta = false;
                }

                if (multiplicar) {
                    cifra[contador] = buffer;
                    edt1.setText("");

                    if (resultado == 0) {
                        resultado = Integer.parseInt(cifra[contador - 1]) * Integer.parseInt(cifra[contador]);
                    } else {
                        resultado = resultado * Integer.parseInt(cifra[contador]);
                    }
                    edt1.setText(String.valueOf(resultado));
                    multiplicar = false;
                }

                if (dividir) {
                    cifra[contador] = buffer;
                    edt1.setText("");
                    if(resultado==0){
                        try {
                            resultado = Integer.parseInt(cifra[contador-1]) / Integer.parseInt(cifra[contador]);
                            edt1.setText(String.valueOf(resultado));
                            buffer = "";
                            dividir = false;
                        } catch (Exception e) {
                            Log.e("Error numérico: ", "no se puede dividir por cero");
                            edt1.setText("Not zero division");
                        }

                    }else{
                        try {
                            resultado = resultado / Integer.parseInt(cifra[contador]);
                            edt1.setText(String.valueOf(resultado));
                            buffer = "";
                            dividir = false;
                        } catch (Exception e) {
                            Log.e("Error numérico: ", "no se puede dividir por cero");
                            edt1.setText("Not zero division");
                        }
                    }


                }

        }
    }

}
