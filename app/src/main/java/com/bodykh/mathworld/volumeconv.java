package com.bodykh.mathworld;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class volumeconv extends AppCompatActivity {

    private EditText ob, uslg, img, lit, milit, cf, ci, cm, ccm;
    private String num1, num2, num3, num4, num5, num6, num7, num8, num9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumeconv);
        ob = findViewById(R.id.obid);
        uslg = findViewById(R.id.uslgid);
        img = findViewById(R.id.imgid);
        lit = findViewById(R.id.litid);
        milit = findViewById(R.id.militid);
        cf = findViewById(R.id.cfid);
        ci = findViewById(R.id.ciid);
        cm = findViewById(R.id.cmid);
        ccm = findViewById(R.id.ccmid);
        setTitle("Volume Converter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ob.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num1 = ob.getText().toString().trim();
                if (ob.isFocused()) {
                    if (num1.length() > 0) {
                        oilbareeltoall();
                    } else {
                        uslg.setText("");
                        img.setText("");
                        lit.setText("");
                        milit.setText("");
                        cf.setText("");
                        ci.setText("");
                        cm.setText("");
                        ccm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        uslg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num2 = uslg.getText().toString().trim();
                if (uslg.isFocused()) {
                    if (num2.length() > 0) {
                        Usgallontoall();
                    } else {
                        ob.setText("");
                        img.setText("");
                        lit.setText("");
                        milit.setText("");
                        cf.setText("");
                        ci.setText("");
                        cm.setText("");
                        ccm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        img.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num3 = img.getText().toString().trim();
                if (img.isFocused()) {
                    if (num3.length() > 0) {
                        imperialgallontoall();
                    } else {
                        ob.setText("");
                        uslg.setText("");
                        lit.setText("");
                        milit.setText("");
                        cf.setText("");
                        ci.setText("");
                        cm.setText("");
                        ccm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        lit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num4 = lit.getText().toString().trim();
                if (lit.isFocused()) {
                    if (num4.length() > 0) {
                        litertoall();
                    } else {
                        ob.setText("");
                        uslg.setText("");
                        img.setText("");
                        milit.setText("");
                        cf.setText("");
                        ci.setText("");
                        cm.setText("");
                        ccm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        milit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num5 = milit.getText().toString().trim();
                if (milit.isFocused()) {
                    if (num5.length() > 0) {
                        mililitertoall();
                    } else {
                        ob.setText("");
                        uslg.setText("");
                        img.setText("");
                        lit.setText("");
                        cf.setText("");
                        ci.setText("");
                        cm.setText("");
                        ccm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        cf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num6 = cf.getText().toString().trim();
                if (cf.isFocused()) {
                    if (num6.length() > 0) {
                        cuibicfeettoall();
                    } else {
                        ob.setText("");
                        uslg.setText("");
                        img.setText("");
                        lit.setText("");
                        milit.setText("");
                        ci.setText("");
                        cm.setText("");
                        ccm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        ci.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num7 = ci.getText().toString().trim();
                if (ci.isFocused()) {
                    if (num7.length() > 0) {
                        cuibicinchtoall();
                    } else {
                        ob.setText("");
                        uslg.setText("");
                        img.setText("");
                        lit.setText("");
                        milit.setText("");
                        cf.setText("");
                        cm.setText("");
                        ccm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        cm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num8 = cm.getText().toString().trim();
                if (cm.isFocused()) {
                    if (num8.length() > 0) {
                        cuibicmetertoall();
                    } else {
                        ob.setText("");
                        uslg.setText("");
                        img.setText("");
                        lit.setText("");
                        milit.setText("");
                        cf.setText("");
                        ci.setText("");
                        ccm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        ccm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num9 = ccm.getText().toString().trim();
                if (ccm.isFocused()) {
                    if (num9.length() > 0) {
                        cuibiccentimetertoall();
                    } else {
                        ob.setText("");
                        uslg.setText("");
                        img.setText("");
                        lit.setText("");
                        milit.setText("");
                        cf.setText("");
                        ci.setText("");
                        cm.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void oilbareeltoall() {
        try {
            double ob2uslg = Double.parseDouble(num1);
            double ob2img = Double.parseDouble(num1);
            double ob2lit = Double.parseDouble(num1);
            double ob2milit = Double.parseDouble(num1);
            double ob2cf = Double.parseDouble(num1);
            double ob2ci = Double.parseDouble(num1);
            double ob2cm = Double.parseDouble(num1);
            double ob2ccm = Double.parseDouble(num1);
            double a1, b1, c1, d1, e1, f1, g1, h1;
            a1 = ob2uslg * 42;
            b1 = ob2img * 34.9723013;
            c1 = ob2lit * 158.9873;
            d1 = ob2milit * 158987.2949;
            e1 = ob2cf * 5.6146;
            f1 = ob2ci * 9702;
            g1 = ob2cm * 0.159;
            h1 = ob2ccm * 158987.2949;
            uslg.setText(String.valueOf(a1));
            img.setText(String.valueOf(b1));
            lit.setText(String.valueOf(c1));
            milit.setText(String.valueOf(d1));
            cf.setText(String.valueOf(e1));
            ci.setText(String.valueOf(f1));
            cm.setText(String.valueOf(g1));
            ccm.setText(String.valueOf(h1));
        } catch (NumberFormatException e) {
            uslg.setText("");
            img.setText("");
            lit.setText("");
            milit.setText("");
            cf.setText("");
            ci.setText("");
            cm.setText("");
            ccm.setText("");
        }
    }

    private void Usgallontoall() {
        try {
            double uslg2ob = Double.parseDouble(num2);
            double uslg2img = Double.parseDouble(num2);
            double uslg2lit = Double.parseDouble(num2);
            double uslg2milit = Double.parseDouble(num2);
            double uslg2cf = Double.parseDouble(num2);
            double uslg2ci = Double.parseDouble(num2);
            double uslg2cm = Double.parseDouble(num2);
            double uslg2ccm = Double.parseDouble(num2);
            double a2, b2, c2, d2, e2, f2, g2, h2;
            a2 = uslg2ob * 0.0238;
            b2 = uslg2img * 0.83267384;
            c2 = uslg2lit * 3.7854;
            d2 = uslg2milit * 3785.4118;
            e2 = uslg2cf * 0.1337;
            f2 = uslg2ci * 231;
            g2 = uslg2cm * 0.003785411784;
            h2 = uslg2ccm * 3785.41178;
            ob.setText(String.valueOf(a2));
            img.setText(String.valueOf(b2));
            lit.setText(String.valueOf(c2));
            milit.setText(String.valueOf(d2));
            cf.setText(String.valueOf(e2));
            ci.setText(String.valueOf(f2));
            cm.setText(String.valueOf(g2));
            ccm.setText(String.valueOf(h2));

        } catch (NumberFormatException e) {
            ob.setText("");
            img.setText("");
            lit.setText("");
            milit.setText("");
            cf.setText("");
            ci.setText("");
            cm.setText("");
            ccm.setText("");
        }
    }

    private void imperialgallontoall() {
        try {
            double img2ob = Double.parseDouble(num3);
            double img2uslg = Double.parseDouble(num3);
            double ing2lit = Double.parseDouble(num3);
            double img2milit = Double.parseDouble(num3);
            double img2cf = Double.parseDouble(num3);
            double img2ci = Double.parseDouble(num3);
            double img2cm = Double.parseDouble(num3);
            double img2ccm = Double.parseDouble(num3);
            double a3, b3, c3, d3, e3, f3, g3, h3;
            a3 = img2ob * 0.0285940577;
            b3 = img2uslg * 1.20095042;
            c3 = ing2lit * 4.54609188;
            d3 = img2milit * 4546.09188;
            e3 = img2cf * 0.16054372;
            f3 = img2ci * 277.419547;
            g3 = img2cm * 0.00454609188;
            h3 = img2ccm * 4546.09188;
            ob.setText(String.valueOf(a3));
            uslg.setText(String.valueOf(b3));
            lit.setText(String.valueOf(c3));
            milit.setText(String.valueOf(d3));
            cf.setText(String.valueOf(e3));
            ci.setText(String.valueOf(f3));
            cm.setText(String.valueOf(g3));
            ccm.setText(String.valueOf(h3));

        } catch (NumberFormatException e) {
            ob.setText("");
            uslg.setText("");
            lit.setText("");
            milit.setText("");
            cf.setText("");
            ci.setText("");
            cm.setText("");
            ccm.setText("");
        }
    }

    private void litertoall() {
        try {
            double lit2ob = Double.parseDouble(num4);
            double lit2uslg = Double.parseDouble(num4);
            double lit2img = Double.parseDouble(num4);
            double litg2milit = Double.parseDouble(num4);
            double lit2cf = Double.parseDouble(num4);
            double lit2ci = Double.parseDouble(num4);
            double lit2cm = Double.parseDouble(num4);
            double lit2ccm = Double.parseDouble(num4);
            double a4, b4, c4, d4, e4, f4, g4, h4;
            a4 = lit2ob * 0.006289810770343578;
            b4 = lit2uslg * 0.2642;
            c4 = lit2img * 0.219969157;
            d4 = litg2milit * 1000;
            e4 = lit2cf * 0.0353;
            f4 = lit2ci * 61.0237;
            g4 = lit2cm * 0.001;
            h4 = lit2ccm * 1000;
            ob.setText(String.valueOf(a4));
            uslg.setText(String.valueOf(b4));
            img.setText(String.valueOf(c4));
            milit.setText(String.valueOf(d4));
            cf.setText(String.valueOf(e4));
            ci.setText(String.valueOf(f4));
            cm.setText(String.valueOf(g4));
            ccm.setText(String.valueOf(h4));

        } catch (NumberFormatException e) {
            ob.setText("");
            uslg.setText("");
            img.setText("");
            milit.setText("");
            cf.setText("");
            ci.setText("");
            cm.setText("");
            ccm.setText("");
        }
    }

    private void mililitertoall() {
        try {
            double milit2ob = Double.parseDouble(num5);
            double milit2uslg = Double.parseDouble(num5);
            double milit2img = Double.parseDouble(num5);
            double milit2lit = Double.parseDouble(num5);
            double milit2cf = Double.parseDouble(num5);
            double milit2ci = Double.parseDouble(num5);
            double milit2cm = Double.parseDouble(num5);
            double milit2ccm = Double.parseDouble(num5);
            double a5, b5, c5, d5, e5, f5, g5, h5;
            a5 = milit2ob * 0.000006289810770343578;
            b5 = milit2uslg * 0.00026417205236024203;
            c5 = milit2img * 0.000219969157;
            d5 = milit2lit * 0.001;
            e5 = milit2cf * 0.00003531466672217647;
            f5 = milit2ci * 0.061;
            g5 = milit2cm * 0.0000010000000000079252;
            h5 = milit2ccm * 1;
            ob.setText(String.valueOf(a5));
            uslg.setText(String.valueOf(b5));
            img.setText(String.valueOf(c5));
            lit.setText(String.valueOf(d5));
            cf.setText(String.valueOf(e5));
            ci.setText(String.valueOf(f5));
            cm.setText(String.valueOf(g5));
            ccm.setText(String.valueOf(h5));

        } catch (NumberFormatException e) {
            ob.setText("");
            uslg.setText("");
            img.setText("");
            lit.setText("");
            cf.setText("");
            ci.setText("");
            cm.setText("");
            ccm.setText("");
        }
    }

    private void cuibicfeettoall() {
        try {
            double cf2ob = Double.parseDouble(num6);
            double cf2uslg = Double.parseDouble(num6);
            double cf2img = Double.parseDouble(num6);
            double cf2lit = Double.parseDouble(num6);
            double cf2milit = Double.parseDouble(num6);
            double cf2ci = Double.parseDouble(num6);
            double cf2cm = Double.parseDouble(num6);
            double cf2ccm = Double.parseDouble(num6);
            double a6, b6, c6, d6, e6, f6, g6, h6;
            a6 = cf2ob * 0.1781;
            b6 = cf2uslg * 7.4805;
            c6 = cf2img * 6.22883288;
            d6 = cf2lit * 28.3168;
            e6 = cf2milit * 28316.8466;
            f6 = cf2ci * 1728;
            g6 = cf2cm * 0.0283;
            h6 = cf2ccm * 28316.8466;
            ob.setText(String.valueOf(a6));
            uslg.setText(String.valueOf(b6));
            img.setText(String.valueOf(c6));
            lit.setText(String.valueOf(d6));
            milit.setText(String.valueOf(e6));
            ci.setText(String.valueOf(f6));
            cm.setText(String.valueOf(g6));
            ccm.setText(String.valueOf(h6));

        } catch (NumberFormatException e) {
            ob.setText("");
            uslg.setText("");
            img.setText("");
            lit.setText("");
            milit.setText("");
            ci.setText("");
            cm.setText("");
            ccm.setText("");
        }
    }

    private void cuibicinchtoall() {
        try {
            double ci2ob = Double.parseDouble(num7);
            double ci2uslg = Double.parseDouble(num7);
            double ci2img = Double.parseDouble(num7);
            double ci2lit = Double.parseDouble(num7);
            double ci2milit = Double.parseDouble(num7);
            double ci2cf = Double.parseDouble(num7);
            double ci2cm = Double.parseDouble(num7);
            double ci2ccm = Double.parseDouble(num7);
            double a7, b7, c7, d7, e7, f7, g7, h7;
            a7 = ci2ob * 0.0001;
            b7 = ci2uslg * 0.004329004328954315;
            c7 = ci2img * 0.00360464866;
            d7 = ci2lit * 0.0164;
            e7 = ci2milit * 16.3871;
            f7 = ci2cf * 0.0005787037037037037;
            g7 = ci2cm * 0.000016387063999810677;
            h7 = ci2ccm * 16.3871;
            ob.setText(String.valueOf(a7));
            uslg.setText(String.valueOf(b7));
            img.setText(String.valueOf(c7));
            lit.setText(String.valueOf(d7));
            milit.setText(String.valueOf(e7));
            cf.setText(String.valueOf(f7));
            cm.setText(String.valueOf(g7));
            ccm.setText(String.valueOf(h7));

        } catch (NumberFormatException e) {
            ob.setText("");
            uslg.setText("");
            img.setText("");
            lit.setText("");
            milit.setText("");
            cf.setText("");
            cm.setText("");
            ccm.setText("");
        }
    }

    private void cuibicmetertoall() {
        try {
            double cm2ob = Double.parseDouble(num8);
            double cm2uslg = Double.parseDouble(num8);
            double cm2img = Double.parseDouble(num8);
            double cm2lit = Double.parseDouble(num8);
            double cm2milit = Double.parseDouble(num8);
            double cm2cf = Double.parseDouble(num8);
            double cm2ci = Double.parseDouble(num8);
            double cm2ccm = Double.parseDouble(num8);
            double a8, b8, c8, d8, e8, f8, g8, h8;
            a8 = cm2ob * 6.2898;
            b8 = cm2uslg * 264.1721;
            c8 = cm2img * 219.969157;
            d8 = cm2lit * 1000;
            e8 = cm2milit * 1000000;
            f8 = cm2cf * 35.3147;
            g8 = cm2ci * 61023.7441;
            h8 = cm2ccm * 1000000;
            ob.setText(String.valueOf(a8));
            uslg.setText(String.valueOf(b8));
            img.setText(String.valueOf(c8));
            lit.setText(String.valueOf(d8));
            milit.setText(String.valueOf(e8));
            cf.setText(String.valueOf(f8));
            ci.setText(String.valueOf(g8));
            ccm.setText(String.valueOf(h8));

        } catch (NumberFormatException e) {
            ob.setText("");
            uslg.setText("");
            img.setText("");
            lit.setText("");
            milit.setText("");
            cf.setText("");
            ci.setText("");
            ccm.setText("");
        }
    }

    private void cuibiccentimetertoall() {
        try {
            double ccm2ob = Double.parseDouble(num9);
            double ccm2uslg = Double.parseDouble(num9);
            double ccm2img = Double.parseDouble(num9);
            double ccm2lit = Double.parseDouble(num9);
            double ccm2milit = Double.parseDouble(num9);
            double ccm2cf = Double.parseDouble(num9);
            double ccm2ci = Double.parseDouble(num9);
            double ccm2cm = Double.parseDouble(num9);
            double a9, b9, c9, d9, e9, f9, g9, h9;
            a9 = ccm2ob * 0.000006289810770293729;
            b9 = ccm2uslg * 0.0002641720523581484;
            c9 = ccm2img * 0.000219969157;
            d9 = ccm2lit * 0.001;
            e9 = ccm2milit * 1;
            f9 = ccm2cf * 0.00003531466672189659;
            g9 = ccm2ci * 0.061;
            h9 = ccm2cm * 0.000001;
            ob.setText(String.valueOf(a9));
            uslg.setText(String.valueOf(b9));
            img.setText(String.valueOf(c9));
            lit.setText(String.valueOf(d9));
            milit.setText(String.valueOf(e9));
            cf.setText(String.valueOf(f9));
            ci.setText(String.valueOf(g9));
            cm.setText(String.valueOf(h9));
        } catch (NumberFormatException e) {
            ob.setText("");
            uslg.setText("");
            img.setText("");
            lit.setText("");
            milit.setText("");
            cf.setText("");
            ci.setText("");
            cm.setText("");
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