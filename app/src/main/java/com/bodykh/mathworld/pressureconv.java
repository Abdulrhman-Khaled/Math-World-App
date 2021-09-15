package com.bodykh.mathworld;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class pressureconv extends AppCompatActivity {

    private EditText atm, pas, bar, torr, psi, pofo;
    private String num1, num2, num3, num4, num5, num6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressureconv);
        setTitle("Pressure Converter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        atm = findViewById(R.id.atmid);
        pas = findViewById(R.id.pasid);
        bar = findViewById(R.id.barid);
        torr = findViewById(R.id.torrid);
        psi = findViewById(R.id.psiid);
        pofo = findViewById(R.id.pofoid);

        atm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num1 = atm.getText().toString().trim();
                if (atm.isFocused()) {
                    if (num1.length() > 0) {
                        atmospheretoall();
                    } else {
                        pas.setText("");
                        bar.setText("");
                        torr.setText("");
                        psi.setText("");
                        pofo.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        pas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num2 = pas.getText().toString().trim();
                if (pas.isFocused()) {
                    if (num2.length() > 0) {
                        pascaltoall();
                    } else {
                        atm.setText("");
                        bar.setText("");
                        torr.setText("");
                        psi.setText("");
                        pofo.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        bar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num3 = bar.getText().toString().trim();
                if (bar.isFocused()) {
                    if (num3.length() > 0) {
                        bartoall();
                    } else {
                        atm.setText("");
                        pas.setText("");
                        torr.setText("");
                        psi.setText("");
                        pofo.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        torr.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num4 = torr.getText().toString().trim();
                if (torr.isFocused()) {
                    if (num4.length() > 0) {
                        torrtoall();
                    } else {
                        atm.setText("");
                        pas.setText("");
                        bar.setText("");
                        psi.setText("");
                        pofo.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        psi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num5 = psi.getText().toString().trim();
                if (psi.isFocused()) {
                    if (num5.length() > 0) {
                        psitoall();
                    } else {
                        atm.setText("");
                        pas.setText("");
                        bar.setText("");
                        torr.setText("");
                        pofo.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        pofo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num6 = pofo.getText().toString().trim();
                if (pofo.isFocused()) {
                    if (num6.length() > 0) {
                        pofotoall();
                    } else {
                        atm.setText("");
                        pas.setText("");
                        bar.setText("");
                        torr.setText("");
                        psi.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void atmospheretoall() {
        try {
            double atm2pas = Double.parseDouble(num1);
            double atm2bar = Double.parseDouble(num1);
            double atm2torr = Double.parseDouble(num1);
            double atm2psi = Double.parseDouble(num1);
            double atm2pofo = Double.parseDouble(num1);
            double a1, b1, c1, d1, e1;
            a1 = atm2pas*101325 ;
            b1 = atm2bar*1.01325;
            c1 = atm2torr*760;
            d1 = atm2psi*14.6959;
            e1 = atm2pofo*2116.2166;
            pas.setText(String.valueOf(a1));
            bar.setText(String.valueOf(b1));
            torr.setText(String.valueOf(c1));
            psi.setText(String.valueOf(d1));
            pofo.setText(String.valueOf(e1));
        } catch (NumberFormatException e) {
            pas.setText("");
            bar.setText("");
            torr.setText("");
            psi.setText("");
            pofo.setText("");
        }
    }

    private void pascaltoall() {
        try {
            double pas2atm = Double.parseDouble(num2);
            double pas2bar = Double.parseDouble(num2);
            double pas2torr = Double.parseDouble(num2);
            double pas2psi = Double.parseDouble(num2);
            double pas2pofo = Double.parseDouble(num2);
            double a2, b2, c2, d2, e2;
            a2 = pas2atm*0.000009869;
            b2 = pas2bar*0.00001;
            c2 = pas2torr*0.0075;
            d2 = pas2psi*0.000145;
            e2 = pas2pofo*0.0209;
            atm.setText(String.valueOf(a2));
            bar.setText(String.valueOf(b2));
            torr.setText(String.valueOf(c2));
            psi.setText(String.valueOf(d2));
            pofo.setText(String.valueOf(e2));
        } catch (NumberFormatException e) {
            atm.setText("");
            bar.setText("");
            torr.setText("");
            psi.setText("");
            pofo.setText("");
        }
    }

    private void bartoall() {
        try {
            double bar2atm = Double.parseDouble(num3);
            double bar2pas = Double.parseDouble(num3);
            double bar2torr = Double.parseDouble(num3);
            double bar2psi = Double.parseDouble(num3);
            double bar2pofo = Double.parseDouble(num3);
            double a3, b3, c3, d3, e3;
            a3 = bar2atm*0.986923;
            b3 = bar2pas*100000;
            c3 = bar2torr*750.062;
            d3 = bar2psi*14.5038;
            e3 = bar2pofo*2088.5434;
            atm.setText(String.valueOf(a3));
            pas.setText(String.valueOf(b3));
            torr.setText(String.valueOf(c3));
            psi.setText(String.valueOf(d3));
            pofo.setText(String.valueOf(e3));
        } catch (NumberFormatException e) {
            atm.setText("");
            pas.setText("");
            torr.setText("");
            psi.setText("");
            pofo.setText("");
        }
    }

    private void torrtoall() {
        try {
            double torr2atm = Double.parseDouble(num4);
            double torr2pas = Double.parseDouble(num4);
            double torr2bar = Double.parseDouble(num4);
            double torr2psi = Double.parseDouble(num4);
            double torr2pofo = Double.parseDouble(num4);
            double a4, b4, c4, d4, e4;
            a4 = torr2atm*0.0013157894828062671;
            b4 = torr2pas*133.3224;
            c4 = torr2bar*0.0013332236890171486;
            d4 = torr2psi*0.0193;
            e4 = torr2pofo*2.7845;
            atm.setText(String.valueOf(a4));
            pas.setText(String.valueOf(b4));
            bar.setText(String.valueOf(c4));
            psi.setText(String.valueOf(d4));
            pofo.setText(String.valueOf(e4));
        } catch (NumberFormatException e) {
            atm.setText("");
            pas.setText("");
            bar.setText("");
            psi.setText("");
            pofo.setText("");
        }
    }

    private void psitoall() {
        try {
            double psi2atm = Double.parseDouble(num5);
            double psi2pas = Double.parseDouble(num5);
            double psi2bar = Double.parseDouble(num5);
            double psi2torr = Double.parseDouble(num5);
            double psi2pofo = Double.parseDouble(num5);
            double a5, b5, c5, d5, e5;
            a5 = psi2atm*0.068046;
            b5 = psi2pas*6894.76;
            c5 = psi2bar*0.0689476;
            d5 = psi2torr*51.715;
            e5 = psi2pofo*144;
            atm.setText(String.valueOf(a5));
            pas.setText(String.valueOf(b5));
            bar.setText(String.valueOf(c5));
            torr.setText(String.valueOf(d5));
            pofo.setText(String.valueOf(e5));
        } catch (NumberFormatException e) {
            atm.setText("");
            pas.setText("");
            bar.setText("");
            torr.setText("");
            pofo.setText("");
        }
    }

    private void pofotoall() {
        try {
            double pofo2atm = Double.parseDouble(num6);
            double pofo2pas = Double.parseDouble(num6);
            double pofo2bar = Double.parseDouble(num6);
            double pofo2torr = Double.parseDouble(num6);
            double pofo2psi = Double.parseDouble(num6);
            double a6, b6, c6, d6, e6;
            a6 = pofo2atm*0.00047254141671157956;
            b6 = pofo2pas*47.8803;
            c6 = pofo2bar*0.0004788025888897924;
            d6 = pofo2torr*0.3591;
            e6 = pofo2psi*0.0069444444445907446;
            atm.setText(String.valueOf(a6));
            pas.setText(String.valueOf(b6));
            bar.setText(String.valueOf(c6));
            torr.setText(String.valueOf(d6));
            psi.setText(String.valueOf(e6));
        } catch (NumberFormatException e) {
            atm.setText("");
            pas.setText("");
            bar.setText("");
            torr.setText("");
            psi.setText("");

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