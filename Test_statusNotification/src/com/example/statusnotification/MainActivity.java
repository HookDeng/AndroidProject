package com.example.statusnotification;

import com.milk.statusnotification.R;

import android.support.v7.app.ActionBarActivity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //log
        //Log.d("This is a log", null);
        
        //botton notification
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
				Notification notify = new Notification(android.R.drawable.stat_notify_more, "This is important",System.currentTimeMillis());
				Context context = MainActivity.this;
				CharSequence title = "You have been notified";
				CharSequence details = "Continue with what you were";
				Intent intent = new Intent(context, MainActivity.class);
				PendingIntent pending = PendingIntent.getActivity(context, 0, intent, 0);
				notify.setLatestEventInfo(context, title, details, pending);
				nm.notify(0,notify);
			}
		});
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
