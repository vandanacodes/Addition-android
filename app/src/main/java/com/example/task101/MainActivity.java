package com.example.task101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    EditText editText,editText1;
    Button btnAdd;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        btnAdd = findViewById(R.id.btnAdd);
        textView = findViewById(R.id.textView);

        textView.setText("Display");



        //create listener code for add button touch / click event

        class SumListener implements View.OnClickListener{
            @Override
            public void onClick(View view) {
                String str1 = editText.getText().toString();
                // convert input string in integer
                int a = Integer.parseInt(str1);

                String str2 = editText1.getText().toString();
                int b = Integer.parseInt(str2);

                int c = a+b;
               textView.setText("SUM" +c);

            }
        }
        SumListener listener1 = new SumListener();
        btnAdd.setOnClickListener(listener1);


    }
}