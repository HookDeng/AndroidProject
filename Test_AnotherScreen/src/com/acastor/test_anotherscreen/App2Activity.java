package com.acastor.test_anotherscreen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class App2Activity extends Activity {
	 
		Button button;
	 
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main2);
			addListenerOnButton();
		}

		private void addListenerOnButton() {
			final Context context = this;
			 
			button = (Button) findViewById(R.id.button1);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, MainActivity.class);
	                            startActivity(intent);   
	 
				}
	 
			});
			
		}
	 
	}