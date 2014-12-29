package com.example.intutit_hackbot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ContactActivity extends Activity implements OnItemSelectedListener{

	AutoCompleteTextView textView=null;
    private ArrayAdapter<String> adapter;
     
    //These values show in autocomplete
    String item[]={
              "Sampad", "Sampad Medda", "Mukesh", "Mukesh Gupta",
              "Akshay", "Akshay Hegde"
            };
     
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
         
        setContentView(R.layout.activity_contacts);
         
          
        // Initialize AutoCompleteTextView values
         
            // Get AutoCompleteTextView reference from xml
            textView = (AutoCompleteTextView) findViewById(R.id.contact_name);
             
            //Create adapter    
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, item);
             
            textView.setThreshold(1);
             
           //Set adapter to AutoCompleteTextView
            textView.setAdapter(adapter);
            textView.setOnItemSelectedListener(this);
            //textView.setOnItemClickListener(this);
         
           
    }
 
     
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,
            long arg3) {
        // TODO Auto-generated method stub
        //Log.d("AutocompleteContacts", "onItemSelected() position " + position);
    }
 
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
         
        InputMethodManager imm = (InputMethodManager) getSystemService(
                INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
 
    }
 
 
    protected void onResume() {
        super.onResume();
    }
  
    protected void onDestroy() {
        super.onDestroy();
    }
}
