package com.bodykh.mathworld;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class areaconv extends AppCompatActivity {

    private EditText acc, hec, scmc, smc, skmc, sfc, sinc, smic, syc;
    private String num1, num2, num3, num4, num5, num6, num7, num8, num9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaconv);
        acc = findViewById(R.id.acid);
        hec = findViewById(R.id.heid);
        scmc = findViewById(R.id.scmid);
        smc = findViewById(R.id.smid);
        skmc = findViewById(R.id.skmid);
        sfc = findViewById(R.id.sfid);
        sinc = findViewById(R.id.sinid);
        smic = findViewById(R.id.smiid);
        syc = findViewById(R.id.syid);
        setTitle("Area Converter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        acc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num1 = acc.getText().toString().trim();
                if (acc.isFocused()) {
                    if (num1.length() > 0) {
                        acretoall();
                    } else {
                        hec.setText("");
                        scmc.setText("");
                        smc.setText("");
                        skmc.setText("");
                        sfc.setText("");
                        sinc.setText("");
                        smic.setText("");
                        syc.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        hec.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num2 = hec.getText().toString().trim();
                if (hec.isFocused()) {
                    if (num2.length() > 0) {
                        hectaretoall();
                    } else {
                        acc.setText("");
                        scmc.setText("");
                        smc.setText("");
                        skmc.setText("");
                        sfc.setText("");
                        sinc.setText("");
                        smic.setText("");
                        syc.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        scmc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num3 = scmc.getText().toString().trim();
                if (scmc.isFocused()) {
                    if (num3.length() > 0) {
                        squarecmtoall();
                    } else {
                        acc.setText("");
                        hec.setText("");
                        smc.setText("");
                        skmc.setText("");
                        sfc.setText("");
                        sinc.setText("");
                        smic.setText("");
                        syc.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        smc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num4 = smc.getText().toString().trim();
                if (smc.isFocused()) {
                    if (num4.length() > 0) {
                        squaremtoall();
                    } else {
                        acc.setText("");
                        hec.setText("");
                        scmc.setText("");
                        skmc.setText("");
                        sfc.setText("");
                        sinc.setText("");
                        smic.setText("");
                        syc.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        skmc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num5 = skmc.getText().toString().trim();
                if (skmc.isFocused()) {
                    if (num5.length() > 0) {
                        squarekmtoall();
                    } else {
                        acc.setText("");
                        hec.setText("");
                        scmc.setText("");
                        smc.setText("");
                        sfc.setText("");
                        sinc.setText("");
                        smic.setText("");
                        syc.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        sfc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num6 = sfc.getText().toString().trim();
                if (sfc.isFocused()) {
                    if (num6.length() > 0) {
                        squareftoall();
                    } else {
                        acc.setText("");
                        hec.setText("");
                        scmc.setText("");
                        smc.setText("");
                        skmc.setText("");
                        sinc.setText("");
                        smic.setText("");
                        syc.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        sinc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num7 = sinc.getText().toString().trim();
                if (sinc.isFocused()) {
                    if (num7.length() > 0) {
                        squareintoall();
                    } else {
                        acc.setText("");
                        hec.setText("");
                        scmc.setText("");
                        smc.setText("");
                        skmc.setText("");
                        sfc.setText("");
                        smic.setText("");
                        syc.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        smic.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num8 = smic.getText().toString().trim();
                if (smic.isFocused()) {
                    if (num8.length() > 0) {
                        squaremitoall();
                    } else {
                        acc.setText("");
                        hec.setText("");
                        scmc.setText("");
                        smc.setText("");
                        skmc.setText("");
                        sfc.setText("");
                        sinc.setText("");
                        syc.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        syc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num9 = syc.getText().toString().trim();
                if (syc.isFocused()) {
                    if (num9.length() > 0) {
                        sqaureytoall();
                    } else {
                        acc.setText("");
                        hec.setText("");
                        scmc.setText("");
                        smc.setText("");
                        skmc.setText("");
                        sfc.setText("");
                        sinc.setText("");
                        smic.setText("");

                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void acretoall() {
        try {
            double ac2he = Double.parseDouble(num1);
            double ac2scm = Double.parseDouble(num1);
            double ac2sm = Double.parseDouble(num1);
            double ac2skm = Double.parseDouble(num1);
            double ac2sf = Double.parseDouble(num1);
            double ac2sin = Double.parseDouble(num1);
            double ac2smi = Double.parseDouble(num1);
            double ac2sy = Double.parseDouble(num1);
            double a1, b1, c1, d1, e1, f1, g1, h1;
            a1 = ac2he * 0.404686;
            b1 = ac2scm * 40468564.224;
            c1 = ac2sm * 4046.856422;
            d1 = ac2skm * 0.004046856422353576;
            e1 = ac2sf * 43560;
            f1 = ac2sin * 6272640;
            g1 = ac2smi * 0.0015625;
            h1 = ac2sy * 4840;
            hec.setText(String.valueOf(a1));
            scmc.setText(String.valueOf(b1));
            smc.setText(String.valueOf(c1));
            skmc.setText(String.valueOf(d1));
            sfc.setText(String.valueOf(e1));
            sinc.setText(String.valueOf(f1));
            smic.setText(String.valueOf(g1));
            syc.setText(String.valueOf(h1));
        } catch (NumberFormatException e) {
            hec.setText("");
            scmc.setText("");
            smc.setText("");
            skmc.setText("");
            sfc.setText("");
            sinc.setText("");
            smic.setText("");
            syc.setText("");
        }
    }

    private void hectaretoall() {
        try {
            double he2ac = Double.parseDouble(num2);
            double he2scm = Double.parseDouble(num2);
            double he2sm = Double.parseDouble(num2);
            double he2skm = Double.parseDouble(num2);
            double he2sf = Double.parseDouble(num2);
            double he2sin = Double.parseDouble(num2);
            double he2smi = Double.parseDouble(num2);
            double he2sy = Double.parseDouble(num2);
            double a2, b2, c2, d2, e2, f2, g2, h2;
            a2 = he2ac * 2.471054;
            b2 = he2scm * 100000000;
            c2 = he2sm * 10000;
            d2 = he2skm * 0.01;
            e2 = he2sf * 107639.10417;
            f2 = he2sin * 15500031;
            g2 = he2smi * 0.0038610215859253504;
            h2 = he2sy * 11959.900463;
            acc.setText(String.valueOf(a2));
            scmc.setText(String.valueOf(b2));
            smc.setText(String.valueOf(c2));
            skmc.setText(String.valueOf(d2));
            sfc.setText(String.valueOf(e2));
            sinc.setText(String.valueOf(f2));
            smic.setText(String.valueOf(g2));
            syc.setText(String.valueOf(h2));
        } catch (NumberFormatException e) {
            acc.setText("");
            scmc.setText("");
            smc.setText("");
            skmc.setText("");
            sfc.setText("");
            sinc.setText("");
            smic.setText("");
            syc.setText("");
        }
    }

    private void squarecmtoall() {
        try {
            double scm2ac = Double.parseDouble(num3);
            double scm2he = Double.parseDouble(num3);
            double scm2sm = Double.parseDouble(num3);
            double scm2skm = Double.parseDouble(num3);
            double scm2sf = Double.parseDouble(num3);
            double scm2sin = Double.parseDouble(num3);
            double scm2smi = Double.parseDouble(num3);
            double scm2sy = Double.parseDouble(num3);
            double a3, b3, c3, d3, e3, f3, g3, h3;
            a3 = scm2ac / 40468564.224;
            b3 = scm2he / 100000000;
            c3 = scm2sm * 0.0001;
            d3 = scm2skm * 0.0000000001;
            e3 = scm2sf * 0.0010763910416709723;
            f3 = scm2sin * 0.155;
            g3 = scm2smi * 0.000000000038610215854781256;
            h3 = scm2sy * 0.00011959900463010801;
            acc.setText(String.valueOf(a3));
            hec.setText(String.valueOf(b3));
            smc.setText(String.valueOf(c3));
            skmc.setText(String.valueOf(d3));
            sfc.setText(String.valueOf(e3));
            sinc.setText(String.valueOf(f3));
            smic.setText(String.valueOf(g3));
            syc.setText(String.valueOf(h3));
        } catch (NumberFormatException e) {
            acc.setText("");
            hec.setText("");
            smc.setText("");
            skmc.setText("");
            sfc.setText("");
            sinc.setText("");
            smic.setText("");
            syc.setText("");
        }
    }

    private void squaremtoall() {
        try {
            double sm2ac = Double.parseDouble(num4);
            double sm2he = Double.parseDouble(num4);
            double sm2scm = Double.parseDouble(num4);
            double sm2skm = Double.parseDouble(num4);
            double sm2sf = Double.parseDouble(num4);
            double sm2sin = Double.parseDouble(num4);
            double sm2smi = Double.parseDouble(num4);
            double sm2sy = Double.parseDouble(num4);
            double a4, b4, c4, d4, e4, f4, g4, h4;
            a4 = sm2ac * 0.0002471053814671653;
            b4 = sm2he * 0.0001;
            c4 = sm2scm * 10000;
            d4 = sm2skm * 0.000001;
            e4 = sm2sf * 10.76391;
            f4 = sm2sin * 1550;
            g4 = sm2smi * 0.00000038610215854781257;
            h4 = sm2sy * 1.19599;
            acc.setText(String.valueOf(a4));
            hec.setText(String.valueOf(b4));
            scmc.setText(String.valueOf(c4));
            skmc.setText(String.valueOf(d4));
            sfc.setText(String.valueOf(e4));
            sinc.setText(String.valueOf(f4));
            smic.setText(String.valueOf(g4));
            syc.setText(String.valueOf(h4));
        } catch (NumberFormatException e) {
            acc.setText("");
            hec.setText("");
            scmc.setText("");
            skmc.setText("");
            sfc.setText("");
            sinc.setText("");
            smic.setText("");
            syc.setText("");
        }
    }

    private void squarekmtoall() {
        try {
            double skm2ac = Double.parseDouble(num5);
            double skm2he = Double.parseDouble(num5);
            double skm2scm = Double.parseDouble(num5);
            double skm2sm = Double.parseDouble(num5);
            double skm2sf = Double.parseDouble(num5);
            double skm2sin = Double.parseDouble(num5);
            double skm2smi = Double.parseDouble(num5);
            double skm2sy = Double.parseDouble(num5);
            double a5, b5, c5, d5, e5, f5, g5, h5;
            a5 = skm2ac * 247.105381;
            b5 = skm2he * 100;
            c5 = skm2scm / 0.0000000001;
            d5 = skm2sm * 1000000;
            e5 = skm2sf * 10763910.417;
            f5 = skm2sin * 1550003100;
            g5 = skm2smi * 0.386102;
            h5 = skm2sy * 1195990.0463;
            acc.setText(String.valueOf(a5));
            hec.setText(String.valueOf(b5));
            scmc.setText(String.valueOf(c5));
            smc.setText(String.valueOf(d5));
            sfc.setText(String.valueOf(e5));
            sinc.setText(String.valueOf(f5));
            smic.setText(String.valueOf(g5));
            syc.setText(String.valueOf(h5));
        } catch (NumberFormatException e) {
            acc.setText("");
            hec.setText("");
            scmc.setText("");
            smc.setText("");
            sfc.setText("");
            sinc.setText("");
            smic.setText("");
            syc.setText("");
        }
    }

    private void squareftoall() {
        try {
            double sf2ac = Double.parseDouble(num6);
            double sf2he = Double.parseDouble(num6);
            double sf2scm = Double.parseDouble(num6);
            double sf2sm = Double.parseDouble(num6);
            double sf2skm = Double.parseDouble(num6);
            double sf2sin = Double.parseDouble(num6);
            double sf2smi = Double.parseDouble(num6);
            double sf2sy = Double.parseDouble(num6);
            double a6, b6, c6, d6, e6, f6, g6, h6;
            a6 = sf2ac * 0.00002295684113865932;
            b6 = sf2he * 0.000009290303999749462;
            c6 = sf2scm * 929.0304;
            d6 = sf2sm * 0.092903;
            e6 = sf2skm * 0.00000009290303999749463;
            f6 = sf2sin * 144;
            g6 = sf2smi * 0.00000003587006427915519;
            h6 = sf2sy * 0.111111;
            acc.setText(String.valueOf(a6));
            hec.setText(String.valueOf(b6));
            scmc.setText(String.valueOf(c6));
            smc.setText(String.valueOf(d6));
            skmc.setText(String.valueOf(e6));
            sinc.setText(String.valueOf(f6));
            smic.setText(String.valueOf(g6));
            syc.setText(String.valueOf(h6));
        } catch (NumberFormatException e) {
            acc.setText("");
            hec.setText("");
            scmc.setText("");
            smc.setText("");
            skmc.setText("");
            sinc.setText("");
            smic.setText("");
            syc.setText("");
        }
    }

    private void squareintoall() {
        try {
            double sin2ac = Double.parseDouble(num7);
            double sin2he = Double.parseDouble(num7);
            double sin2scm = Double.parseDouble(num7);
            double sin2sm = Double.parseDouble(num7);
            double sin2skm = Double.parseDouble(num7);
            double sin2sf = Double.parseDouble(num7);
            double sin2smi = Double.parseDouble(num7);
            double sin2sy = Double.parseDouble(num7);
            double a7, b7, c7, d7, e7, f7, g7, h7;
            a7 = sin2ac * 0.00000015942250790735638;
            b7 = sin2he * 0.00000006451599999925991;
            c7 = sin2scm * 6.4516;
            d7 = sin2sm * 0.0006451600000025807;
            e7 = sin2skm * 0.0000000006451599999925991;
            f7 = sin2sf * 0.006944444444444444;
            g7 = sin2smi * 0.0000000002490976686347024;
            h7 = sin2sy * 0.0007716049382716049;
            acc.setText(String.valueOf(a7));
            hec.setText(String.valueOf(b7));
            scmc.setText(String.valueOf(c7));
            smc.setText(String.valueOf(d7));
            skmc.setText(String.valueOf(e7));
            sfc.setText(String.valueOf(f7));
            smic.setText(String.valueOf(g7));
            syc.setText(String.valueOf(h7));
        } catch (NumberFormatException e) {
            acc.setText("");
            hec.setText("");
            scmc.setText("");
            smc.setText("");
            skmc.setText("");
            sfc.setText("");
            smic.setText("");
            syc.setText("");
        }
    }

    private void squaremitoall() {
        try {
            double smi2ac = Double.parseDouble(num8);
            double smi2he = Double.parseDouble(num8);
            double smi2scm = Double.parseDouble(num8);
            double smi2sm = Double.parseDouble(num8);
            double smi2skm = Double.parseDouble(num8);
            double smi2sf = Double.parseDouble(num8);
            double smi2sin = Double.parseDouble(num8);
            double smi2sy = Double.parseDouble(num8);
            double a8, b8, c8, d8, e8, f8, g8, h8;
            a8 = smi2ac * 640;
            b8 = smi2he * 259;
            c8 = smi2scm / 0.000000000038610215854781256;
            d8 = smi2sm * 2589988.1103;
            e8 = smi2skm * 2.589988;
            f8 = smi2sf * 27878400;
            g8 = smi2sin * 4014489599.9;
            h8 = smi2sy * 3097600;
            acc.setText(String.valueOf(a8));
            hec.setText(String.valueOf(b8));
            scmc.setText(String.valueOf(c8));
            smc.setText(String.valueOf(d8));
            skmc.setText(String.valueOf(e8));
            sfc.setText(String.valueOf(f8));
            sinc.setText(String.valueOf(g8));
            syc.setText(String.valueOf(h8));
        } catch (NumberFormatException e) {
            acc.setText("");
            hec.setText("");
            scmc.setText("");
            smc.setText("");
            skmc.setText("");
            sfc.setText("");
            sinc.setText("");
            syc.setText("");
        }
    }

    private void sqaureytoall() {
        try {
            double sy2ac = Double.parseDouble(num9);
            double sy2he = Double.parseDouble(num9);
            double sy2scm = Double.parseDouble(num9);
            double sy2sm = Double.parseDouble(num9);
            double sy2skm = Double.parseDouble(num9);
            double sy2sf = Double.parseDouble(num9);
            double sy2sin = Double.parseDouble(num9);
            double sy2smi = Double.parseDouble(num9);
            double a9, b9, c9, d9, e9, f9, g9, h9;
            a9 = sy2ac * 0.00020661157024793388;
            b9 = sy2he * 0.00008361273600007553;
            c9 = sy2scm * 8361.2736;
            d9 = sy2sm * 0.836127;
            e9 = sy2skm * 0.000000836127359891529;
            f9 = sy2sf * 9;
            g9 = sy2sin * 1296;
            h9 = sy2smi * 0.0000003228305785123967;
            acc.setText(String.valueOf(a9));
            hec.setText(String.valueOf(b9));
            scmc.setText(String.valueOf(c9));
            smc.setText(String.valueOf(d9));
            skmc.setText(String.valueOf(e9));
            sfc.setText(String.valueOf(f9));
            sinc.setText(String.valueOf(g9));
            smic.setText(String.valueOf(h9));
        } catch (NumberFormatException e) {
            acc.setText("");
            hec.setText("");
            scmc.setText("");
            smc.setText("");
            skmc.setText("");
            sfc.setText("");
            sinc.setText("");
            smic.setText("");
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