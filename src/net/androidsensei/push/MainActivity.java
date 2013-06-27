package net.androidsensei.push;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Parse.initialize(this, "6ImfMxO2CAclxeOihksglva17QDOVd4ayGuiJgJH", 
				"RGXPNIWLRVjqBYrubtjlsN0juQyHmAXUB8EW6dba"); 
		PushService.setDefaultPushCallback(this, MainActivity.class);
		ParseInstallation.getCurrentInstallation().saveInBackground();		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
