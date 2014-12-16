package com.acastor.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
    EditText userName;
    TextView tvUserName;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         settings = getPreferences(MODE_PRIVATE);
        
        setPreferences = (Button) findViewById(R.id.setPreferences);
        showPreferences = (Button) findViewById(R.id.showPreferences);
        userName   = (EditText)findViewById(R.id.userName);
        tvUserName = (TextView)findViewById(R.id.textView2);;
        //setting text
        tvUserName.setText("");
        
        //button setting up
        setPreferences.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Log.i(LOGTAG, "Set");
               
               
               SharedPreferences.Editor editor = settings.edit();
               String prefValue = userName.getText().toString();
               editor.putString(USERNAME, prefValue);
               editor.commit();
               tvUserName.setText(prefValue);//"Preference Save");
               
            }
       });
        
        showPreferences.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Log.i(LOGTAG, "Show");
               String prefValue = settings.getString(USERNAME, "Not Found");
               tvUserName.setText(prefValue);
            }
       });
	}
    
}
