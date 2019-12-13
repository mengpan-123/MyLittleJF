package com.example.mylittlejf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mylittlejf.GridView.GridViewActivity;
import com.example.mylittlejf.GridView.MyGridView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "OneActivity";


    private Integer[] picture = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,R.drawable.img5 };

    private Integer[] text = {1,2,3,4,5 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        GridView gridView= (GridView)findViewById(R.id.gridView);//获取布局文件中的GridView组件
        gridView.setAdapter(new ImageAdapter(this));           //调用ImageAdapter



        GridView secgridView= (GridView)findViewById(R.id.secgridView);
        secgridView.setAdapter(new MyGridView(MainActivity.this));


    }


    //初始化一个表格容器
    public class ImageAdapter extends BaseAdapter {

        private Context mContext;                 //获取上下文
          public ImageAdapter(Context c){
          mContext=c;
          }
        @Override
          public  int getCount(){
              return picture.length;
          }

        @Override
        public Object getItem(int position) {
              return null;
          }



        @Override
        public long getItemId(int position) {
              return 0;
          }
          @Override
          public View getView(int position, View convertView, ViewGroup parent) {
              ImageView imageView;
              if (convertView == null) {                //判断传过来的值是否为空
                  imageView = new ImageView(mContext);//创建ImageView组件
                  imageView.setLayoutParams(new GridView.LayoutParams(100, 100));//为组件设置宽高
                  imageView.setScaleType(ImageView.ScaleType.CENTER_CROP); //选择图片铺设方式
              } else {
                  imageView = (ImageView) convertView;
              }

              imageView.setImageResource(picture[position]);//将获取图片放到ImageView组件中
              return imageView;                          //返回ImageView

          }
    }

}
