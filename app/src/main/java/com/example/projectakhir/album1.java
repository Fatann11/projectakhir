package com.example.projectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class album1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album1);
        setTitle("Album Batik Day");

        findViewById(R.id.img1).setOnClickListener(v -> openFullscreen(R.drawable.batik));
        findViewById(R.id.img2).setOnClickListener(v -> openFullscreen(R.drawable.b2));
        findViewById(R.id.img3).setOnClickListener(v -> openFullscreen(R.drawable.b3));
        findViewById(R.id.img4).setOnClickListener(v -> openFullscreen(R.drawable.b4));
    }

    private void openFullscreen(int imageResId) {
        Intent intent = new Intent(this, FullscreenActivity.class);
        intent.putExtra("imageResId", imageResId);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

         if (id == R.id.action_menu2) {
            // Aksi untuk Home
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
