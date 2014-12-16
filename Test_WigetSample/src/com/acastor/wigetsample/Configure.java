package com.acastor.wigetsample;

import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RemoteViews;

public class Configure extends Activity {

	private Configure context;
	private int WidgetId;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.configure);
		
		setResult(RESULT_CANCELED);
		context = this;
		
		Bundle extras = getIntent().getExtras();
		if(extras != null)
		{
			WidgetId = extras.getInt(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
		}
		
		final AppWidgetManager widgetManager = AppWidgetManager.getInstance(context);
		final RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
		
		final EditText et = (EditText) findViewById(R.id.editText1);
		Button b = (Button) findViewById(R.id.button1);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(et.getText().toString()));
				PendingIntent pending = PendingIntent.getActivity(context, 0, intent, 0);
				views.setOnClickPendingIntent(R.id.imageButton1, pending);
				widgetManager.updateAppWidget(WidgetId, views);
				
				Intent resultValue = new Intent();
				resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, WidgetId);
				setResult(RESULT_OK, resultValue);
				finish();
			}
		});
	}
}
