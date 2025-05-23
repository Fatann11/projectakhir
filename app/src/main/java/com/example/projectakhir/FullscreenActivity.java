package com.example.projectakhir;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FullscreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        ImageView imageView = findViewById(R.id.fullImageView);

        int imageResId = getIntent().getIntExtra("imageResId", 0);
        if (imageResId != 0) {
            imageView.setImageResource(imageResId);
        }
    }
}