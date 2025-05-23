package com.example.projectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    FrameLayout album1, album2, album3, album4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        album1 = findViewById(R.id.albumSquare1);
        album2 = findViewById(R.id.albumSquare2);
        album3 = findViewById(R.id.albumSquare3);
        album4 = findViewById(R.id.albumSquare4);

        View.OnClickListener goToLogin = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        };

        album1.setOnClickListener(goToLogin);
        album2.setOnClickListener(goToLogin);
        album3.setOnClickListener(goToLogin);
        album4.setOnClickListener(goToLogin);
    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        // Tidak menampilkan menu apa pun di MainActivity
        return false;
    }

}

