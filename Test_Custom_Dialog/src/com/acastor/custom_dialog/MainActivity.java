package com.acastor.custom_dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Dialog d = new Dialog(MainActivity.this);
				d.setContentView(R.layout.dialog);
				d.setTitle("This is important");
				d.show();
				
			}
		});
    }

}
