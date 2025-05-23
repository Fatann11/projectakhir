package com.example.projectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class album2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album2); // Ganti nama layout jika perlu
        setTitle("Album Bukber "); // Judul di atas
        findViewById(R.id.img1).setOnClickListener(v -> openFullscreen(R.drawable.bukber));
        findViewById(R.id.img2).setOnClickListener(v -> openFullscreen(R.drawable.bu1));
        findViewById(R.id.img3).setOnClickListener(v -> openFullscreen(R.drawable.bu2));
        findViewById(R.id.img4).setOnClickListener(v -> openFullscreen(R.drawable.bu3));
        findViewById(R.id.img4).setOnClickListener(v -> openFullscreen(R.drawable.bu8));
        findViewById(R.id.img4).setOnClickListener(v -> openFullscreen(R.drawable.bu7));
    }

    private void openFullscreen(int imageResId) {
        Intent intent = new Intent(this, FullscreenActivity.class);
        intent.putExtra("imageResId", imageResId);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu); // menu.xml
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
       if (id == R.id.action_menu2) {
            // Aksi untuk Home
            finish(); // atau pindah ke MainActivity
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
