package se.mah.kd330a.kd330a_assignment_3_basic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText username, password;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		username = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void login_click(View v) {
		String u = username.getText().toString();
		String p = password.getText().toString();
		Intent loggedin = new Intent(MainActivity.this, LoggedIn.class);
		loggedin.putExtra("username", u);
		loggedin.putExtra("password", p);
		startActivity(loggedin);
		finish();
	}
}
