package com.acastor.swipegesturestutorial;

import com.example.swipegesturestutorial.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.ImageView;

public class SwipeGestures extends Activity implements OnGestureListener{

	private GestureDetector gd;
	private ImageView img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_swipe_gestures);

		//Creating GestureDetector Object
		gd = new GestureDetector(this, this);
		//Assiging value to ImageView Object
		img = (ImageView) findViewById(R.id.swipe_image);
		//Setting Default Image of the ImageView
		img.setImageResource(R.drawable.default_img);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.swipe_gestures, menu);
		return true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
	
		//Registering TouchEvent with GestureDetector
		return gd.onTouchEvent(event);
	}

	@Override
	public void onBackPressed() {
		
		//Destroying Activity
		finish();
	}
	
	@Override
	public boolean onDown(MotionEvent arg0) {
	
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
	
		//Defining Sensitivity
		float sensitivity = 50;
		//Swipe Up Check
		if(e1.getY() - e2.getY() > sensitivity){
			//Setting Image Resource to Up_Arrow on Swipe Up
			img.setImageResource(R.drawable.up_arrow);
			return true;
		}
		//Swipe Down Check
		else if(e2.getY() - e1.getY() > sensitivity){
			//Setting Image Resource to Down_Arrow on Swipe Down
			img.setImageResource(R.drawable.down_arrow);
			return true;
		}
		//Swipe Left Check
		else if(e1.getX() - e2.getX() > sensitivity){
			//Setting Image Resource to Left_Arrow on Swipe Left
			img.setImageResource(R.drawable.left_arrow);
			return true;
		}
		//Swipe Right Check
		else if(e2.getX() - e1.getX() > sensitivity){
			//Setting Image Resource to Right_Arrow on Swipe Right
			img.setImageResource(R.drawable.right_arrow);
			return true;
		}
		else{
			//If some error occurrs, setting again to Default_Image (Actually it will never happen in this case)
			img.setImageResource(R.drawable.default_img);
			return true;
		}
	}

	@Override
	public void onLongPress(MotionEvent arg0) {
	
		
	}

	@Override
	public boolean onScroll(MotionEvent arg0, MotionEvent arg1, float arg2,
			float arg3) {
	
		return false;
	}

	@Override
	public void onShowPress(MotionEvent arg0) {
	
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent arg0) {
		
		return false;
	}

}