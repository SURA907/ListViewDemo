package com.listviewdemo.sura.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by SURA on 2018/1/28.
 */

public class MyAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Map<String,Object>> list;
    private ViewHolder viewHolder;
    MyAdapter(Context context, List<Map<String,Object>> list) {
        layoutInflater = LayoutInflater.from(context);
        this.list = list;
    }

    //得到ListView中item的个数
    @Override
    public int getCount() {
        return list.size();
    }

    //得到要生成的item所使用的数据集合
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    //得到要生成的item的id
    @Override
    public long getItemId(int position) {
        return position;
    }

    //得到要生成的view
    @Override
    public View getView(int position, View convertview, ViewGroup viewGroup) {
        //view对象复用机制
        if (convertview == null) {
            viewHolder = new ViewHolder();
            //将convertview与item绑定
            convertview = layoutInflater.inflate(R.layout.item,null);
            //绑定控件
            viewHolder.img_icon = convertview.findViewById(R.id.img_icon);
            viewHolder.tv_appName = convertview.findViewById(R.id.tv_appName);
            viewHolder.tv_appType = convertview.findViewById(R.id.tv_appType);
            viewHolder.tv_appSize = convertview.findViewById(R.id.tv_appSize);
            //将绑定好控件的viewHolder对象作为标签插入convertview
            convertview.setTag(viewHolder);
        } else {
            //取出ViewHolder对象，实现复用
            viewHolder = (ViewHolder) convertview.getTag();
        }

        //设置数据
        viewHolder.img_icon.setImageResource((Integer) list.get(position).get("img_icon"));
        viewHolder.tv_appName.setText((String)list.get(position).get("tv_appName"));
        viewHolder.tv_appType.setText((String)list.get(position).get("tv_appType"));
        viewHolder.tv_appSize.setText((String)list.get(position).get("tv_appSize"));

        return convertview;
    }

    //声明、存储需要用到的控件信息
    public class ViewHolder {
        ImageView img_icon;
        TextView tv_appName,tv_appType,tv_appSize;
    }
}
