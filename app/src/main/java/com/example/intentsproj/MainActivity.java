package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    //TextView txtMessage;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.ok);
        editText1 = (EditText)findViewById(R.id.numi1);
        editText2 = (EditText)findViewById(R.id.numi2);
        //txtMessage = findViewById(R.id.txtName);

    }

    @Override
    protected void onResume() {
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //txtMessage.setText("Hi all");
                String namevalue1 = editText1.getText().toString();
                String namevalue2 = editText2.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("num1",namevalue1);
                intent.putExtra("num2",namevalue2);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();

                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

            }
        });

    }
}
