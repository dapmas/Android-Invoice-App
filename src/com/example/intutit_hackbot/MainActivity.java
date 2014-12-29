package com.example.intutit_hackbot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void start_new_invoice(View view){
    	Intent intent = new Intent(this, ContactActivity.class);
    //	EditText editText = (EditText) findViewById(R.id.edit_message);
  //  	String message = editText.getText().toString();
    //	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	/** Fading Transition Effect */
    	this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    	
    	
    	
    }
    
    public void start_history(View view){
    	Intent intent = new Intent(this, HistoryActivity.class);
    //	EditText editText = (EditText) findViewById(R.id.edit_message);
  //  	String message = editText.getText().toString();
    //	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	
    	
    	
    }
    
    public void start_dues(View view){
    	Intent intent = new Intent(this, DuesActivity.class);
    //	EditText editText = (EditText) findViewById(R.id.edit_message);
  //  	String message = editText.getText().toString();
    //	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    	
    	
    	
    }
}
