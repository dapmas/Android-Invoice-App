package com.example.intutit_hackbot;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class DuesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dues);
		
		Intent intent = getIntent(); 
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView textview = new TextView(this);
		textview.setTextSize(40);
		textview.setText(message);
		
		setContentView(textview);
	}


}
