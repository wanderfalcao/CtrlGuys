package com.example.ctrlguys;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void startmainActivity2 (View view){
        Intent mainActivity2 = new Intent(this, EmpresaActivity.class);
        startActivity(mainActivity2);
    }


    public void startpessoaActivity (View view){
        Intent pessoaActivity = new Intent(this, PessoaActivity.class);
        startActivity(pessoaActivity);
    }
    public void startinfoActivity (View view){
        Intent infoActivity = new Intent(this, InfoActivity.class);
        startActivity(infoActivity);
    }


}