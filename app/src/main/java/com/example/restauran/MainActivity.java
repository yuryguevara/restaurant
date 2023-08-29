package com.example.restauran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton dom;
    CheckBox op1, op2, op3, op4, op5, op6, op7,op8;
    Button calcular, cancelar;
    TextView ttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dom = findViewById(R.id.rbdomicilio);
        op1 = findViewById(R.id.cbhuevos);
        op2 = findViewById(R.id.cbcalentado);
        op3 = findViewById(R.id.cbarepa);
        op4 = findViewById(R.id.cbfruta);
        op5 = findViewById(R.id.chjugos);
        op6 = findViewById(R.id.chchocolate);
        op7 = findViewById(R.id.chcafe);
        op8 = findViewById(R.id.chbatidos);
        ttotal = findViewById(R.id.tpagar);
    }

    public void Calcular(View V){
        Double total=0.0;
        if(dom.isChecked())
            total=total+5000;
        if(op1.isChecked())
            total=total+10000;
        if(op2.isChecked())
            total=total+10000;
        if(op3.isChecked())
            total=total+5000;
        if(op4.isChecked())
            total=total+6000;
        if(op5.isChecked())
            total=total+10000;
        if(op6.isChecked())
            total=total+9000;
        if(op7.isChecked())
            total=total+5000;
        if(op8.isChecked())
            total=total+12000;
       ttotal.setText("total: "+ total);
    }
}