package com.acastor.progress;

import android.app.ProgressDialog;
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
        
        final ProgressDialog pd = new ProgressDialog(this);
        //pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setMessage("Just wait...");
        pd.setIndeterminate(false);
        pd.setCancelable(true);
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pd.show();
				pd.setProgress(50);
			}
		});
    }
}
