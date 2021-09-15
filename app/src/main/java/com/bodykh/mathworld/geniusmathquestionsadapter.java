package com.bodykh.mathworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class geniusmathquestionsadapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geniusmathquestionsadapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String quessname = getIntent().getStringExtra("names");
        setTitle(quessname);

        int quesimg = getIntent().getIntExtra("pic", 0);
        ImageView imageView = findViewById(R.id.qusimg);
        imageView.setImageResource(quesimg);

        int quesans = getIntent().getIntExtra("ans", 0);
        TextView anstxt1t = findViewById(R.id.torftxt);

        TextView solsteps  =findViewById(R.id.solsteps);
        TextView anstxttf = findViewById(R.id.torftxt1);
        EditText ansed = findViewById(R.id.quissoul);
        Button checkbut = findViewById(R.id.chans);


        checkbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xxx = ansed.getText().toString().trim();
                if (xxx.isEmpty()) {
                    ansed.setError("You Must Enter a Solution to Check it.");
                    return;
                } else {
                    int x = Integer.parseInt(xxx);
                    if (x == quesans) {
                        anstxttf.setText("Your Answer = " + x + " " + getString(R.string.trueem));
                        anstxt1t.setText("Correct Answer = " + quesans + " " + getString(R.string.trueem));
                        Toast.makeText(geniusmathquestionsadapter.this,
                                "Great Your Answer is Correct  " + getString(R.string.trueem), Toast.LENGTH_LONG).show();
                    } else {
                        anstxttf.setText("Your Answer = " + x + " " + getString(R.string.falseem));
                        anstxt1t.setText("Correct Answer = " + quesans + " " + getString(R.string.trueem));
                        solsteps.setText("If you want to know the steps of the solution\n contact me from home page/info");
                        Toast.makeText(geniusmathquestionsadapter.this,
                                "Sorry Your Answer is Wrong, Try Again  " + getString(R.string.falseem), Toast.LENGTH_LONG).show();
                    }
                }
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