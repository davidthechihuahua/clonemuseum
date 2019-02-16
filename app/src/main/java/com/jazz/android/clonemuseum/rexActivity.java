package com.jazz.android.clonemuseum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class rexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rex_activity);
        ArrayList<CategoryItem> rex = new ArrayList<>();
        rex.add(new CategoryItem("Captain Rex",R.drawable.rex));

        CategoryAdapter adapter = new CategoryAdapter(this, rex);
        ListView listView = findViewById(R.id.list_rex);

        listView.setAdapter(adapter);

    }
}

