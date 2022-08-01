package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn;
private EditText gmail, password;
private TextView welcome, enter, commit, fpassword, pressHere, registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.ic_btnd);
        gmail = findViewById(R.id.email_text);
        password = findViewById(R.id.tablegg);
        welcome = findViewById(R.id.welcome);
        enter = findViewById(R.id.ic_vhod);
        commit = findViewById(R.id.ic_texxxt);
        fpassword = findViewById(R.id.ic_textview);
        pressHere = findViewById(R.id.ic_textti);
        registration = findViewById(R.id.ic_regi);

        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (gmail.getText().toString().isEmpty()){
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                }else{
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()){
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                }else{
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gmail.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    btn.setVisibility(view.GONE);
                    gmail.setVisibility(view.GONE);
                    password.setVisibility(view.GONE);
                    pressHere.setVisibility(view.GONE);
                    enter.setVisibility(view.GONE);
                    commit.setVisibility(view.GONE);
                    fpassword.setVisibility(view.GONE);
                    registration.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно вошли",Toast.LENGTH_SHORT).show();


                }
        }
    });
}}