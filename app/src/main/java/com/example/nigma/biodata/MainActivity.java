package com.example.nigma.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMap(View v){
        Uri uri = Uri.parse("geo:-6.704864,111.061225?q=-6.704864,111.061225");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        it.setPackage("com.google.android.apps.maps");
        startActivity(it);
    }

    public void onCall(View v){
        String phone = "082328252646";
        Uri uri = Uri.parse("tel:"+phone);
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
    public void onEmail(View v){
        Uri uri = Uri.parse("mailto:nigmanugraha@gmaill.com");
        Intent it = new Intent(Intent.ACTION_SENDTO,uri);
        startActivity(it);
    }
}
