package com.augmentari.firstapp;

import com.googlecode.javacv.FrameGrabber;
import com.googlecode.javacv.FrameGrabber.Exception;
import com.googlecode.javacv.cpp.opencv_core.IplImage;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends LoggingActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onButtonSendClicked(View view) {
		Log.i(Utils.TAG, "Button clicked successfully");
//		try {
//			FrameGrabber frameGrabber = FrameGrabber.createDefault(0);
//			frameGrabber.start();
//	        IplImage grabbedImage = frameGrabber.grab();
//	        int width  = grabbedImage.width();
//	        int height = grabbedImage.height();
//	        IplImage grayImage    = IplImage.create(width, height, .IPL_DEPTH_8U, 1);
//	        IplImage rotatedImage = grabbedImage.clone();
//
//	        // Objects allocated with a create*() or clone() factory method are automatically released
//	        // by the garbage collector, but may still be explicitly released by calling release().
//	        // You shall NOT call cvReleaseImage(), cvReleaseMemStorage(), etc. on objects allocated this way.
//	        CvMemStorage storage = CvMemStorage.create();

//		} catch (Exception e) {
//			e.printStackTrace();
//			Log.e(Utils.TAG, "Error grabbing a frame", e);
//		}
		
		EditText text = (EditText) findViewById(R.id.edit_message_text);
		Intent intent = new Intent(this, FacePreview.class);
		startActivity(intent);
	}
}
