package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {
    String getNum1,getNum2,result;
    int num1,num2,dif;
    TextView t2;
    EditText ed3,ed4;
    Button b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        ed3=(EditText) findViewById(R.id.n3);
        ed4=(EditText) findViewById(R.id.n4);
        b6=(Button) findViewById(R.id.sub);
        b7=(Button) findViewById(R.id.ba);
        t2=(TextView) findViewById(R.id.resu);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=ed3.getText().toString();
                getNum2=ed4.getText().toString();


                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);


                dif=num1-num2;


                result = String.valueOf(dif);

                t2.setText(result);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
    }
}