package com.acastor.context_menus;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button b = (Button) findViewById(R.id.button1);
		registerForContextMenu(b);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
	
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.context_menu, menu);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		if(item.getItemId() == R.id.item1)
		{
			Log.d("Option", "Option 1 was clicked");
		}
		else if(item.getItemId() == R.id.item2)
		{
			Log.d("Option", "Option 2 was clicked");
		}
		else if(item.getItemId() == R.id.item3)
		{
			Log.d("Option", "Option 3 was clicked");
		}
		else if(item.getItemId() == R.id.item4)
		{
			Log.d("Option", "Option 4 was clicked");
		}
		else if(item.getItemId() == R.id.item5)
		{
			Log.d("Option", "Option 5 was clicked");
		}
		return super.onContextItemSelected(item);
	}
}
