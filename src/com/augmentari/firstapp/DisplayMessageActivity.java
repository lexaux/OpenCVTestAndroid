package com.augmentari.firstapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends LoggingActivity {

	public static final String DISPLAY_MESSAGE_KEY = "com.augmentari.firstapp.DisplayMessageActivity.MESSAGE";
	
	private static final String RESTORE_COUNT = "restoreCount";
	
	private int showCount = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);

		String messageToShow = getIntent().getStringExtra(DISPLAY_MESSAGE_KEY);
		if (messageToShow != null) {
			TextView view = (TextView) findViewById(R.id.display_message_text_view);
			view.setText(messageToShow);
		}
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		this.showCount = savedInstanceState.getInt(RESTORE_COUNT) + 1;
		Log.w(Utils.TAG, "Restored state" + showCount + " times");
		super.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		outState.putInt(RESTORE_COUNT, showCount);
		super.onSaveInstanceState(outState);
	}
	
}

