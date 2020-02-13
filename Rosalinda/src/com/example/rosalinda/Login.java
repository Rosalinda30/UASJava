package com.example.rosalinda;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity {
	EditText username,password;
	Button btnlogin, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylogin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnexit = (Button) findViewById(R.id.btnexit);
        
        btnexit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Perintah Exit Aplikasi
				finish();
			}
		});
        btnlogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View login) {
				// Perintah Login
				Context context = getApplicationContext();
				 String user = username.getText().toString();
				 String pass = password.getText().toString();
				 if (user.equals("admin") && pass.equals("123")) {
				      setContentView(R.layout.activitymenu);
				      Toast.makeText(context, "Login Berhasil", Toast.LENGTH_SHORT).show();
				 } else {
				 Toast.makeText(context, "Login Gagal", Toast.LENGTH_SHORT).show();
				 }
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
