package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class register extends AppCompatActivity {

    EditText usr, email, phone, born, pwd,repwd;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usr = findViewById(R.id.Rusername);
        email = findViewById(R.id.Remail);
        phone = findViewById(R.id.Rphone);
        born = findViewById(R.id.Rborn);
        pwd = findViewById(R.id.Rpass);
        repwd = findViewById(R.id.repass);
        fab = findViewById(R.id.fabsumbit);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usr.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||
                        phone.getText().toString().isEmpty() ||
                        born.getText().toString().isEmpty() ||
                        pwd.getText().toString().isEmpty() ||
                        repwd.getText().toString().isEmpty())
                {
                    Snackbar.make(view, "Fill the blank data", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (pwd.getText().toString().equals(repwd.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "registration is successful",
                                Toast.LENGTH_LONG).show();
                        Intent i =new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view, "password and repassword must be same",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}