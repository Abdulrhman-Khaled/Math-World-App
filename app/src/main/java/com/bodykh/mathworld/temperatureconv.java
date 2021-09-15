package com.bodykh.mathworld;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class temperatureconv extends AppCompatActivity {
    private EditText celc, fahc, kelc, ranc;
    private String num1, num2, num3, num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatureconv);
        setTitle("Temperature Converter");
        celc = findViewById(R.id.celid);
        fahc = findViewById(R.id.fahid);
        kelc = findViewById(R.id.kelid);
        ranc = findViewById(R.id.ranid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        celc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num1 = celc.getText().toString().trim();
                if (celc.isFocused()) {
                    if (num1.length() > 0) {
                        celcioustoall();
                    } else {
                        fahc.setText("");
                        kelc.setText("");
                        ranc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        fahc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num2 = fahc.getText().toString().trim();
                if (fahc.isFocused()) {
                    if (num2.length() > 0) {
                        fahrenheittoall();
                    } else {
                        celc.setText("");
                        kelc.setText("");
                        ranc.setText("");
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        kelc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num3 = kelc.getText().toString().trim();
                if (kelc.isFocused()) {
                    if (num3.length() > 0) {
                        kelvintoall();
                    } else {
                        celc.setText("");
                        fahc.setText("");
                        ranc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        ranc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num4 = ranc.getText().toString().trim();
                if (ranc.isFocused()) {
                    if (num4.length() > 0) {
                        rankinetoall();
                    } else {
                        celc.setText("");
                        fahc.setText("");
                        kelc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


    private void celcioustoall() {

        try {
            double c2f = Double.parseDouble(num1);
            double c2k = Double.parseDouble(num1);
            double c2r = Double.parseDouble(num1);
            double xc, yc, zc;
            xc = 1.8 * c2f + 32;
            yc = c2k + 273.15;
            zc = c2r * 1.8 + 32 + 459.67;
            fahc.setText(String.valueOf(xc));
            kelc.setText(String.valueOf(yc));
            ranc.setText(String.valueOf(zc));
        } catch (NumberFormatException e) {
            fahc.setText("");
            kelc.setText("");
            ranc.setText("");
        }
    }

    private void fahrenheittoall() {
        try {
            double f2c = Double.parseDouble(num2);
            double f2k = Double.parseDouble(num2);
            double f2r = Double.parseDouble(num2);
            double xf, yf, zf;
            xf = 0.5555555556 * (f2c - 32);
            yf = (f2k + 459.67) / 1.8;
            zf = f2r + 459.67;
            celc.setText(String.valueOf(xf));
            kelc.setText(String.valueOf(yf));
            ranc.setText(String.valueOf(zf));
        } catch (NumberFormatException e) {
            celc.setText("");
            kelc.setText("");
            ranc.setText("");
        }
    }

    private void kelvintoall() {
        try {
            double k2c = Double.parseDouble(num3);
            double k2f = Double.parseDouble(num3);
            double k2r = Double.parseDouble(num3);
            double xk, yk, zk;
            xk = k2c - 273.15;
            yk = 1.8 * (k2f - 273.15) + 32;
            zk = k2r * 1.8;
            celc.setText(String.valueOf(xk));
            fahc.setText(String.valueOf(yk));
            ranc.setText(String.valueOf(zk));
        } catch (NumberFormatException e) {
            celc.setText("");
            fahc.setText("");
            ranc.setText("");
        }
    }

    private void rankinetoall() {
        try {
            double r2c = Double.parseDouble(num4);
            double r2f = Double.parseDouble(num4);
            double r2k = Double.parseDouble(num4);
            double xr, yr, zr;
            xr = (r2c - 32 - 459.67) / 1.8;
            yr = r2f - 459.67;
            zr = r2k / 1.8;
            celc.setText(String.valueOf(xr));
            fahc.setText(String.valueOf(yr));
            kelc.setText(String.valueOf(zr));
        } catch (NumberFormatException e) {
            celc.setText("");
            fahc.setText("");
            kelc.setText("");

        }
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