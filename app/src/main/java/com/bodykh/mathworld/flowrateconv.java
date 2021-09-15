package com.bodykh.mathworld;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class flowrateconv extends AppCompatActivity {
    private EditText edbs1, edbm2, edbh3, edbd4, edgs5, edgm6, edgh7, edgd8, edls9, edlm10, edlh11, edld12, edcms13, edcmm14,
            edcmh15, edcmd16, edcfs17, edcfm18, edcfh19, edcfd20, edcis21, edcim22, edcih23, edcid24, edafs25, edafm26, edafh27, edafd28;
    private String num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14,
            num15, num16, num17, num18, num19, num20, num21, num22, num23, num24, num25, num26, num27, num28;

    DecimalFormat number = new DecimalFormat("##########.#######");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowrateconv);
        setTitle("Flow Rate Converter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        edbs1 = findViewById(R.id.bs1);
        edbm2 = findViewById(R.id.bm2);
        edbh3 = findViewById(R.id.bh3);
        edbd4 = findViewById(R.id.bd4);
        edgs5 = findViewById(R.id.gs5);
        edgm6 = findViewById(R.id.gm6);
        edgh7 = findViewById(R.id.gh7);
        edgd8 = findViewById(R.id.gd8);
        edls9 = findViewById(R.id.ls9);
        edlm10 = findViewById(R.id.lm10);
        edlh11 = findViewById(R.id.lh11);
        edld12 = findViewById(R.id.ld12);
        edcms13 = findViewById(R.id.cms13);
        edcmm14 = findViewById(R.id.cmm14);
        edcmh15 = findViewById(R.id.cmh15);
        edcmd16 = findViewById(R.id.cmd16);
        edcfs17 = findViewById(R.id.cfs17);
        edcfm18 = findViewById(R.id.cfm18);
        edcfh19 = findViewById(R.id.cfh19);
        edcfd20 = findViewById(R.id.cfd20);
        edcis21 = findViewById(R.id.cis21);
        edcim22 = findViewById(R.id.cim22);
        edcih23 = findViewById(R.id.cih23);
        edcid24 = findViewById(R.id.cid24);
        edafs25 = findViewById(R.id.afs25);
        edafm26 = findViewById(R.id.afm26);
        edafh27 = findViewById(R.id.afh27);
        edafd28 = findViewById(R.id.afd28);

        edbs1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num1 = edbs1.getText().toString().trim();
                if (edbs1.isFocused()) {
                    if (num1.length() > 0) {
                        edbs1toall();

                    } else {
                        // edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edbm2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num2 = edbm2.getText().toString().trim();
                if (edbm2.isFocused()) {
                    if (num2.length() > 0) {
                        edbm2toall();
                    } else {
                        edbs1.setText("");
                        //edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edbh3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num3 = edbh3.getText().toString().trim();
                if (edbh3.isFocused()) {
                    if (num3.length() > 0) {
                        edbh3toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        //edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edbd4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num4 = edbd4.getText().toString().trim();
                if (edbd4.isFocused()) {
                    if (num4.length() > 0) {
                        edbd4toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        //edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edgs5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num5 = edgs5.getText().toString().trim();
                if (edgs5.isFocused()) {
                    if (num5.length() > 0) {
                        edgs5toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        //edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edgm6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num6 = edgm6.getText().toString().trim();
                if (edgm6.isFocused()) {
                    if (num6.length() > 0) {
                        edgm6toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        //edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edgh7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num7 = edgh7.getText().toString().trim();
                if (edgh7.isFocused()) {
                    if (num7.length() > 0) {
                        edgh7toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        //edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edgd8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num8 = edgd8.getText().toString().trim();
                if (edgd8.isFocused()) {
                    if (num8.length() > 0) {
                        edgd8toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        //edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edls9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num9 = edls9.getText().toString().trim();
                if (edls9.isFocused()) {
                    if (num9.length() > 0) {
                        edls9toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        //edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edlm10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num10 = edlm10.getText().toString().trim();
                if (edlm10.isFocused()) {
                    if (num10.length() > 0) {
                        edlm10toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        //edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edlh11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num11 = edlh11.getText().toString().trim();
                if (edlh11.isFocused()) {
                    if (num11.length() > 0) {
                        edlh11toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        //edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edld12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num12 = edld12.getText().toString().trim();
                if (edld12.isFocused()) {
                    if (num12.length() > 0) {
                        edld12toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        //edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcms13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num13 = edcms13.getText().toString().trim();
                if (edcms13.isFocused()) {
                    if (num13.length() > 0) {
                        edcms13toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        //edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcmm14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num14 = edcmm14.getText().toString().trim();
                if (edcmm14.isFocused()) {
                    if (num14.length() > 0) {
                        edcmm14toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        //edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcmh15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num15 = edcmh15.getText().toString().trim();
                if (edcmh15.isFocused()) {
                    if (num15.length() > 0) {
                        edcmh15toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        //edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcmd16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num16 = edcmd16.getText().toString().trim();
                if (edcmd16.isFocused()) {
                    if (num16.length() > 0) {
                        edcmd16toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        //edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcfs17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num17 = edcfs17.getText().toString().trim();
                if (edcfs17.isFocused()) {
                    if (num17.length() > 0) {
                        edcfs17toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        //edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcfm18.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num18 = edcfm18.getText().toString().trim();
                if (edcfm18.isFocused()) {
                    if (num18.length() > 0) {
                        edcfm18toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        //edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcfh19.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num19 = edcfh19.getText().toString().trim();
                if (edcfh19.isFocused()) {
                    if (num19.length() > 0) {
                        edcfh19toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        //edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcfd20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num20 = edcfd20.getText().toString().trim();
                if (edcfd20.isFocused()) {
                    if (num20.length() > 0) {
                        edcfd20toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        //edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcis21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num21 = edcis21.getText().toString().trim();
                if (edcis21.isFocused()) {
                    if (num21.length() > 0) {
                        edcis21toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        //edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcim22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num22 = edcim22.getText().toString().trim();
                if (edcim22.isFocused()) {
                    if (num22.length() > 0) {
                        edcim22toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        //edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcih23.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num23 = edcih23.getText().toString().trim();
                if (edcih23.isFocused()) {
                    if (num23.length() > 0) {
                        edcih23toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        //edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edcid24.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num24 = edcid24.getText().toString().trim();
                if (edcid24.isFocused()) {
                    if (num24.length() > 0) {
                        edcid24toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        //edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edafs25.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num25 = edafs25.getText().toString().trim();
                if (edafs25.isFocused()) {
                    if (num25.length() > 0) {
                        edafs25toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        //edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edafm26.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num26 = edafm26.getText().toString().trim();
                if (edafm26.isFocused()) {
                    if (num26.length() > 0) {
                        edafm26toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        //edafm26.setText("");
                        edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edafh27.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num27 = edafh27.getText().toString().trim();
                if (edafh27.isFocused()) {
                    if (num27.length() > 0) {
                        edafh27toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        //edafh27.setText("");
                        edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edafd28.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                num28 = edafd28.getText().toString().trim();
                if (edafd28.isFocused()) {
                    if (num28.length() > 0) {
                        edafd28toall();
                    } else {
                        edbs1.setText("");
                        edbm2.setText("");
                        edbh3.setText("");
                        edbd4.setText("");
                        edgs5.setText("");
                        edgm6.setText("");
                        edgh7.setText("");
                        edgd8.setText("");
                        edls9.setText("");
                        edlm10.setText("");
                        edlh11.setText("");
                        edld12.setText("");
                        edcms13.setText("");
                        edcmm14.setText("");
                        edcmh15.setText("");
                        edcmd16.setText("");
                        edcfs17.setText("");
                        edcfm18.setText("");
                        edcfh19.setText("");
                        edcfd20.setText("");
                        edcis21.setText("");
                        edcim22.setText("");
                        edcih23.setText("");
                        edcid24.setText("");
                        edafs25.setText("");
                        edafm26.setText("");
                        edafh27.setText("");
                        //edafd28.setText("");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void edbs1toall() {
        try {
            double bs2all = Double.parseDouble(num1);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = bs2all * 60;
            x2 = bs2all * 3600;
            x3 = bs2all * 86400;
            x4 = bs2all * 42;
            x5 = bs2all * 2520;
            x6 = bs2all * 151200;
            x7 = bs2all * 3628800;
            x8 = bs2all * 158.987;
            x9 = bs2all * 9539.24;
            x10 = bs2all * 572354.3;
            x11 = bs2all * 13736502.3;
            x12 = bs2all * 0.159;
            x13 = bs2all * 9.5392;
            x14 = bs2all * 572.354;
            x15 = bs2all * 13736.5;
            x16 = bs2all * 5.615;
            x17 = bs2all * 336.9;
            x18 = bs2all * 20213;
            x19 = bs2all * 485100;
            x20 = bs2all * 9702;
            x21 = bs2all * 582120;
            x22 = bs2all * 34927200;
            x23 = bs2all * 838252800;
            x24 = bs2all * 0.0001289;
            x25 = bs2all * 0.007734;
            x26 = bs2all * 0.464;
            x27 = bs2all * 11.14;
            edbm2.setText(String.valueOf(x1));
            edbh3.setText(String.valueOf(x2));
            edbd4.setText(String.valueOf(x3));
            edgs5.setText(String.valueOf(x4));
            edgm6.setText(String.valueOf(x5));
            edgh7.setText(String.valueOf(x6));
            edgd8.setText(String.valueOf(x7));
            edls9.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edbm2toall() {
        try {
            double bm2all = Double.parseDouble(num2);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = bm2all * 0.01667;
            x2 = bm2all * 60;
            x3 = bm2all * 1440;
            x4 = bm2all * 0.7;
            x5 = bm2all * 42;
            x6 = bm2all * 2520;
            x7 = bm2all * 60480;
            x8 = bm2all * 2.65;
            x9 = bm2all * 159;
            x10 = bm2all * 9539;
            x11 = bm2all * 228942;
            x12 = bm2all * 0.00265;
            x13 = bm2all * 0.159;
            x14 = bm2all * 9.539;
            x15 = bm2all * 228.9;
            x16 = bm2all * 0.09358;
            x17 = bm2all * 5.615;
            x18 = bm2all * 336.9;
            x19 = bm2all * 8085;
            x20 = bm2all * 161.7;
            x21 = bm2all * 9702;
            x22 = bm2all * 582120;
            x23 = bm2all * 13970880;
            x24 = bm2all * 0.000002148;
            x25 = bm2all * 0.0001289;
            x26 = bm2all * 0.007734;
            x27 = bm2all * 0.1856;
            edbs1.setText(String.valueOf(x1));
            edbh3.setText(String.valueOf(x2));
            edbd4.setText(String.valueOf(x3));
            edgs5.setText(String.valueOf(x4));
            edgm6.setText(String.valueOf(x5));
            edgh7.setText(String.valueOf(x6));
            edgd8.setText(String.valueOf(x7));
            edls9.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x21));
            edcid24.setText(String.valueOf(x22));
            edafs25.setText(String.valueOf(x23));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edbh3toall() {
        try {
            double bh2all = Double.parseDouble(num3);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = bh2all * 0.0002778;
            x2 = bh2all * 0.01667;
            x3 = bh2all * 24;
            x4 = bh2all * 0.01167;
            x5 = bh2all * 0.7;
            x6 = bh2all * 42;
            x7 = bh2all * 1008;
            x8 = bh2all * 0.04416;
            x9 = bh2all * 2.65;
            x10 = bh2all * 159;
            x11 = bh2all * 3816;
            x12 = bh2all * 0.00004416;
            x13 = bh2all * 0.00265;
            x14 = bh2all * 0.159;
            x15 = bh2all * 3.816;
            x16 = bh2all * 0.00156;
            x17 = bh2all * 0.09358;
            x18 = bh2all * 5.615;
            x19 = bh2all * 134.8;
            x20 = bh2all * 2.695;
            x21 = bh2all * 161.7;
            x22 = bh2all * 9702;
            x23 = bh2all * 232848;
            x24 = bh2all * 0.0000000358;
            x25 = bh2all * 0.000002148;
            x26 = bh2all * 0.0001289;
            x27 = bh2all * 0.003093;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbd4.setText(String.valueOf(x3));
            edgs5.setText(String.valueOf(x4));
            edgm6.setText(String.valueOf(x5));
            edgh7.setText(String.valueOf(x6));
            edgd8.setText(String.valueOf(x7));
            edls9.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edbd4toall() {
        try {
            double bd2all = Double.parseDouble(num4);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = bd2all * 0.00001157;
            x2 = bd2all * 0.0006944;
            x3 = bd2all * 0.04167;
            x4 = bd2all * 0.0004861;
            x5 = bd2all * 0.02917;
            x6 = bd2all * 1.75;
            x7 = bd2all * 42;
            x8 = bd2all * 0.00184;
            x9 = bd2all * 0.1104;
            x10 = bd2all * 6.624;
            x11 = bd2all * 159;
            x12 = bd2all * 0.00000184;
            x13 = bd2all * 0.0001104;
            x14 = bd2all * 0.006624;
            x15 = bd2all * 0.159;
            x16 = bd2all * 0.00006498;
            x17 = bd2all * 0.003899;
            x18 = bd2all * 0.2339;
            x19 = bd2all * 5.615;
            x20 = bd2all * 0.1123;
            x21 = bd2all * 6.738;
            x22 = bd2all * 404.3;
            x23 = bd2all * 9702;
            x24 = bd2all * 0.000000001492;
            x25 = bd2all * 0.00000008951;
            x26 = bd2all * 0.000005371;
            x27 = bd2all * 0.0001289;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edgs5.setText(String.valueOf(x4));
            edgm6.setText(String.valueOf(x5));
            edgh7.setText(String.valueOf(x6));
            edgd8.setText(String.valueOf(x7));
            edls9.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edgs5toall() {
        try {
            double gs2all = Double.parseDouble(num5);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = gs2all * 0.02381;
            x2 = gs2all * 1.429;
            x3 = gs2all * 85.71;
            x4 = gs2all * 2057;
            x5 = gs2all * 60;
            x6 = gs2all * 3600;
            x7 = gs2all * 86400;
            x8 = gs2all * 3.785;
            x9 = gs2all * 227.1;
            x10 = gs2all * 13627;
            x11 = gs2all * 327060;
            x12 = gs2all * 0.003785;
            x13 = gs2all * 0.2271;
            x14 = gs2all * 13.63;
            x15 = gs2all * 327.1;
            x16 = gs2all * 0.1337;
            x17 = gs2all * 8.021;
            x18 = gs2all * 481.3;
            x19 = gs2all * 11550;
            x20 = gs2all * 231;
            x21 = gs2all * 13860;
            x22 = gs2all * 831600;
            x23 = gs2all * 19958400;
            x24 = gs2all * 0.000003069;
            x25 = gs2all * 0.0001841;
            x26 = gs2all * 0.01105;
            x27 = gs2all * 0.2652;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgm6.setText(String.valueOf(x5));
            edgh7.setText(String.valueOf(x6));
            edgd8.setText(String.valueOf(x7));
            edls9.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edgm6toall() {
        try {
            double gm2all = Double.parseDouble(num6);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = gm2all * 0.0003968;
            x2 = gm2all * 0.02381;
            x3 = gm2all * 1.429;
            x4 = gm2all * 34.29;
            x5 = gm2all * 0.01667;
            x6 = gm2all * 60;
            x7 = gm2all * 1440;
            x8 = gm2all * 0.06309;
            x9 = gm2all * 3.785;
            x10 = gm2all * 227.1;
            x11 = gm2all * 5451;
            x12 = gm2all * 0.00006309;
            x13 = gm2all * 0.003785;
            x14 = gm2all * 0.2271;
            x15 = gm2all * 5.451;
            x16 = gm2all * 0.002228;
            x17 = gm2all * 0.1337;
            x18 = gm2all * 8.021;
            x19 = gm2all * 192.5;
            x20 = gm2all * 3.85;
            x21 = gm2all * 231;
            x22 = gm2all * 13860;
            x23 = gm2all * 332640;
            x24 = gm2all * 0.00000005115;
            x25 = gm2all * 0.000003069;
            x26 = gm2all * 0.0001841;
            x27 = gm2all * 0.004419;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgh7.setText(String.valueOf(x6));
            edgd8.setText(String.valueOf(x7));
            edls9.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edgh7toall() {
        try {
            double gm2all = Double.parseDouble(num7);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = gm2all * 0.000006614;
            x2 = gm2all * 0.0003968;
            x3 = gm2all * 0.02381;
            x4 = gm2all * 0.5714;
            x5 = gm2all * 0.0002778;
            x6 = gm2all * 0.01667;
            x7 = gm2all * 24;
            x8 = gm2all * 0.001052;
            x9 = gm2all * 0.06309;
            x10 = gm2all * 3.785;
            x11 = gm2all * 90.85;
            x12 = gm2all * 0.000001052;
            x13 = gm2all * 0.00006309;
            x14 = gm2all * 0.003785;
            x15 = gm2all * 0.09085;
            x16 = gm2all * 0.00003713;
            x17 = gm2all * 0.002228;
            x18 = gm2all * 0.1337;
            x19 = gm2all * 3.208;
            x20 = gm2all * 0.06417;
            x21 = gm2all * 3.85;
            x22 = gm2all * 231;
            x23 = gm2all * 5544;
            x24 = gm2all * 0.0000000008525;
            x25 = gm2all * 0.00000005115;
            x26 = gm2all * 0.000003069;
            x27 = gm2all * 0.00007365;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgd8.setText(String.valueOf(x7));
            edls9.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edgd8toall() {
        try {
            double gd2all = Double.parseDouble(num8);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = gd2all * 0.0000002756;
            x2 = gd2all * 0.00001653;
            x3 = gd2all * 0.0009921;
            x4 = gd2all * 0.02381;
            x5 = gd2all * 0.00001157;
            x6 = gd2all * 0.0006944;
            x7 = gd2all * 0.04167;
            x8 = gd2all * 0.00004381;
            x9 = gd2all * 0.002629;
            x10 = gd2all * 0.1577;
            x11 = gd2all * 3.785;
            x12 = gd2all * 0.00000004381;
            x13 = gd2all * 0.000002629;
            x14 = gd2all * 0.0001577;
            x15 = gd2all * 0.003785;
            x16 = gd2all * 0.000001547;
            x17 = gd2all * 0.00009283;
            x18 = gd2all * 0.00557;
            x19 = gd2all * 0.1337;
            x20 = gd2all * 0.002674;
            x21 = gd2all * 0.1604;
            x22 = gd2all * 9.625;
            x23 = gd2all * 231;
            x24 = gd2all * 0.00000000003552;
            x25 = gd2all * 0.000000002131;
            x26 = gd2all * 0.0000001279;
            x27 = gd2all * 0.000003069;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edls9.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edls9toall() {
        try {
            double ls2all = Double.parseDouble(num9);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = ls2all * 0.00629;
            x2 = ls2all * 0.3774;
            x3 = ls2all * 22.64;
            x4 = ls2all * 543.4;
            x5 = ls2all * 0.2642;
            x6 = ls2all * 15.85;
            x7 = ls2all * 951;
            x8 = ls2all * 22824;
            x9 = ls2all * 60;
            x10 = ls2all * 3600;
            x11 = ls2all * 86400;
            x12 = ls2all * 0.001;
            x13 = ls2all * 0.06;
            x14 = ls2all * 3.6;
            x15 = ls2all * 86.4;
            x16 = ls2all * 0.03531;
            x17 = ls2all * 2.119;
            x18 = ls2all * 127.1;
            x19 = ls2all * 3051;
            x20 = ls2all * 61.02;
            x21 = ls2all * 3661;
            x22 = ls2all * 219685;
            x23 = ls2all * 5272452;
            x24 = ls2all * 0.0000008107;
            x25 = ls2all * 0.00004864;
            x26 = ls2all * 0.002919;
            x27 = ls2all * 0.07005;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edlm10.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edlm10toall() {
        try {
            double lm2all = Double.parseDouble(num10);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = lm2all * 0.0001048;
            x2 = lm2all * 0.00629;
            x3 = lm2all * 0.3774;
            x4 = lm2all * 9.057;
            x5 = lm2all * 0.004403;
            x6 = lm2all * 0.2642;
            x7 = lm2all * 15.85;
            x8 = lm2all * 380.4;
            x9 = lm2all * 0.01667;
            x10 = lm2all * 60;
            x11 = lm2all * 1440;
            x12 = lm2all * 0.00001667;
            x13 = lm2all * 0.001;
            x14 = lm2all * 0.06;
            x15 = lm2all * 1.44;
            x16 = lm2all * 0.0005886;
            x17 = lm2all * 0.03531;
            x18 = lm2all * 2.119;
            x19 = lm2all * 50.85;
            x20 = lm2all * 1.017;
            x21 = lm2all * 61.02;
            x22 = lm2all * 3661;
            x23 = lm2all * 87874;
            x24 = lm2all * 0.00000001351;
            x25 = lm2all * 0.0000008107;
            x26 = lm2all * 0.00004864;
            x27 = lm2all * 0.001167;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlh11.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edlh11toall() {
        try {
            double lh2all = Double.parseDouble(num11);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = lh2all * 0.000001747;
            x2 = lh2all * 0.0001048;
            x3 = lh2all * 0.00629;
            x4 = lh2all * 0.151;
            x5 = lh2all * 0.00007338;
            x6 = lh2all * 0.004403;
            x7 = lh2all * 0.2642;
            x8 = lh2all * 6.34;
            x9 = lh2all * 0.0002778;
            x10 = lh2all * 0.01667;
            x11 = lh2all * 24;
            x12 = lh2all * 0.0000002778;
            x13 = lh2all * 0.00001667;
            x14 = lh2all * 0.001;
            x15 = lh2all * 0.024;
            x16 = lh2all * 0.00000981;
            x17 = lh2all * 0.0005886;
            x18 = lh2all * 0.03531;
            x19 = lh2all * 0.8476;
            x20 = lh2all * 0.01695;
            x21 = lh2all * 1.017;
            x22 = lh2all * 61.02;
            x23 = lh2all * 1465;
            x24 = lh2all * 0.0000000002252;
            x25 = lh2all * 0.00000001351;
            x26 = lh2all * 0.0000008107;
            x27 = lh2all * 0.00001946;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edld12.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edld12toall() {
        try {
            double ld2all = Double.parseDouble(num12);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = ld2all * 0.0000000728;
            x2 = ld2all * 0.000004368;
            x3 = ld2all * 0.0002621;
            x4 = ld2all * 0.00629;
            x5 = ld2all * 0.000003058;
            x6 = ld2all * 0.0001835;
            x7 = ld2all * 0.01101;
            x8 = ld2all * 0.2642;
            x9 = ld2all * 0.00001157;
            x10 = ld2all * 0.0006944;
            x11 = ld2all * 0.04167;
            x12 = ld2all * 0.00000001157;
            x13 = ld2all * 0.0000006944;
            x14 = ld2all * 0.00004167;
            x15 = ld2all * 0.001;
            x16 = ld2all * 0.0000004087;
            x17 = ld2all * 0.00002452;
            x18 = ld2all * 0.001471;
            x19 = ld2all * 0.03531;
            x20 = ld2all * 0.0007063;
            x21 = ld2all * 0.04238;
            x22 = ld2all * 2.543;
            x23 = ld2all * 61.02;
            x24 = ld2all * 0.000000000009383;
            x25 = ld2all * 0.000000000563;
            x26 = ld2all * 0.00000003378;
            x27 = ld2all * 0.0000008107;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edcms13.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcms13toall() {
        try {
            double cms2all = Double.parseDouble(num13);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cms2all * 6.29;
            x2 = cms2all * 377.4;
            x3 = cms2all * 22643;
            x4 = cms2all * 543440;
            x5 = cms2all * 264.2;
            x6 = cms2all * 15850;
            x7 = cms2all * 951019;
            x8 = cms2all * 22824465;
            x9 = cms2all * 1000;
            x10 = cms2all * 60000;
            x11 = cms2all * 3600000;
            x12 = cms2all * 86400000;
            x13 = cms2all * 60;
            x14 = cms2all * 3600;
            x15 = cms2all * 86400;
            x16 = cms2all * 35.31;
            x17 = cms2all * 2119;
            x18 = cms2all * 127133;
            x19 = cms2all * 3051187;
            x20 = cms2all * 61024;
            x21 = cms2all * 3661425;
            x22 = cms2all * 219685480;
            x23 = cms2all * 5272451500L;
            x24 = cms2all * 0.0008107;
            x25 = cms2all * 0.04864;
            x26 = cms2all * 2.919;
            x27 = cms2all * 70.05;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcmm14.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcmm14toall() {
        try {
            double cmm2all = Double.parseDouble(num14);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cmm2all * 0.1048;
            x2 = cmm2all * 6.29;
            x3 = cmm2all * 377.4;
            x4 = cmm2all * 9057;
            x5 = cmm2all * 4.403;
            x6 = cmm2all * 264.2;
            x7 = cmm2all * 15850;
            x8 = cmm2all * 380408;
            x9 = cmm2all * 16.67;
            x10 = cmm2all * 1000;
            x11 = cmm2all * 60000;
            x12 = cmm2all * 1440000;
            x13 = cmm2all * 0.01667;
            x14 = cmm2all * 60;
            x15 = cmm2all * 1440;
            x16 = cmm2all * 0.5886;
            x17 = cmm2all * 35.31;
            x18 = cmm2all * 2119;
            x19 = cmm2all * 50853;
            x20 = cmm2all * 1017;
            x21 = cmm2all * 61024;
            x22 = cmm2all * 3661425;
            x23 = cmm2all * 87874191;
            x24 = cmm2all * 0.00001351;
            x25 = cmm2all * 0.0008107;
            x26 = cmm2all * 0.04864;
            x27 = cmm2all * 1.167;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmh15.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcmh15toall() {
        try {
            double cmh2all = Double.parseDouble(num15);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cmh2all * 0.001747;
            x2 = cmh2all * 0.1048;
            x3 = cmh2all * 6.29;
            x4 = cmh2all * 151;
            x5 = cmh2all * 0.07338;
            x6 = cmh2all * 4.403;
            x7 = cmh2all * 264.2;
            x8 = cmh2all * 6340;
            x9 = cmh2all * 0.2778;
            x10 = cmh2all * 16.67;
            x11 = cmh2all * 1000;
            x12 = cmh2all * 24000;
            x13 = cmh2all * 0.0002778;
            x14 = cmh2all * 0.01667;
            x15 = cmh2all * 24;
            x16 = cmh2all * 0.00981;
            x17 = cmh2all * 0.5886;
            x18 = cmh2all * 35.31;
            x19 = cmh2all * 847.6;
            x20 = cmh2all * 16.95;
            x21 = cmh2all * 1017;
            x22 = cmh2all * 61024;
            x23 = cmh2all * 1464570;
            x24 = cmh2all * 0.0000002252;
            x25 = cmh2all * 0.00001351;
            x26 = cmh2all * 0.0008107;
            x27 = cmh2all * 0.01946;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmd16.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcmd16toall() {
        try {
            double cmd2all = Double.parseDouble(num16);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cmd2all * 0.0000728;
            x2 = cmd2all * 0.004368;
            x3 = cmd2all * 0.2621;
            x4 = cmd2all * 6.29;
            x5 = cmd2all * 0.003058;
            x6 = cmd2all * 0.1835;
            x7 = cmd2all * 11.01;
            x8 = cmd2all * 264.2;
            x9 = cmd2all * 0.01157;
            x10 = cmd2all * 0.6944;
            x11 = cmd2all * 41.67;
            x12 = cmd2all * 1000;
            x13 = cmd2all * 0.00001157;
            x14 = cmd2all * 0.0006944;
            x15 = cmd2all * 0.04167;
            x16 = cmd2all * 0.0004087;
            x17 = cmd2all * 0.02452;
            x18 = cmd2all * 1.471;
            x19 = cmd2all * 35.31;
            x20 = cmd2all * 0.7063;
            x21 = cmd2all * 42.38;
            x22 = cmd2all * 2543;
            x23 = cmd2all * 61024;
            x24 = cmd2all * 0.000000009383;
            x25 = cmd2all * 0.000000563;
            x26 = cmd2all * 0.00003378;
            x27 = cmd2all * 0.0008107;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcfs17.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcfs17toall() {
        try {
            double cfs2all = Double.parseDouble(num17);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cfs2all * 0.1781;
            x2 = cfs2all * 10.69;
            x3 = cfs2all * 641.2;
            x4 = cfs2all * 15388;
            x5 = cfs2all * 7.481;
            x6 = cfs2all * 448.8;
            x7 = cfs2all * 26930;
            x8 = cfs2all * 646317;
            x9 = cfs2all * 28.32;
            x10 = cfs2all * 1699;
            x11 = cfs2all * 101941;
            x12 = cfs2all * 2446576;
            x13 = cfs2all * 0.02832;
            x14 = cfs2all * 1.699;
            x15 = cfs2all * 101.9;
            x16 = cfs2all * 2447;
            x17 = cfs2all * 60;
            x18 = cfs2all * 3600;
            x19 = cfs2all * 86400;
            x20 = cfs2all * 1728;
            x21 = cfs2all * 103680;
            x22 = cfs2all * 6220800;
            x23 = cfs2all * 149299200;
            x24 = cfs2all * 0.00002296;
            x25 = cfs2all * 0.001377;
            x26 = cfs2all * 0.08264;
            x27 = cfs2all * 1.983;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfm18.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcfm18toall() {
        try {
            double cfm2all = Double.parseDouble(num18);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cfm2all * 0.002968;
            x2 = cfm2all * 0.1781;
            x3 = cfm2all * 10.69;
            x4 = cfm2all * 256.5;
            x5 = cfm2all * 0.1247;
            x6 = cfm2all * 7.481;
            x7 = cfm2all * 448.8;
            x8 = cfm2all * 10772;
            x9 = cfm2all * 0.4719;
            x10 = cfm2all * 28.32;
            x11 = cfm2all * 1699;
            x12 = cfm2all * 40776;
            x13 = cfm2all * 0.0004719;
            x14 = cfm2all * 0.02832;
            x15 = cfm2all * 1.699;
            x16 = cfm2all * 40.78;
            x17 = cfm2all * 0.01667;
            x18 = cfm2all * 60;
            x19 = cfm2all * 1440;
            x20 = cfm2all * 28.8;
            x21 = cfm2all * 1728;
            x22 = cfm2all * 103680;
            x23 = cfm2all * 2488320;
            x24 = cfm2all * 0.0000003826;
            x25 = cfm2all * 0.00002296;
            x26 = cfm2all * 0.001377;
            x27 = cfm2all * 0.03306;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfh19.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcfh19toall() {
        try {
            double cfh2all = Double.parseDouble(num19);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cfh2all * 0.00004947;
            x2 = cfh2all * 0.002968;
            x3 = cfh2all * 0.1781;
            x4 = cfh2all * 4.275;
            x5 = cfh2all * 0.002078;
            x6 = cfh2all * 0.1247;
            x7 = cfh2all * 7.481;
            x8 = cfh2all * 179.5;
            x9 = cfh2all * 0.007866;
            x10 = cfh2all * 0.4719;
            x11 = cfh2all * 28.32;
            x12 = cfh2all * 679.6;
            x13 = cfh2all * 0.000007866;
            x14 = cfh2all * 0.0004719;
            x15 = cfh2all * 0.02832;
            x16 = cfh2all * 0.6796;
            x17 = cfh2all * 0.0002778;
            x18 = cfh2all * 0.01667;
            x19 = cfh2all * 24;
            x20 = cfh2all * 0.48;
            x21 = cfh2all * 28.8;
            x22 = cfh2all * 1728;
            x23 = cfh2all * 41472;
            x24 = cfh2all * 0.000000006377;
            x25 = cfh2all * 0.0000003826;
            x26 = cfh2all * 0.00002296;
            x27 = cfh2all * 0.000551;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfd20.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcfd20toall() {
        try {
            double cfd2all = Double.parseDouble(num20);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cfd2all * 0.000002061;
            x2 = cfd2all * 0.0001237;
            x3 = cfd2all * 0.007421;
            x4 = cfd2all * 0.1781;
            x5 = cfd2all * 0.00008658;
            x6 = cfd2all * 0.005195;
            x7 = cfd2all * 0.3117;
            x8 = cfd2all * 7.481;
            x9 = cfd2all * 0.0003277;
            x10 = cfd2all * 0.01966;
            x11 = cfd2all * 1.18;
            x12 = cfd2all * 28.32;
            x13 = cfd2all * 0.0000003277;
            x14 = cfd2all * 0.00001966;
            x15 = cfd2all * 0.00118;
            x16 = cfd2all * 0.02832;
            x17 = cfd2all * 0.00001157;
            x18 = cfd2all * 0.0006944;
            x19 = cfd2all * 0.04167;
            x20 = cfd2all * 0.02;
            x21 = cfd2all * 1.2;
            x22 = cfd2all * 72;
            x23 = cfd2all * 1728;
            x24 = cfd2all * 0.0000000002657;
            x25 = cfd2all * 0.00000001594;
            x26 = cfd2all * 0.0000009565;
            x27 = cfd2all * 0.00002296;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcis21.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcis21toall() {
        try {
            double cis2all = Double.parseDouble(num21);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cis2all * 0.0001031;
            x2 = cis2all * 0.006184;
            x3 = cis2all * 0.3711;
            x4 = cis2all * 8.905;
            x5 = cis2all * 0.004329;
            x6 = cis2all * 0.2597;
            x7 = cis2all * 15.58;
            x8 = cis2all * 374;
            x9 = cis2all * 0.01639;
            x10 = cis2all * 0.9832;
            x11 = cis2all * 58.99;
            x12 = cis2all * 1416;
            x13 = cis2all * 0.00001639;
            x14 = cis2all * 0.0009832;
            x15 = cis2all * 0.05899;
            x16 = cis2all * 1.416;
            x17 = cis2all * 0.0005787;
            x18 = cis2all * 0.03472;
            x19 = cis2all * 2.083;
            x20 = cis2all * 50;
            x21 = cis2all * 60;
            x22 = cis2all * 3600;
            x23 = cis2all * 86400;
            x24 = cis2all * 0.00000001329;
            x25 = cis2all * 0.0000007971;
            x26 = cis2all * 0.00004783;
            x27 = cis2all * 0.001148;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcfd20.setText(String.valueOf(x20));
            edcim22.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcim22toall() {
        try {
            double cim2all = Double.parseDouble(num22);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cim2all * 0.000001718;
            x2 = cim2all * 0.0001031;
            x3 = cim2all * 0.006184;
            x4 = cim2all * 0.1484;
            x5 = cim2all * 0.00007215;
            x6 = cim2all * 0.004329;
            x7 = cim2all * 0.2597;
            x8 = cim2all * 6.234;
            x9 = cim2all * 0.0002731;
            x10 = cim2all * 0.01639;
            x11 = cim2all * 0.9832;
            x12 = cim2all * 23.6;
            x13 = cim2all * 0.0000002731;
            x14 = cim2all * 0.00001639;
            x15 = cim2all * 0.0009832;
            x16 = cim2all * 0.0236;
            x17 = cim2all * 0.000009645;
            x18 = cim2all * 0.0005787;
            x19 = cim2all * 0.03472;
            x20 = cim2all * 0.8333;
            x21 = cim2all * 0.01667;
            x22 = cim2all * 60;
            x23 = cim2all * 1440;
            x24 = cim2all * 0.0000000002214;
            x25 = cim2all * 0.00000001329;
            x26 = cim2all * 0.0000007971;
            x27 = cim2all * 0.00001913;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcfd20.setText(String.valueOf(x20));
            edcis21.setText(String.valueOf(x21));
            edcih23.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcih23toall() {
        try {
            double cih2all = Double.parseDouble(num23);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cih2all * 0.00000002863;
            x2 = cih2all * 0.000001718;
            x3 = cih2all * 0.0001031;
            x4 = cih2all * 0.002474;
            x5 = cih2all * 0.000001203;
            x6 = cih2all * 0.00007215;
            x7 = cih2all * 0.004329;
            x8 = cih2all * 0.1039;
            x9 = cih2all * 0.000004552;
            x10 = cih2all * 0.0002731;
            x11 = cih2all * 0.01639;
            x12 = cih2all * 0.3933;
            x13 = cih2all * 0.000000004552;
            x14 = cih2all * 0.0000002731;
            x15 = cih2all * 0.00001639;
            x16 = cih2all * 0.0003933;
            x17 = cih2all * 0.0000001608;
            x18 = cih2all * 0.000009645;
            x19 = cih2all * 0.0005787;
            x20 = cih2all * 0.01389;
            x21 = cih2all * 0.0002778;
            x22 = cih2all * 0.01667;
            x23 = cih2all * 24;
            x24 = cih2all * 0.00000000000369;
            x25 = cih2all * 0.0000000002214;
            x26 = cih2all * 0.00000001329;
            x27 = cih2all * 0.0000003188;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcfd20.setText(String.valueOf(x20));
            edcis21.setText(String.valueOf(x21));
            edcim22.setText(String.valueOf(x22));
            edcid24.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edcid24toall() {
        try {
            double cid2all = Double.parseDouble(num24);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = cid2all * 0.000000001193;
            x2 = cid2all * 0.00000007158;
            x3 = cid2all * 0.000004295;
            x4 = cid2all * 0.0001031;
            x5 = cid2all * 0.0000000501;
            x6 = cid2all * 0.000003006;
            x7 = cid2all * 0.0001804;
            x8 = cid2all * 0.004329;
            x9 = cid2all * 0.0000001897;
            x10 = cid2all * 0.00001138;
            x11 = cid2all * 0.0006828;
            x12 = cid2all * 0.01639;
            x13 = cid2all * 0.0000000001897;
            x14 = cid2all * 0.00000001138;
            x15 = cid2all * 0.0000006828;
            x16 = cid2all * 0.00001639;
            x17 = cid2all * 0.000000006698;
            x18 = cid2all * 0.0000004019;
            x19 = cid2all * 0.00002411;
            x20 = cid2all * 0.0005787;
            x21 = cid2all * 0.00001157;
            x22 = cid2all * 0.0006944;
            x23 = cid2all * 0.04167;
            x24 = cid2all * 0.0000000000001538;
            x25 = cid2all * 0.000000000009226;
            x26 = cid2all * 0.0000000005536;
            x27 = cid2all * 0.00000001329;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcfd20.setText(String.valueOf(x20));
            edcis21.setText(String.valueOf(x21));
            edcim22.setText(String.valueOf(x22));
            edcih23.setText(String.valueOf(x23));
            edafs25.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edafs25toall() {
        try {
            double afs2all = Double.parseDouble(num25);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = afs2all * 7758;
            x2 = afs2all * 465502;
            x3 = afs2all * 27930122;
            x4 = afs2all * 670322940;
            x5 = afs2all * 325851;
            x6 = afs2all * 19551086;
            x7 = afs2all * 1173065100;
            x8 = afs2all * 28153563000L;
            x9 = afs2all * 1233482;
            x10 = afs2all * 74008908;
            x11 = afs2all * 4440534603L;
            x12 = afs2all * 106572830284L;
            x13 = afs2all * 1233;
            x14 = afs2all * 74009;
            x15 = afs2all * 4440535;
            x16 = afs2all * 106572830;
            x17 = afs2all * 43560;
            x18 = afs2all * 2613600;
            x19 = afs2all * 156816000;
            x20 = afs2all * 3763584000L;
            x21 = afs2all * 75271680;
            x22 = afs2all * 4516300800L;
            x23 = afs2all * 270978050000L;
            x24 = afs2all * 6503473200000L;
            x25 = afs2all * 60;
            x26 = afs2all * 3600;
            x27 = afs2all * 86400;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcfd20.setText(String.valueOf(x20));
            edcis21.setText(String.valueOf(x21));
            edcim22.setText(String.valueOf(x22));
            edcih23.setText(String.valueOf(x23));
            edcid24.setText(String.valueOf(x24));
            edafm26.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafm26.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edafm26toall() {
        try {
            double afm2all = Double.parseDouble(num26);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = afm2all * 129.3;
            x2 = afm2all * 7758;
            x3 = afm2all * 465502;
            x4 = afm2all * 11172049;
            x5 = afm2all * 5431;
            x6 = afm2all * 325851;
            x7 = afm2all * 19551086;
            x8 = afm2all * 469226060;
            x9 = afm2all * 20558;
            x10 = afm2all * 1233482;
            x11 = afm2all * 74008908;
            x12 = afm2all * 1776213857;
            x13 = afm2all * 20.56;
            x14 = afm2all * 1233;
            x15 = afm2all * 74009;
            x16 = afm2all * 1776214;
            x17 = afm2all * 726;
            x18 = afm2all * 43560;
            x19 = afm2all * 2613600;
            x20 = afm2all * 62726400;
            x21 = afm2all * 1254528;
            x22 = afm2all * 75271680;
            x23 = afm2all * 4516300800L;
            x24 = afm2all * 108391220000L;
            x25 = afm2all * 0.01667;
            x26 = afm2all * 60;
            x27 = afm2all * 1440;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcfd20.setText(String.valueOf(x20));
            edcis21.setText(String.valueOf(x21));
            edcim22.setText(String.valueOf(x22));
            edcih23.setText(String.valueOf(x23));
            edcid24.setText(String.valueOf(x24));
            edafs25.setText(String.valueOf(x25));
            edafh27.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafh27.setText("");
            edafd28.setText("");
        }
    }

    private void edafh27toall() {
        try {
            double afh2all = Double.parseDouble(num27);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = afh2all * 2.155;
            x2 = afh2all * 129.3;
            x3 = afh2all * 7758;
            x4 = afh2all * 186201;
            x5 = afh2all * 90.51;
            x6 = afh2all * 5431;
            x7 = afh2all * 325851;
            x8 = afh2all * 7820434;
            x9 = afh2all * 342.6;
            x10 = afh2all * 20558;
            x11 = afh2all * 1233482;
            x12 = afh2all * 29603564;
            x13 = afh2all * 0.3426;
            x14 = afh2all * 20.56;
            x15 = afh2all * 1233;
            x16 = afh2all * 29604;
            x17 = afh2all * 12.1;
            x18 = afh2all * 726;
            x19 = afh2all * 43560;
            x20 = afh2all * 1045440;
            x21 = afh2all * 20909;
            x22 = afh2all * 1254528;
            x23 = afh2all * 75271680;
            x24 = afh2all * 1806520300;
            x25 = afh2all * 0.0002778;
            x26 = afh2all * 0.01667;
            x27 = afh2all * 24;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcfd20.setText(String.valueOf(x20));
            edcis21.setText(String.valueOf(x21));
            edcim22.setText(String.valueOf(x22));
            edcih23.setText(String.valueOf(x23));
            edcid24.setText(String.valueOf(x24));
            edafs25.setText(String.valueOf(x25));
            edafm26.setText(String.valueOf(x26));
            edafd28.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafd28.setText("");
        }
    }

    private void edafd28toall() {
        try {
            double afd2all = Double.parseDouble(num28);
            double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27;
            x1 = afd2all * 0.0898;
            x2 = afd2all * 5.388;
            x3 = afd2all * 323.3;
            x4 = afd2all * 7758;
            x5 = afd2all * 3.771;
            x6 = afd2all * 226.3;
            x7 = afd2all * 13577;
            x8 = afd2all * 325851;
            x9 = afd2all * 14.28;
            x10 = afd2all * 856.6;
            x11 = afd2all * 51395;
            x12 = afd2all * 1233482;
            x13 = afd2all * 0.01428;
            x14 = afd2all * 0.8566;
            x15 = afd2all * 51.4;
            x16 = afd2all * 1233;
            x17 = afd2all * 0.5042;
            x18 = afd2all * 30.25;
            x19 = afd2all * 1815;
            x20 = afd2all * 43560;
            x21 = afd2all * 871.2;
            x22 = afd2all * 52272;
            x23 = afd2all * 3136320;
            x24 = afd2all * 75271680;
            x25 = afd2all * 0.00001157;
            x26 = afd2all * 0.0006944;
            x27 = afd2all * 0.04167;
            edbs1.setText(String.valueOf(x1));
            edbm2.setText(String.valueOf(x2));
            edbh3.setText(String.valueOf(x3));
            edbd4.setText(String.valueOf(x4));
            edgs5.setText(String.valueOf(x5));
            edgm6.setText(String.valueOf(x6));
            edgh7.setText(String.valueOf(x7));
            edgd8.setText(String.valueOf(x8));
            edls9.setText(String.valueOf(x9));
            edlm10.setText(String.valueOf(x10));
            edlh11.setText(String.valueOf(x11));
            edld12.setText(String.valueOf(x12));
            edcms13.setText(String.valueOf(x13));
            edcmm14.setText(String.valueOf(x14));
            edcmh15.setText(String.valueOf(x15));
            edcmd16.setText(String.valueOf(x16));
            edcfs17.setText(String.valueOf(x17));
            edcfm18.setText(String.valueOf(x18));
            edcfh19.setText(String.valueOf(x19));
            edcfd20.setText(String.valueOf(x20));
            edcis21.setText(String.valueOf(x21));
            edcim22.setText(String.valueOf(x22));
            edcih23.setText(String.valueOf(x23));
            edcid24.setText(String.valueOf(x24));
            edafs25.setText(String.valueOf(x25));
            edafm26.setText(String.valueOf(x26));
            edafh27.setText(String.valueOf(x27));
        } catch (NumberFormatException e) {
            edbs1.setText("");
            edbm2.setText("");
            edbh3.setText("");
            edbd4.setText("");
            edgs5.setText("");
            edgm6.setText("");
            edgh7.setText("");
            edgd8.setText("");
            edls9.setText("");
            edlm10.setText("");
            edlh11.setText("");
            edld12.setText("");
            edcms13.setText("");
            edcmm14.setText("");
            edcmh15.setText("");
            edcmd16.setText("");
            edcfs17.setText("");
            edcfm18.setText("");
            edcfh19.setText("");
            edcfd20.setText("");
            edcis21.setText("");
            edcim22.setText("");
            edcih23.setText("");
            edcid24.setText("");
            edafs25.setText("");
            edafm26.setText("");
            edafh27.setText("");
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


////////////////