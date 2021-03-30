package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button btnlgn;
    EditText edtuser, edtpw;
    String name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnlgn = findViewById(R.id.btnmsk);
        edtuser = findViewById(R.id.username);
        edtpw = findViewById(R.id.password);

        btnlgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = edtuser.getText().toString();
                password = edtpw.getText().toString();
                String username = "KusukaMasako";
                String pwd = "fathoni123";

                if (name.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Masukkan Email dan Password",
                            Toast.LENGTH_LONG);
                    t.show();
                } else {
                    if (name.equals(username) && password.equals(pwd)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Berhasil",
                                Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();
                        b.putString("a", name.trim());
                        b.putString("b", password.trim());
                        Intent i = new Intent(login.this, home2.class);
                        i.putExtras(b);
                        startActivity(i);
                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            }
        });
    }
}