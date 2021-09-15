package com.bodykh.mathworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class mathlaws extends AppCompatActivity {

    private String[] mathlawsheadname = {"\tAreas","\tVolumes","\tFunctions and Equations","\tExponents","\tTrigonometry","\tGeometry","\tStatistic","\tDerivatives","\tProbability","\tLogarithms","\tSpecial Limits","\tIntegrals and Primitives","\tComplex Numbers"};
    private int[] mathlawsphotos = {R.drawable.areamin,R.drawable.volumemin,R.drawable.funequmin,R.drawable.exponentsmin,
            R.drawable.trigonometrymin,R.drawable.geometrymin,R.drawable.statisticmin,
            R.drawable.derivativesmin,R.drawable.probabilitymin,R.drawable.logarithmsmin,
            R.drawable.speciallimitsmin,R.drawable.integralsprimitivesmin,R.drawable.complexnumbersmin} ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathlaws);
        setTitle("Mathematics Laws");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListView listView=findViewById(R.id.lista);
        ArrayAdapter <String> adapter = new ArrayAdapter <String> (this,R.layout.listtextview,mathlawsheadname);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent=new Intent(mathlaws.this , mathlawsadapter.class);
                intent.putExtra("pic",mathlawsphotos[i]);
                intent.putExtra("names",mathlawsheadname[i]);
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