package com.acastor.test_slideshow;


import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;


public class MainActivity extends Activity implements OnGestureListener{

	private GestureDetector gd;
	private ImageView img;
	private ImageView img2;
	private ImageView img3;
	private int imageNumber = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Creating GestureDetector Object
		gd = new GestureDetector(this, this);
		//Assiging value to ImageView Object
		img = (ImageView) findViewById(R.id.swipe_image);
		img.setScaleType(ScaleType.FIT_XY);
		//Setting Default Image of the ImageView
		img.setImageResource(R.drawable.image1);
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
		//Swipe Left Check
		if(e1.getX() - e2.getX() > sensitivity){
			//Setting Image Resource to Left_Arrow on Swipe Left
			if(imageNumber == 1){
				Scene2();
				imageNumber += 1;
			}else if(imageNumber == 2){
				Scene3();
			}
			return true;
		}
		//Swipe Right Check
		else if(e2.getX() - e1.getX() > sensitivity){
			//Setting Image Resource to Right_Arrow on Swipe Right
			if(imageNumber == 1){
				Scene1();
			}
			else if(imageNumber == 2){
				Scene2();
				imageNumber -= 1;

			}
			return true;
		}
		else{
			//If some error occurrs, setting again to Default_Image (Actually it will never happen in this case)
			img.setImageResource(R.drawable.image1);
			return true;
		}
	}

	/********************************************************************************************************
	 * Android SDK Created
	 * ********************************************************************************************************/
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
	/********************************************************************************************************
	 * Personal Code
	 * ********************************************************************************************************/
	
	public void Scene1(){
		img.setImageResource(R.drawable.image1);
	}
	
	public void Scene2(){
		img.setImageResource(R.drawable.image2);
	}
	
	public void Scene3(){
		img.setImageResource(R.drawable.image3);
	}
}