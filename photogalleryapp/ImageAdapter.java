package com.example.photogalleryapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mycontext;

    public int[] imgarray = {
        R.drawable.img1, R.drawable.img2,R.drawable.img3, R.drawable.img4,R.drawable.img5, R.drawable.img6,
            R.drawable.img7, R.drawable.img8,R.drawable.img9, R.drawable.img10,R.drawable.img11, R.drawable.img12,
            R.drawable.img13, R.drawable.img14
    };

    public ImageAdapter(Context mycontext) {
        this.mycontext = mycontext;
    }

    @Override
    public int getCount() {
        return imgarray.length;
    }

    @Override
    public Object getItem(int i) {
        return imgarray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imview = new ImageView(mycontext);
        imview.setImageResource(imgarray[i]);
        imview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imview.setLayoutParams(new GridView.LayoutParams(340,340));
        return imview;
    }
}
