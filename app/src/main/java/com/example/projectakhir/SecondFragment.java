package com.example.projectakhir;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {

    int[] imageList = {
            R.drawable.aib, R.drawable.b2, R.drawable.bukber,
            R.drawable.i2, R.drawable.batik, R.drawable.bu9,
            R.drawable.t1, R.drawable.bu2, R.drawable.i3,
            R.drawable.t4, R.drawable.b3, R.drawable.t2,
            R.drawable.b4, R.drawable.bu3, R.drawable.t6,
            R.drawable.islamic, R.drawable.bu1, R.drawable.bu7,
            R.drawable.i5, R.drawable.bu8, R.drawable.t7

            // Tambahkan sesuai nama file di drawable
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3)); // 3 kolom

        ImageAdapter adapter = new ImageAdapter(getContext(), imageList);
        recyclerView.setAdapter(adapter);

        return view;
}
}