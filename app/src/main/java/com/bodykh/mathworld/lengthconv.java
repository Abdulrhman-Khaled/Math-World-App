package com.bodykh.mathworld;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class lengthconv extends AppCompatActivity {

    private EditText mmc, cmc, mc, kmc, inc, fc, mic, yc;
    private String num1, num2, num3, num4, num5, num6, num7, num8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lengthconv);
        setTitle("Length Converter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mmc = findViewById(R.id.mmid);
        cmc = findViewById(R.id.cmid);
        mc = findViewById(R.id.mid);
        kmc = findViewById(R.id.kmid);
        inc = findViewById(R.id.inid);
        fc = findViewById(R.id.fid);
        mic = findViewById(R.id.miid);
        yc = findViewById(R.id.yid);
        mmc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num1 = mmc.getText().toString().trim();
                if (mmc.isFocused()) {
                    if (num1.length() > 0) {
                        militoall();
                    } else {
                        cmc.setText("");
                        mc.setText("");
                        kmc.setText("");
                        inc.setText("");
                        fc.setText("");
                        mic.setText("");
                        yc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        //////////////////////////////////////////////////////////////
        cmc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num2 = cmc.getText().toString().trim();
                if (cmc.isFocused()) {
                    if (num2.length() > 0) {
                        centitoall();
                    } else {
                        mmc.setText("");
                        mc.setText("");
                        kmc.setText("");
                        inc.setText("");
                        fc.setText("");
                        mic.setText("");
                        yc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        ///////////////////////////////////////////////////////////////
        mc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num3 = mc.getText().toString().trim();
                if (mc.isFocused()) {
                    if (num3.length() > 0) {
                        metertoall();
                    } else {
                        mmc.setText("");
                        cmc.setText("");
                        kmc.setText("");
                        inc.setText("");
                        fc.setText("");
                        mic.setText("");
                        yc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        ////////////////////////////////////////////////////////
        kmc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num4 = kmc.getText().toString().trim();
                if (kmc.isFocused()) {
                    if (num4.length() > 0) {
                        kilotoall();
                    } else {
                        mmc.setText("");
                        cmc.setText("");
                        mc.setText("");
                        inc.setText("");
                        fc.setText("");
                        mic.setText("");
                        yc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        ////////////////////////////////////////////////////////////////////
        inc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num5 = inc.getText().toString().trim();
                if (inc.isFocused()) {
                    if (num5.length() > 0) {
                        inchtoall();
                    } else {
                        mmc.setText("");
                        cmc.setText("");
                        mc.setText("");
                        kmc.setText("");
                        fc.setText("");
                        mic.setText("");
                        yc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        //////////////////////////////////////////////////////////////////////////
        fc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num6 = fc.getText().toString().trim();
                if (fc.isFocused()) {
                    if (num6.length() > 0) {
                        foottoall();
                    } else {
                        mmc.setText("");
                        cmc.setText("");
                        mc.setText("");
                        kmc.setText("");
                        inc.setText("");
                        mic.setText("");
                        yc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        ////////////////////////////////////////////////////////////////////////////
        mic.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num7 = mic.getText().toString().trim();
                if (mic.isFocused()) {
                    if (num7.length() > 0) {
                        miletoall();
                    } else {
                        mmc.setText("");
                        cmc.setText("");
                        mc.setText("");
                        kmc.setText("");
                        inc.setText("");
                        fc.setText("");
                        yc.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        //////////////////////////////////////////////////////////////////////////////
        yc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num8 = yc.getText().toString().trim();
                if (yc.isFocused()) {
                    if (num8.length() > 0) {
                        yardtoall();
                    } else {
                        mmc.setText("");
                        cmc.setText("");
                        mc.setText("");
                        kmc.setText("");
                        inc.setText("");
                        fc.setText("");
                        mic.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private void militoall() {
        try {
            double mili2c = Double.parseDouble(num1);
            double mili2m = Double.parseDouble(num1);
            double mili2k = Double.parseDouble(num1);
            double mili2i = Double.parseDouble(num1);
            double mili2f = Double.parseDouble(num1);
            double mili2mi = Double.parseDouble(num1);
            double mili2y = Double.parseDouble(num1);
            double a1, b1, c1, d1, e1, f1, g1;
            a1 = mili2c / 10;
            b1 = mili2m / 1000;
            c1 = mili2k / 100000;
            d1 = mili2i / 25.4;
            e1 = mili2f / 304.8;
            f1 = mili2mi / (160934.4 * 10);
            g1 = mili2y / (91.44 * 10);
            cmc.setText(String.valueOf(a1));
            mc.setText(String.valueOf(b1));
            kmc.setText(String.valueOf(c1));
            inc.setText(String.valueOf(d1));
            fc.setText(String.valueOf(e1));
            mic.setText(String.valueOf(f1));
            yc.setText(String.valueOf(g1));
        } catch (NumberFormatException e) {
            cmc.setText("");
            mc.setText("");
            kmc.setText("");
            inc.setText("");
            fc.setText("");
            mic.setText("");
            yc.setText("");
        }
    }

    private void centitoall() {
        try {
            double cm2mm = Double.parseDouble(num2);
            double cm2m = Double.parseDouble(num2);
            double cm2k = Double.parseDouble(num2);
            double cm2i = Double.parseDouble(num2);
            double cm2f = Double.parseDouble(num2);
            double cm2mi = Double.parseDouble(num2);
            double cm2y = Double.parseDouble(num2);
            double a2, b2, c2, d2, e2, f2, g2;
            a2 = cm2mm * 10;
            b2 = cm2m / 100;
            c2 = cm2k / (100 * 1000);
            d2 = cm2i * 0.39370079;
            e2 = cm2f / 30.48;
            f2 = cm2mi / 160934.4;
            g2 = cm2y / 91.44;
            mmc.setText(String.valueOf(a2));
            mc.setText(String.valueOf(b2));
            kmc.setText(String.valueOf(c2));
            inc.setText(String.valueOf(d2));
            fc.setText(String.valueOf(e2));
            mic.setText(String.valueOf(f2));
            yc.setText(String.valueOf(g2));
        } catch (NumberFormatException e) {
            mmc.setText("");
            mc.setText("");
            kmc.setText("");
            inc.setText("");
            fc.setText("");
            mic.setText("");
            yc.setText("");
        }
    }

    private void metertoall() {
        try {
            double m2mm = Double.parseDouble(num3);
            double m2cm = Double.parseDouble(num3);
            double m2k = Double.parseDouble(num3);
            double m2i = Double.parseDouble(num3);
            double m2f = Double.parseDouble(num3);
            double m2mi = Double.parseDouble(num3);
            double m2y = Double.parseDouble(num3);
            double a3, b3, c3, d3, e3, f3, g3;
            a3 = m2mm * 1000;
            b3 = m2cm * 100;
            c3 = m2k / 1000;
            d3 = m2i * 39.3700787;
            e3 = m2f * 3.280839895;
            f3 = m2mi * 0.0006213711922373339;
            g3 = m2y * 1.0936133;
            mmc.setText(String.valueOf(a3));
            cmc.setText(String.valueOf(b3));
            kmc.setText(String.valueOf(c3));
            inc.setText(String.valueOf(d3));
            fc.setText(String.valueOf(e3));
            mic.setText(String.valueOf(f3));
            yc.setText(String.valueOf(g3));
        } catch (NumberFormatException e) {
            mmc.setText("");
            cmc.setText("");
            kmc.setText("");
            inc.setText("");
            fc.setText("");
            mic.setText("");
            yc.setText("");
        }
    }

    private void kilotoall() {
        try {
            double k2mm = Double.parseDouble(num4);
            double k2cm = Double.parseDouble(num4);
            double k2m = Double.parseDouble(num4);
            double k2i = Double.parseDouble(num4);
            double k2f = Double.parseDouble(num4);
            double k2mi = Double.parseDouble(num4);
            double k2y = Double.parseDouble(num4);
            double a4, b4, c4, d4, e4, f4, g4;
            a4 = k2mm*1000000;
            b4 = k2cm*100000;
            c4 = k2m*1000;
            d4 = k2i*39370.0787;
            e4 = k2f*3280.839892;
            f4 = k2mi*0.621371192;
            g4 = k2y*1093.6133;
            mmc.setText(String.valueOf(a4));
            cmc.setText(String.valueOf(b4));
            mc.setText(String.valueOf(c4));
            inc.setText(String.valueOf(d4));
            fc.setText(String.valueOf(e4));
            mic.setText(String.valueOf(f4));
            yc.setText(String.valueOf(g4));
        } catch (NumberFormatException e) {
            mmc.setText("");
            cmc.setText("");
            mc.setText("");
            inc.setText("");
            fc.setText("");
            mic.setText("");
            yc.setText("");
        }
    }

    private void inchtoall() {
        try {
            double in2mm = Double.parseDouble(num5);
            double in2cm = Double.parseDouble(num5);
            double in2m = Double.parseDouble(num5);
            double in2k = Double.parseDouble(num5);
            double in2f = Double.parseDouble(num5);
            double in2mi = Double.parseDouble(num5);
            double in2y = Double.parseDouble(num5);
            double a5, b5, c5, d5, e5, f5, g5;
            a5 = in2mm*25.4;
            b5 = in2cm*2.54;
            c5 = in2m*0.0254;
            d5 = in2k*0.000025400000025908;
            e5 = in2f*0.083333;
            f5 = in2mi*0.000015782828282828283;
            g5 = in2y*0.027778;
            mmc.setText(String.valueOf(a5));
            cmc.setText(String.valueOf(b5));
            mc.setText(String.valueOf(c5));
            kmc.setText(String.valueOf(d5));
            fc.setText(String.valueOf(e5));
            mic.setText(String.valueOf(f5));
            yc.setText(String.valueOf(g5));
        } catch (NumberFormatException e) {
            mmc.setText("");
            cmc.setText("");
            mc.setText("");
            kmc.setText("");
            fc.setText("");
            mic.setText("");
            yc.setText("");
        }
    }

    private void foottoall() {
            try {
                double f2mm = Double.parseDouble(num6);
                double f2cm = Double.parseDouble(num6);
                double f2m = Double.parseDouble(num6);
                double f2k = Double.parseDouble(num6);
                double f2in = Double.parseDouble(num6);
                double f2mi = Double.parseDouble(num6);
                double f2y = Double.parseDouble(num6);
                double a6, b6, c6, d6, e6, f6, g6;
                a6 = f2mm*304.88;
                b6 = f2cm*30.48;
                c6 = f2m*0.3048;
                d6 = f2k*0.00030480000000121917;
                e6 = f2in*12;
                f6 = f2mi*0.0001893939393939394;
                g6 = f2y*0.333333333;
                mmc.setText(String.valueOf(a6));
                cmc.setText(String.valueOf(b6));
                mc.setText(String.valueOf(c6));
                kmc.setText(String.valueOf(d6));
                inc.setText(String.valueOf(e6));
                mic.setText(String.valueOf(f6));
                yc.setText(String.valueOf(g6));
            } catch (NumberFormatException e) {
                mmc.setText("");
                cmc.setText("");
                mc.setText("");
                kmc.setText("");
                inc.setText("");
                mic.setText("");
                yc.setText("");
            }
    }

    private void miletoall() {
        try {
            double mi2mm = Double.parseDouble(num7);
            double mi2cm = Double.parseDouble(num7);
            double mi2m = Double.parseDouble(num7);
            double mi2k = Double.parseDouble(num7);
            double mi2in = Double.parseDouble(num7);
            double mi2f = Double.parseDouble(num7);
            double mi2y = Double.parseDouble(num7);
            double a7, b7, c7, d7, e7, f7, g7;
            a7 = mi2mm*1609344;
            b7 = mi2cm*160934.4;
            c7 = mi2m*1609.344;
            d7 = mi2k*1.609344;
            e7 = mi2in*63360;
            f7 = mi2f*5280;
            g7 = mi2y*1760;
            mmc.setText(String.valueOf(a7));
            cmc.setText(String.valueOf(b7));
            mc.setText(String.valueOf(c7));
            kmc.setText(String.valueOf(d7));
            inc.setText(String.valueOf(e7));
            fc.setText(String.valueOf(f7));
            yc.setText(String.valueOf(g7));
        } catch (NumberFormatException e) {
            mmc.setText("");
            cmc.setText("");
            mc.setText("");
            kmc.setText("");
            inc.setText("");
            fc.setText("");
            yc.setText("");
        }
    }

    private void yardtoall() {
        try {
            double y2mm = Double.parseDouble(num8);
            double y2cm = Double.parseDouble(num8);
            double y2m = Double.parseDouble(num8);
            double y2k = Double.parseDouble(num8);
            double y2in = Double.parseDouble(num8);
            double y2f = Double.parseDouble(num8);
            double y2mi = Double.parseDouble(num8);
            double a8, b8, c8, d8, e8, f8, g8;
            a8 = y2mm*914.4;
            b8 = y2cm*91.44;
            c8 = y2m*0.9144;
            d8 = y2k*0.0009144000000315285;
            e8 = y2in*36;
            f8 = y2f*3;
            g8 = y2mi*0.0005681818181818182;
            mmc.setText(String.valueOf(a8));
            cmc.setText(String.valueOf(b8));
            mc.setText(String.valueOf(c8));
            kmc.setText(String.valueOf(d8));
            inc.setText(String.valueOf(e8));
            fc.setText(String.valueOf(f8));
            mic.setText(String.valueOf(g8));
        } catch (NumberFormatException e) {
            mmc.setText("");
            cmc.setText("");
            mc.setText("");
            kmc.setText("");
            inc.setText("");
            fc.setText("");
            mic.setText("");
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


