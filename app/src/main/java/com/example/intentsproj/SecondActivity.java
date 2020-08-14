package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText edt1,edt2;
    //TextView sign1;
    //Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edt1 = (EditText)findViewById(R.id.editTextNumber1);
        edt2 = (EditText)findViewById(R.id.editTextNumber2);

        edt1.setText(getIntent().getStringExtra("num1"));
        edt2.setText(getIntent().getStringExtra("num2"));

    }

    public void onButtonAdd(View v){

        edt1 = (EditText)findViewById(R.id.editTextNumber1);
        edt2 = (EditText)findViewById(R.id.editTextNumber2);

        TextView t1 = (TextView)findViewById(R.id.result);

        int number1 =Integer.parseInt(edt1.getText().toString());
        int number2 =Integer.parseInt(edt2.getText().toString());

        int sum1 = number1 + number2;

        t1.setText(number1+"+"+number2+"="+Integer.toString(sum1));

    }

    public void onButtonReduction(View v){

        edt1 = (EditText)findViewById(R.id.editTextNumber1);
        edt2 = (EditText)findViewById(R.id.editTextNumber2);

        TextView t1 = (TextView)findViewById(R.id.result);

        int number1 =Integer.parseInt(edt1.getText().toString());
        int number2 =Integer.parseInt(edt2.getText().toString());

        int sum2 = number1 - number2;

        t1.setText(number1+"-"+number2+"="+Integer.toString(sum2));
    }

    public void onButtonMultiplication(View v){

        edt1 = (EditText)findViewById(R.id.editTextNumber1);
        edt2 = (EditText)findViewById(R.id.editTextNumber2);

        TextView t1 = (TextView)findViewById(R.id.result);

        int number1 =Integer.parseInt(edt1.getText().toString());
        int number2 =Integer.parseInt(edt2.getText().toString());

        int sum3 = number1 * number2;

        t1.setText(number1+"*"+number2+"="+Integer.toString(sum3));
    }

    public void onButtonDivide(View v){

        edt1 = (EditText)findViewById(R.id.editTextNumber1);
        edt2 = (EditText)findViewById(R.id.editTextNumber2);

        TextView t1 = (TextView)findViewById(R.id.result);

        int number1 =Integer.parseInt(edt1.getText().toString());
        int number2 =Integer.parseInt(edt2.getText().toString());

        int sum4 = number1 / number2;

        t1.setText(number1+"/"+number2+"="+Integer.toString(sum4));
    }


}