package com.example.mylittlejf;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    public static final String TAG = "OneActivity";

    public  String  Tag="PosLoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.e(Tag,"11111111111");

    }




    //忘记密码
    public  void  ForgetPassword(View view){

        Intent intent = new Intent(LoginActivity.this, ForgetpassActivity.class);
        startActivity(intent);


    }

    //忘记密码
    public  void  SureLogin(View view){

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);

    }

}
