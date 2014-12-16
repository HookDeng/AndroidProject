package com.acastor.showme;

import android.app.Application;

import com.acastor.showme.ui.MainActivity;
import com.acastor.showme.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

public class ShowMeApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"SjtRFgcPgXduUb0qDcd4jPMtcNwCCLjSSGSx28AA", 
	    	"0dmsWdIQJ8RyeADxBux7zqVUKbVMBXtWioy9yOHB");
	    
	    //PushService.setDefaultPushCallback(this, MainActivity.class);
	    PushService.setDefaultPushCallback(this, MainActivity.class, 
	    		R.drawable.ic_stat_ic_launcher);
	    ParseInstallation.getCurrentInstallation().saveInBackground();
	}
	
	public static void updateParseInstallation(ParseUser user) {
		ParseInstallation installation = ParseInstallation.getCurrentInstallation();
		installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
		installation.saveInBackground();
	}
}
/*
 * 111cast2
 * casterfile*/

/*
 * marlyn
 * marlyn123*/
 