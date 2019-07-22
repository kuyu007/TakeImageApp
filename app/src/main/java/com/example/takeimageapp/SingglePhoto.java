package com.example.takeimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class SingglePhoto extends AppCompatActivity {

    AdapterImage adapterImage;
    ArrayList<String>mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singgle_photo);


        String imgPath = this.getIntent().getExtras().getString("path");
        ImageView imageView = (ImageView) findViewById(R.id.singgle_photo);
        BitmapFactory.Options myBitmap = new BitmapFactory.Options();
        myBitmap.inJustDecodeBounds=false;
        myBitmap.inSampleSize=4;
        myBitmap.inPurgeable=true;
        Bitmap bitmap = BitmapFactory.decodeFile(imgPath, myBitmap);
        imageView.setImageBitmap(bitmap);
    }
}
