package com.example.calculadorabasicadroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity implements Button.OnClickListener {
    TextView tv1;
    Button nuevocalculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tv1 = (TextView) findViewById(R.id.tvResultado);
        nuevocalculo= (Button)findViewById(R.id.btNuevoCalculo);

        Bundle bundle = getIntent().getExtras();
        String result = bundle.getString("result");
        tv1.setText("El resultado es : "+result);
        nuevocalculo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        finish();

    }
}
