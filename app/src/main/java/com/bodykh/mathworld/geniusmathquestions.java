package com.bodykh.mathworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class geniusmathquestions extends AppCompatActivity {

    public ListView listView;

    private String[] quescounter = {
            "\tQuestion 1", "\tQuestion 2", "\tQuestion 3"
            , "\tQuestion 4", "\tQuestion 5", "\tQuestion 6"
            , "\tQuestion 7", "\tQuestion 8", "\tQuestion 9"
            , "\tQuestion 10", "\tQuestion 11", "\tQuestion 12"
            , "\tQuestion 13", "\tQuestion 14", "\tQuestion 15"
            , "\tQuestion 16", "\tQuestion 17", "\tQuestion 18"
            , "\tQuestion 19", "\tQuestion 20"
    };

    private int[] quesimgs = {
            R.drawable.borad1, R.drawable.borad2, R.drawable.borad3,
            R.drawable.borad4, R.drawable.borad5, R.drawable.borad6,
            R.drawable.borad7, R.drawable.borad8, R.drawable.borad9,
            R.drawable.borad10, R.drawable.borad11, R.drawable.borad12,
            R.drawable.borad13, R.drawable.borad14, R.drawable.borad15,
            R.drawable.borad16, R.drawable.borad17, R.drawable.borad18,
            R.drawable.borad19, R.drawable.borad20,
    };

    private int[] quesans = {200, 24, 2, 03, 68, 61, 20, -60, 366329, 1, 216, 81, 30, 9, 12, 12, 18, 6, 36, 14};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geniusmathquestions);
        setTitle("Genius Math Questions");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = findViewById(R.id.lista2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listtextview2, quescounter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(geniusmathquestions.this, geniusmathquestionsadapter.class);
                intent.putExtra("pic", quesimgs[i]);
                intent.putExtra("names", quescounter[i]);
                intent.putExtra("ans", quesans[i]);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                recreate();

        }
        return super.onOptionsItemSelected(item);
    }
}