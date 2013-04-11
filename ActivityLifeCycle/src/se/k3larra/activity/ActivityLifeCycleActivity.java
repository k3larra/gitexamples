package se.k3larra.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i("LarsActivity","In onCreate");
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	Log.i("LarsActivity","In onDestroy");
    }
    //Inserted by Lars ctrl+space
     @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	Log.i("LarsActivity","In onPause");
    }
     
     @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	Log.i("LarsActivity","In onResume");
    }
   @Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("LarsActivity","In onStop");
	}
}