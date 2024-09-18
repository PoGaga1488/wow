package com.example.buttomebla;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button buttondis;
    private Button buttonen;
    private TextView ilsc;
    private int cilsc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        buttondis = findViewById(R.id.button);
        buttonen = findViewById(R.id.button2);
        ilsc = findViewById(R.id.textView2);

        buttondis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttondis.setEnabled(false);
                cilsc++;
                Toast.makeText(MainActivity.this, "zostal wyl", Toast.LENGTH_SHORT).show();
                updateCilosc();
            }
        });

        buttonen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttondis.setEnabled(true);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    private void updateCilosc() {
        ilsc.setText("Ilość klików:  " + cilsc);
            }











}