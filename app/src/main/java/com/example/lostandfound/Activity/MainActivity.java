 package com.example.lostandfound.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.util.Base64;
import android.content.pm.PackageManager.NameNotFoundException;
import android.app.Activity;


import com.example.lostandfound.R;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

 public class MainActivity extends AppCompatActivity {
     private TextView tv_id, tv_contact;
     private Button btn_reserve;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         tv_id = findViewById(R.id.tv_id);
         tv_contact = findViewById(R.id.tv_contact);
         btn_reserve = (Button) findViewById(R.id.btn_reserve);

         Intent intent = getIntent();
         String customerId = intent.getStringExtra("customerId");
         String customerContact = intent.getStringExtra("customerContact");

         tv_id.setText(customerId);
         tv_contact.setText(customerContact);

         btn_reserve.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view){
                 Intent intent = new Intent(MainActivity.this, ReserveActivity.class);
                 startActivity(intent);

             }
         });
     }

    }
