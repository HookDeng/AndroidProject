package com.acastor.textsadspammer;


import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	SendSMS mSender = new SendSMS();
	Button btnSend;
	EditText txtPhonenumber, txtMessage, txtNumberOfSend;
	String stxtPhonenumber,stxtMessage,stxtNumberOfSend;
	int itxtNumberOfSend ;
	Random randomGenerator = new Random();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend = (Button) findViewById(R.id.btnSendnow);
        

   	 	
   	
        
        
        btnSend.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				
				sendNow(v);
			}
		});
    }

    //send it now
    public void sendNow(View v) { 
    	txtPhonenumber = (EditText) findViewById(R.id.txtPhNumber);
        stxtPhonenumber = txtPhonenumber.getText().toString();
        
        txtMessage = (EditText) findViewById(R.id.txtMessage);
        stxtMessage = txtMessage.getText().toString();
        
        txtNumberOfSend = (EditText) findViewById(R.id.txtNumberOfText);
        stxtNumberOfSend = txtNumberOfSend.getText().toString();
    	
    	if(stxtPhonenumber.length() < 4)
		{
    		
			Toast.makeText(this, " You did not enter a the service provider prefix pls Enter 4 digit ex.0915", Toast.LENGTH_SHORT).show();
		    return;
		    
		}
    	else if(stxtMessage.matches(""))
		{
			Toast.makeText(this, "You did not enter a Message", Toast.LENGTH_SHORT).show();
		    return;
		}
    	else if(stxtNumberOfSend.matches(""))
		{
			Toast.makeText(this, "You did not enter a Number Of Send", Toast.LENGTH_SHORT).show();
		    return;
		}
    	else
    	{
    		//myNum = Integer.parseInt(et.getText().toString());
            itxtNumberOfSend = Integer.parseInt(stxtNumberOfSend.toString());
    		for(int x = 0; x < itxtNumberOfSend; x++ ){
    			int randomInt1 = randomGenerator.nextInt(9);
    			int randomInt2 = randomGenerator.nextInt(9);
    			int randomInt3 = randomGenerator.nextInt(9);
    			int randomInt4 = randomGenerator.nextInt(9);
    			int randomInt5 = randomGenerator.nextInt(9);
    			int randomInt6 = randomGenerator.nextInt(9);
    			int randomInt7 = randomGenerator.nextInt(9);
    			String finalPHnumber = stxtPhonenumber+""+randomInt1+randomInt2+randomInt3+randomInt4+randomInt5+randomInt6+randomInt7;
    			
    			//Toast.makeText(this, "This is Number "+ finalPHnumber, Toast.LENGTH_LONG).show();
    		    //return;
    			boolean success = mSender.sendSMSMessage(finalPHnumber,stxtMessage);
    	    	
    			Toast.makeText(this, "Message sent " + (
    	    		success ? "successfully "+ stxtNumberOfSend + " Times" : "unsuccessfully"), 
    	    		Toast.LENGTH_SHORT).show();
    	    		
    		}
    		
    	}
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
        switch (item.getItemId()) {
		case R.id.action_share:
			sharePost();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
    }
    
    private void sharePost() {
		Intent shareIntent = new Intent(Intent.ACTION_SEND);
		shareIntent.setType("text/plain");
		shareIntent.putExtra(Intent.EXTRA_TEXT, "http://www.acastor.com/blog/posts/text-spam");
		startActivity(Intent.createChooser(shareIntent, getString(R.string.share_chooser_title)));
	}
}
