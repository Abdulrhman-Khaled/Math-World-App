package com.bodykh.mathworld;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        setTitle("Home Page");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // R.menu.mymenu is a reference to an xml file named mymenu.xml which should be inside your res/menu directory.
        // If you don't have res/menu, just create a directory named "menu" inside res
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.mybutton) {
            showCustomDialog();
        }
        return super.onOptionsItemSelected(item);
    }

    public void showCustomDialog() {
        Dialog dialog = new Dialog(homepage.this);
        //We have added a title in the custom layout. So let's disable the default title.
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //The user will be able to cancel the dialog bu clicking anywhere outside the dialog.
        dialog.setCancelable(true);
        //Mention the name of the layout of your custom dialog.
        dialog.setContentView(R.layout.aboutme);
        dialog.show();
    }

    public void facebookbut(View view) {
        Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/abdalrahman.khaled.54"));
        startActivity(i1);
    }

    public void whatsappbut(View view) {
        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/201148472090"));
        startActivity(i2);
    }

    public void instagrambut(View view) {
        Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/bodykh_/"));
        startActivity(i3);
    }

    public void linkedinbut(View view) {
        Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/abdulrhman-khaled-91a3b821a/"));
        startActivity(i4);
    }

    public void callbut(View view) {
        Intent i5 = new Intent(Intent.ACTION_DIAL);
        i5.setData(Uri.parse("tel:+201148472090"));
        startActivity(i5);
    }

    public void calculator_but(View view) {
        startActivity(new Intent(homepage.this, calculator.class));
    }

    public void unitconv_but(View view) {
        startActivity(new Intent(homepage.this, unitconv.class));
    }

    public void mlaws_but(View view) {

        startActivity(new Intent(homepage.this, mathlaws.class));
    }

    public void gmq_but(View view) {
        startActivity(new Intent(homepage.this, geniusmathquestions.class));
    }

}