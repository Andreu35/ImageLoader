package com.are.imageloaderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.are.imageloaderdemo.imageloaderlib.ImageLoader;

public class MainActivity extends AppCompatActivity {

    /* Prepare ImageView */
    private ImageView imageView1, imageView2, imageView3, imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init ImageLoader
        ImageLoader loader = new ImageLoader(this);

        // Init ImageView's
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);

        // Show your images from URL (http;//yourimages  .png/.jpg/.jpeg/ etc...)
        loader.DisplayImage("http://www.planwallpaper.com/static/images/kartandtinki1_photo-wallpapers_02.jpg", imageView1);
        loader.DisplayImage("http://cdn.wallpapersafari.com/33/64/bYaGUh.png", imageView2);
        loader.DisplayImage("http://wallpapercave.com/wp/4EXUTH4.jpg", imageView3);
        loader.DisplayImage("http://artescritorio.com/wp-content/uploads/2011/02/tron-legacy-lightcycle-wallpaper.png", imageView4);

    }
}
