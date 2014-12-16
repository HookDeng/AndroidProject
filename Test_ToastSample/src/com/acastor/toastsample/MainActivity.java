package com.acastor.toastsample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast toast = Toast.makeText(MainActivity.this, "This is a toast", 5000);
				toast.setGravity(Gravity.BOTTOM, 0, 100);
				toast.show();
			}
		});
    }
}
