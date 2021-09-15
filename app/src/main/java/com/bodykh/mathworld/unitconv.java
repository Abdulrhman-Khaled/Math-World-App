package com.bodykh.mathworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class unitconv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitconv);
        setTitle("Unit Converter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

    public void volume_but(View view) {
        startActivity(new Intent(unitconv.this, volumeconv.class));
    }

    public void area_but(View view) {
        startActivity(new Intent(unitconv.this, com.bodykh.mathworld.areaconv.class));

    }

    public void length_but(View view) {
        startActivity(new Intent(unitconv.this, com.bodykh.mathworld.lengthconv.class));

    }

    public void pressure_but(View view) {
        startActivity(new Intent(unitconv.this, com.bodykh.mathworld.pressureconv.class));

    }

    public void temperature_but(View view) {
        startActivity(new Intent(unitconv.this, com.bodykh.mathworld.temperatureconv.class));

    }

    public void flowrate_but(View view) {
        startActivity(new Intent(unitconv.this, com.bodykh.mathworld.flowrateconv.class));

    }
}