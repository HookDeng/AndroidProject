package com.acastor.preferencesactivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	private static final String LOGTAG = "Logs";
    private static final String USERNAME = "username";
	protected static final Context Context = null;
    private SharedPreferences settings;
    
    //buttons
    Button setPreferences;
    Button showPreferences;
    
    //text
    TextView userName;
    CheckBox  chkImage;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setPreferences = (Button) findViewById(R.id.btnSetPreferences);
        showPreferences = (Button) findViewById(R.id.btnShowPreferences);
        userName   = (TextView)findViewById(R.id.txtUsername);
        chkImage = (CheckBox)findViewById(R.id.chkViewImages);
        
        
        setPreferences.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Log.i(LOGTAG, "Set");
               
               
            }
       });
        
        showPreferences.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Log.i(LOGTAG, "Show");
               
            }
       });
    }
}
