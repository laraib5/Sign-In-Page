package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText e, p;
    Button b;

    String u1[] = {"laraibnaqvi17@gmail.com", "laraib"};
    String u2[] = {"abc@gmail.com", "098345"};
    String u3[] = {"hello@gmail.com", "098765"};
    String u4[] = {"xyz@gmail.com", "sana"};
    String u5[] = {"b@gmail.com", "ghjoiu"};
    String u6[] = {"p@gmail.com", "asdfgh"};
    String u7[] = {"l.com", "plokik"};
    String u8[] = {"m@gmail.com", "zxcvbn"};
    String u9[] = {"g.com", "mnbvcx"};
    String u10[] = {"abcde.com", "1234"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        e = (EditText) findViewById(R.id.e);
        p = (EditText) findViewById(R.id.p);
        b = (Button) findViewById(R.id.b);

     b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().toString().equals("") || p.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "PLEASE FILL THE EMPTY FIELDS!", Toast.LENGTH_LONG).show();
                }
                else if(e.getText().toString().equals(u1[0]) && p.getText().toString().equals(u1[1]) ){
                Toast.makeText(MainActivity.this, "SUCCESSFULLY SIGNIN!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "INVALID EMAIL OR PASSWORD!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

