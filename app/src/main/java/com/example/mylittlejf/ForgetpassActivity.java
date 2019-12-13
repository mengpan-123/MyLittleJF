package com.example.mylittlejf;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ForgetpassActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassord);

    }

    //忘记密码
    public  void  ReturnBack(View view){
        finish();


        //如果当前的Activity不是主活动，那么执行ﬁnish()方法后，将返回到调用它的那个Activity；否 则，将返回到主屏幕中。

    }
}
