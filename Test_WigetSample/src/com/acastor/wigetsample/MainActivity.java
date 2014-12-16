package com.acastor.wigetsample;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;


public class MainActivity extends AppWidgetProvider {

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
	
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		for(int i = 0; i < appWidgetIds.length; i++)
		{
			int appWidgetId = appWidgetIds[i];
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pages/Anthony-A-Castor/899877093359276?ref=hl"));
			PendingIntent pending = PendingIntent.getActivity(context, 0, intent, 0);
			
			RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
			views.setOnClickPendingIntent(R.id.imageButton1, pending);
			
			appWidgetManager.updateAppWidget(appWidgetId, views);
		}
		
	}
}
