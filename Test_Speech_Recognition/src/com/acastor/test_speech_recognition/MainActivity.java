package com.acastor.test_speech_recognition;


import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends Activity implements OnClickListener {

	protected static final int REQUEST_OK = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.button1).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
	Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
	         i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");
	        	 try {
	             startActivityForResult(i, REQUEST_OK);
	         } catch (Exception e) {
	        	 	Toast.makeText(this, "Error initializing speech to text engine.", Toast.LENGTH_LONG).show();
	         }
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	        super.onActivityResult(requestCode, resultCode, data);
	        if (requestCode==REQUEST_OK  && resultCode==RESULT_OK) {
	        		ArrayList<String> thingsYouSaid = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
	        		((TextView)findViewById(R.id.text1)).setText(thingsYouSaid.get(0));
	        }
	    }
}


/*
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}*/
