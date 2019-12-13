package com.example.mylittlejf.GridView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.mylittlejf.R;

public class GridViewActivity extends AppCompatActivity {


    private GridView  myGridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);


        myGridview= findViewById(R.id.gridView);
        myGridview.setAdapter(new MyGridView(GridViewActivity.this));
    }
}
