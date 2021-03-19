package com.example.tugas;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity{
    TextView txtHello, txtkata;
    Button btnlajt;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        btnlajt = findViewById(R.id.btnlanjut);
        txtHello = findViewById(R.id.tHi);
        txtkata = findViewById(R.id.tsambutan);


        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("a");

        txtHello.setText("Hai, " + username+"");

        btnlajt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
