package se.mah.kd330a.kd330a_assignment_3_basic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoggedIn extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loggedin);
		//Ok get the load	
		String username = getIntent().getStringExtra("username");
		String password = getIntent().getStringExtra("password");
        
		TextView usr = (TextView) findViewById(R.id.with_username);
		
		usr.setText(getString(R.string.hello) + username);
		TextView pwd = (TextView) findViewById(R.id.with_password);
		pwd.setText(getString(R.string.yourpassword) + password);
	}

	public void click_logout(View v) {
		Intent i = new Intent(this,MainActivity.class);
		startActivity(i);
		finish();
	}
}
