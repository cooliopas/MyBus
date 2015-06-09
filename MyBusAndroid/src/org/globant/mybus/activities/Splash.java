package org.globant.mybus.activities;

import org.globant.mybus.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Window;

public class Splash extends ActionBarActivity
{
	/** Duration of wait **/
	private final int SPLASH_DISPLAY_LENGTH = 1000;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle icicle)
	{
		super.onCreate(icicle);
		//getWindow().requestFeature(Window.FEATURE_NO_TITLE);
		getSupportActionBar().hide();
		
		
		setContentView(R.layout.splash);
		
		new Handler().postDelayed(new Runnable()
		{
			@Override
			public void run()
			{
				//Log.d("mybus","paso el splash");
				Intent mainIntent = new Intent(Splash.this, MyBusActivity.class);
				Splash.this.startActivity(mainIntent);
				Splash.this.finish();
			}
		}, SPLASH_DISPLAY_LENGTH);
	}
}
