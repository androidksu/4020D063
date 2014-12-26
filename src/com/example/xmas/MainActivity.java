package com.example.xmas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView show;
	EditText text1, text2;
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text1 = (EditText) findViewById(R.id.height);
		text2 = (EditText) findViewById(R.id.width);
		button = (Button) findViewById(R.id.test);
		show = (TextView) findViewById(R.id.bmishow);
	}

	public void clac(View view) {
		double height = Double.parseDouble(text1.getText().toString()) / 100;
		double width = Double.parseDouble(text2.getText().toString());

		double BMI = width / (height * height);

		Intent intent=new Intent(this,showbmi.class);
//		String sendbmi=show.getText().toString();
//		intent.putExtra(EXTRA_MESSAGE, sendbmi);
		startActivity(intent);
	}

	
}
