package com.acastor.camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

	ImageView iv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        iv = (ImageView) findViewById(R.id.imageView1);
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, 0);
				
			}
		});
    }
    
    @Override
    protected void onActivityResult(int arg0, int arg1, Intent arg2) {
    	super.onActivityResult(arg0, arg1, arg2);
    	
    	Bitmap bm = (Bitmap) arg2.getExtras().get("data");
    	iv.setImageBitmap(bm);
    }
}
