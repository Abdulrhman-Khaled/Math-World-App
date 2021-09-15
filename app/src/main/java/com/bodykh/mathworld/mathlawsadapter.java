package com.bodykh.mathworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class mathlawsadapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathlawsadapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String lawsnames = getIntent().getStringExtra("names");
        int lawsimages = getIntent().getIntExtra("pic",0);
        setTitle(lawsnames);
        ImageView imageView=findViewById(R.id.lawview);
        imageView.setImageResource(lawsimages);


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