package com.acastor.network_access;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        final EditText et = (EditText) findViewById(R.id.editText1);
        final Button b = (Button) findViewById(R.id.button1);
        final TextView tv = (TextView) findViewById(R.id.textView1);
         et.setText("https://www.facebook.com");
        
        b.setOnClickListener(new OnClickListener() {
        	
			@Override
			/*
			public void onClick(View v) {
				try {
					
					URL url = null;
					url = new URL(et.getText().toString());
					URLConnection conn = url.openConnection();
					BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String line = "";
					while ((line = reader.readLine()) != null) {
						tv.append(line);
					}
				} catch (Exception e) {
				
					//Log.d("hello", "Failed to do something: " + e.getMessage());
					tv.setText("Consol: "+e.getMessage());
				}
			}
			*/
			
			public void onClick(View v) {
				DefaultHttpClient client = new DefaultHttpClient();
                HttpGet httpGet = new HttpGet(et.getText().toString());
				try {
					HttpResponse execute = client.execute(httpGet);
                    InputStream content = execute.getEntity().getContent();

                    BufferedReader buffer = new BufferedReader(
                            new InputStreamReader(content));
                    String line = "";
                    while ((line = buffer.readLine()) != null) {
                    	tv.append(line);
                    }
				} catch (Exception e) {
					
					//Log.d("hello", "Failed to do something: " + e.getMessage());
					tv.setText("Consol: "+e.getMessage());
				}
			}
		});
    }

}
