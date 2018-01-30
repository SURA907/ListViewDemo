package com.listviewdemo.sura.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Activity01 extends AppCompatActivity {

    ListView lv;
    List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
        lv = findViewById(R.id.lv);

        //数据准备，原谅我为了能挤满一屏而把数据复制了一遍
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_2);
        map.put("tv_appName","美颜相机");
        map.put("tv_appType","摄影摄像");
        map.put("tv_appSize","32.4M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_4);
        map.put("tv_appName","360新闻");
        map.put("tv_appType","新闻资讯");
        map.put("tv_appSize","79.4M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_6);
        map.put("tv_appName","美式桌球");
        map.put("tv_appType","游戏娱乐");
        map.put("tv_appSize","19.6M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_10);
        map.put("tv_appName","千千静听");
        map.put("tv_appType","影音视听");
        map.put("tv_appSize","32.7M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_15);
        map.put("tv_appName","宝可梦go");
        map.put("tv_appType","游戏娱乐");
        map.put("tv_appSize","149.4M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_2);
        map.put("tv_appName","美颜相机");
        map.put("tv_appType","摄影摄像");
        map.put("tv_appSize","32.4M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_4);
        map.put("tv_appName","360新闻");
        map.put("tv_appType","新闻资讯");
        map.put("tv_appSize","79.4M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_6);
        map.put("tv_appName","美式桌球");
        map.put("tv_appType","游戏娱乐");
        map.put("tv_appSize","19.6M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_10);
        map.put("tv_appName","千千静听");
        map.put("tv_appType","影音视听");
        map.put("tv_appSize","32.7M");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img_icon",R.drawable.ic_15);
        map.put("tv_appName","宝可梦go");
        map.put("tv_appType","游戏娱乐");
        map.put("tv_appSize","149.4M");
        list.add(map);

        //实例化自定义适配器
        MyAdapter myAdapter = new MyAdapter(this,list);
        //启动自定义适配器
        lv.setAdapter(myAdapter);
    }
}