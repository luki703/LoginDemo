package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName;
    EditText editTextPassword;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextPassword = findViewById(R.id.editTextPassword);
        imageView = findViewById(R.id.imageView);
    }
    public void doSomething(View view)
    {
        if (editTextTextPersonName.length() !=0 && editTextPassword.length() !=0)
        {   imageView.setVisibility(View.VISIBLE);
            Toast.makeText(this, "Witaj " + editTextTextPersonName.getText().toString()
                        + " twoje hasło to "+ editTextPassword.getText().toString(),
                        Toast.LENGTH_LONG).show();
        }
        else if (editTextPassword.length() !=0 && editTextTextPersonName.length() >0)
        {
            Toast.makeText(this, "Wprowadz hasło", Toast.LENGTH_LONG).show();
        }
    }
}