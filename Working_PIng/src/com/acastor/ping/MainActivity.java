package com.acastor.ping;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	EditText edit;
	TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);

	    edit = (EditText)findViewById(R.id.editText1);
	    edit.setText("192.xxx.x.x");
	    text = (TextView)findViewById(R.id.textView1);

	    pingIP();

	}
	InetAddress addr = null;
	Object host;
	
	private void pingIP() {
	Button button = (Button)findViewById(R.id.button1); // HERE ERROR
	     /**Multiple markers at this line
	- Syntax error, insert ")" to complete 
	 MethodInvocation
	- Syntax error, insert ";" to complete Statement
	 - Syntax error, insert "}" to complete ClassBody **/
		 try {
	         
	         
	         addr = InetAddress.getByName(host.toString());
	         addr = InetAddress.getByName(host.toString());
	     } catch (UnknownHostException e) {
	     // TODO Auto-generated catch block
	     e.printStackTrace();
	     }
	
		 
		 try {
	        if(addr.isReachable(5000)) {
	        text.append("\n" + host + " - Respond OK");
	        } else {
	        text.append("\n" + host);
	        }
        } catch (IOException e) {

        	text.append("\n" + e.toString());
        }

		 
	    button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Editable host = edit.getText();
				
			}
	    	
	    }
	     );
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
}
