package com.example.mylittlejf.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mylittlejf.R;

public class MyGridView   extends BaseAdapter {

    private Integer[] picture = {R.drawable.c_1, R.drawable.c_2,R.drawable.c_3,R.drawable.c_4,R.drawable.c_5,
                                 R.drawable.c_6,R.drawable.c_7,R.drawable.c_8,R.drawable.c_9,R.drawable.c_10};

    private Integer[] text = {R.string.c1,R.string.c2,R.string.c3,R.string.c4,R.string.c5,
            R.string.c6,R.string.c7,R.string.c8,R.string.c9,R.string.c10};


    //声明引用
    private Context mContext;   //这个Context类型的变量用于第三方图片加载时用到
    private LayoutInflater mlayoutInflater;
    //创建一个构造函数
    public MyGridView(Context context){
        this.mContext=context;
        //利用LayoutInflate把控件所在的布局文件加载到当前类中
        mlayoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10; //GridView的数目总共10个
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //写一个静态的class,把layout_grid_item的控件转移过来使用
    static class ViewHolder{
        public ImageView Grid_imageview;
        public TextView Grid_textview;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();

        if(convertView == null){
            //填写ListView的图标和标题等控件的来源，来自于layout_list_item这个布局文件
            //把控件所在的布局文件加载到当前类中
            convertView = mlayoutInflater.inflate(R.layout.activity_listforgridview,null);

            //获取控件对象
            holder.Grid_imageview=convertView.findViewById(R.id.grid_IV_Id);  //这两个是适用于新作界面，加载到 Grid View中的
            holder.Grid_textview=convertView.findViewById(R.id.grid_TV_Id);
            convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        //修改空间属性
        holder.Grid_textview.setText(text[position]);
        //加载第三方网络图片
        //Glide.with(mContext).load("http://pic.yesky.com/uploadImages/2013/203/37F142RUD672.jpg").into(holder.Grid_imageview);
        holder.Grid_imageview.setImageResource(picture[position]);//将获取图片放到ImageView组件中

        return convertView;
    }

}
