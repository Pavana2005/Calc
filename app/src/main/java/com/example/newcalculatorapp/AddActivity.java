package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {
    String getNum1,getNum2,result;
    int num1,num2,sum;
    TextView t1;
EditText ed1,ed2;
Button b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        ed1=(EditText) findViewById(R.id.n1);
        ed2=(EditText) findViewById(R.id.n2);
        b4=(Button) findViewById(R.id.addt);
        b5=(Button) findViewById(R.id.go);
        t1=(TextView) findViewById(R.id.res);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=ed1.getText().toString();
                getNum2=ed2.getText().toString();


                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);


                sum=num1+num2;


                result = String.valueOf(sum);

                t1.setText(result);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
    }
}