package com.acastor.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        iv.setBackgroundResource(R.anim.animation);
        AnimationDrawable anim = (AnimationDrawable) iv.getBackground();
		anim.start();
        
        /*
        iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AnimationDrawable anim = (AnimationDrawable) iv.getBackground();
				anim.start();
				
			}
		});
		*/
    }

}
