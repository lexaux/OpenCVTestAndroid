package com.augmentari.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class LoggingActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(Utils.TAG, "onDestroy " + getClass().getSimpleName());
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(Utils.TAG, "onDestroy " + getClass().getSimpleName());
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(Utils.TAG, "onPause " + getClass().getSimpleName());
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		Log.i(Utils.TAG, "onPostCreate " + getClass().getSimpleName());

	}

	@Override
	protected void onPostResume() {
		super.onPostResume();
		Log.i(Utils.TAG, "onPostResume " + getClass().getSimpleName());
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(Utils.TAG, "onRestart " + getClass().getSimpleName());
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i(Utils.TAG, "onRestoreInstanceState " + getClass().getSimpleName());

	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(Utils.TAG, "onResume " + getClass().getSimpleName());

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i(Utils.TAG, "onSaveInstanceState " + getClass().getSimpleName());

	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i(Utils.TAG, "onStart " + getClass().getSimpleName());
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(Utils.TAG, "onStop " + getClass().getSimpleName());

	}

}
